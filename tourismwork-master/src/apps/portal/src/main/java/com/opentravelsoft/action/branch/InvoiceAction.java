package com.opentravelsoft.action.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opentravelsoft.common.SessionKeyParams;
import com.opentravelsoft.entity.Booking;
import com.opentravelsoft.entity.finance.Invoice;
import com.opentravelsoft.entity.finance.InvoiceItem;
import com.opentravelsoft.entity.finance.InvoicePiece;
import com.opentravelsoft.entity.finance.Income;
import com.opentravelsoft.service.finance.InvoiceService;
import com.opentravelsoft.service.order.BookingService;
import com.opentravelsoft.webapp.action.PortalAction;

/**
 * 填写发票
 * 
 * @author <a herf="mailto:zhangsitao@gmail.com">Steven Zhang</a>
 */
public class InvoiceAction extends PortalAction {
  private static final long serialVersionUID = -8607586773699795330L;

  @Autowired
  private InvoiceService invoiceService;

  @Autowired
  private BookingService bookService;

  /** 订单编号编号 */
  private String reserveNo;

  /** 支付订单号 */
  private String orderNo;

  private Invoice invoice;

  private List<InvoiceItem> items = new ArrayList<InvoiceItem>();

  private List<InvoicePiece> pieces = new ArrayList<InvoicePiece>();

  public String input() {
    invoice = new Invoice();

    // 订单
    Booking book = bookService.roGetReserve(reserveNo);

    // 付款记录
    Income payment = null;

    for (Income item : book.getPayments()) {
      if (item.getBookingNo().equals(orderNo))
        payment = item;
    }

    if (null == payment)
      addActionError("付款记录不存在");

    ActionContext.getContext().getSession()
        .put(SessionKeyParams.EBIZ_CURRENT_BOOKING, book);
    ActionContext.getContext().getSession()
        .put(SessionKeyParams.EBIZ_CURRENT_PAYMENT, payment);

    if (items.size() == 0)
      for (int i = 0; i < 4; i++) {
        InvoiceItem item = new InvoiceItem();
        item.setId(i);
        items.add(item);
      }

    if (pieces.size() == 0)
      for (int i = 0; i < 5; i++) {
        InvoicePiece piece = new InvoicePiece();
        piece.setId(i);
        pieces.add(piece);
      }

    // 备注栏填写 线路名，出团时间
    invoice.setRemarks("旅游线路:" + book.getPlan().getLine().getLineName()
        + " 人数:" + book.getPax());

    return INPUT;
  }

  @Override
  public void validate() {
    Income payment = (Income) ActionContext.getContext().getSession()
        .get(SessionKeyParams.EBIZ_CURRENT_PAYMENT);

    BigDecimal pay = new BigDecimal(0);
    for (InvoiceItem item : items) {
      pay = pay.add(item.getExpense());
    }

    if (pay.compareTo(payment.getAmount()) > 0) {
      addActionError("发票付款项目总额大于付款额.");
    } else if (pay.doubleValue() == 0) {
      addActionError("发票付款项目总额为零.");
    }

    BigDecimal block = new BigDecimal(0);
    for (InvoicePiece piece : pieces) {
      block = block.add(piece.getAmount());
    }
    if (block.compareTo(payment.getAmount()) > 0) {
      addActionError("发票收款方式一栏总额大于付款额.");
    } else if (block.doubleValue() == 0) {
      addActionError("发票收款方式一栏总额为零.");
    }

    if (pay != block)
      addActionError("发票付款项目总额与发票收款方式一栏总额不符.");
  }

  public String submit() {
    invoice.setItems(items);
    invoice.setPieces(pieces);
    invoice.setInvoiceNo(orderNo);

    invoiceService.txSaveInvoice(invoice, 0);
    return SUCCESS;
  }

  public Invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

  public List<InvoiceItem> getItems() {
    return items;
  }

  public void setItems(List<InvoiceItem> items) {
    this.items = items;
  }

  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public String getReserveNo() {
    return reserveNo;
  }

  public void setReserveNo(String reserveNo) {
    this.reserveNo = reserveNo;
  }

  public List<InvoicePiece> getPieces() {
    return pieces;
  }

  public void setPieces(List<InvoicePiece> pieces) {
    this.pieces = pieces;
  }

}
