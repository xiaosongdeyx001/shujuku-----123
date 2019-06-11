package com.opentravelsoft.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_sms_reserve")
public class TblSmsReceive implements java.io.Serializable {

  private Integer id;
  private String seqno;
  private String mobile;
  private String message;
  private Date reserveDate;
  private String reply;
  private Date replyDate;
  private Date updDate;
  private String msgSrc;

  public TblSmsReceive() {
  }

  public TblSmsReceive(String seqno) {
    this.seqno = seqno;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "ID", unique = true, nullable = false)
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Column(name = "SEQNO", nullable = false, length = 20)
  public String getSeqno() {
    return this.seqno;
  }

  public void setSeqno(String seqno) {
    this.seqno = seqno;
  }

  @Column(name = "MOBILE", length = 11)
  public String getMobile() {
    return this.mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  @Column(name = "MESSAGE", length = 200)
  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "RECEIVE_DATE", length = 19)
  public Date getReceiveDate() {
    return this.reserveDate;
  }

  public void setReceiveDate(Date reserveDate) {
    this.reserveDate = reserveDate;
  }

  @Column(name = "REPLY", length = 1)
  public String getReply() {
    return this.reply;
  }

  public void setReply(String reply) {
    this.reply = reply;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "REPLY_DATE", length = 19)
  public Date getReplyDate() {
    return this.replyDate;
  }

  public void setReplyDate(Date replyDate) {
    this.replyDate = replyDate;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "UPD_DATE", length = 19)
  public Date getUpdDate() {
    return this.updDate;
  }

  public void setUpdDate(Date updDate) {
    this.updDate = updDate;
  }

  @Column(name = "MSG_SRC", length = 500)
  public String getMsgSrc() {
    return this.msgSrc;
  }

  public void setMsgSrc(String msgSrc) {
    this.msgSrc = msgSrc;
  }

}
