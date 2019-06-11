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
import javax.persistence.Transient;

@Entity
@Table(name = "tbl_contact")
public class Contact implements java.io.Serializable {

  private Integer contactId;
  private int customerId;
  private String name;
  private String rank;
  private String phone;
  private String fax;
  private String mobile;
  private String email;
  private String msn;
  private String skype;
  private String qq;
  private String del;
  private Integer salesId;
  private Date created;
  private Integer createdBy;
  private Date updated;
  private Integer updatedBy;

  public Contact() {
    this.del = "N";
  }

  public Contact(int customerId, Date updated) {
    this.customerId = customerId;
    this.updated = updated;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "CONTACT_ID", unique = true, nullable = false)
  public Integer getContactId() {
    return this.contactId;
  }

  public void setContactId(Integer contactId) {
    this.contactId = contactId;
  }

  @Column(name = "CUSTOMER_ID", nullable = false)
  public int getCustomerId() {
    return this.customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  @Column(name = "NAME", length = 30)
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "RANK", length = 40)
  public String getRank() {
    return this.rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  @Column(name = "PHONE", length = 40)
  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Column(name = "FAX", length = 40)
  public String getFax() {
    return this.fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  @Column(name = "MOBILE", length = 20)
  public String getMobile() {
    return this.mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  @Column(name = "EMAIL", length = 60)
  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Column(name = "MSN", length = 60)
  public String getMsn() {
    return this.msn;
  }

  public void setMsn(String msn) {
    this.msn = msn;
  }

  @Column(name = "SKYPE", length = 60)
  public String getSkype() {
    return this.skype;
  }

  public void setSkype(String skype) {
    this.skype = skype;
  }

  @Column(name = "QQ", length = 30)
  public String getQq() {
    return this.qq;
  }

  public void setQq(String qq) {
    this.qq = qq;
  }

  @Column(name = "DEL", length = 1)
  public String getDel() {
    return this.del;
  }

  public void setDel(String del) {
    this.del = del;
  }

  @Column(name = "SALES_ID")
  public Integer getSalesId() {
    return this.salesId;
  }

  public void setSalesId(Integer salesId) {
    this.salesId = salesId;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "CREATED", length = 19)
  public Date getCreated() {
    return this.created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  @Column(name = "CREATEDBY")
  public Integer getCreatedBy() {
    return this.createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "UPDATED", nullable = false, length = 19)
  public Date getUpdated() {
    return this.updated;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  @Column(name = "UPDATEDBY")
  public Integer getUpdatedBy() {
    return this.updatedBy;
  }

  public void setUpdatedBy(Integer updatedBy) {
    this.updatedBy = updatedBy;
  }

  private int idx;

  @Transient
  public int getIdx() {
    return idx;
  }

  public void setIdx(int idx) {
    this.idx = idx;
  }

}
