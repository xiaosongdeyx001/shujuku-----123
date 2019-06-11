package com.opentravelsoft.action.booking;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opentravelsoft.util.LabelValueBean;

import com.opentravelsoft.entity.Booking;
import com.opentravelsoft.entity.Tourist;
import com.opentravelsoft.entity.finance.Income;
import com.opentravelsoft.service.order.BookingService;
import com.opentravelsoft.webapp.action.PortalAction;

/**
 * 客户网上付款
 * 
 * @author <a herf="mailto:zhangsitao@gmail.com">Steven Zhang</a>
 * @version $Revision: 1.1 $ $Date: 2009/03/01 16:24:07 $
 */
public class BookGatheringAction extends PortalAction {
  private static final long serialVersionUID = 421467675829379367L;

  @Autowired
  private BookingService bookService;

  /** 订单 */
  private Booking book;

  /** 订单号 */
  private String reserveNo;

  /** 付款方式列表 */
  private List<LabelValueBean> types;

  private List<Tourist> customerList = new ArrayList<Tourist>();

  private Income payment;

  @Action(value = "/accounts/BookGathering", results = { @Result(name = "input", location = "/includes/booking/BookGathering.jsp") })
  public String input() throws Exception {
    book = bookService.roGetReserve(reserveNo);
    types = bookService.roGetPaymentTypes();
    return INPUT;
  }

  @Action(value = "/accounts/submitBookGathering", results = {
      @Result(name = "input", type = "chain", location = "BookGathering"),
      @Result(type = "chain", location = "BookDetail") })
  public String submit() throws Exception {
    // 客户付款
    payment.setBookingNo(reserveNo);
    bookService.txGathering(payment, 0);
    return SUCCESS;
  }

  public String getReserveNo() {
    return reserveNo;
  }

  public void setReserveNo(String reserveNo) {
    this.reserveNo = reserveNo;
  }

  public Booking getBook() {
    return book;
  }

  public List<LabelValueBean> getTypes() {
    return types;
  }

  public List<Tourist> getCustomerList() {
    return customerList;
  }

  public Income getPayment() {
    return payment;
  }

  public void setPayment(Income payment) {
    this.payment = payment;
  }

}
