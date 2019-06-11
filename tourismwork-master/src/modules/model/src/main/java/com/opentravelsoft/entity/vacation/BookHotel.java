package com.opentravelsoft.entity.vacation;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 选择酒店
 */
@Entity
@Table(name = "tbl_booking_hotel")
public class BookHotel implements java.io.Serializable {

  private Integer recNo;
  private String bookingNo;
  private String hotelId;
  private String roomType;
  private Date checkInDate;
  private Date checkOutDate;
  private String stayCity;
  private Integer roomNum;
  private Integer stay;
  private BigDecimal price;
  private BigDecimal totalPrice;
  private Integer state;
  private String remark;
  private String createdBy;
  private Date createdDate;
  private String modifiedBy;
  private Date modifiedDate;
  private Byte isDelete;
  private Integer rmNum1;
  private Integer rmNum2;

  public BookHotel() {
  }

  public BookHotel(String bookingNo, String hotelId, String roomType,
      Date checkInDate, Date checkOutDate, String stayCity, Integer roomNum,
      Integer stay, BigDecimal price, BigDecimal totalPrice, Integer state,
      String remark, String createdBy, Date createdDate, String modifiedBy,
      Date modifiedDate, Byte isDelete, Integer rmNum1, Integer rmNum2) {
    this.bookingNo = bookingNo;
    this.hotelId = hotelId;
    this.roomType = roomType;
    this.checkInDate = checkInDate;
    this.checkOutDate = checkOutDate;
    this.stayCity = stayCity;
    this.roomNum = roomNum;
    this.stay = stay;
    this.price = price;
    this.totalPrice = totalPrice;
    this.state = state;
    this.remark = remark;
    this.createdBy = createdBy;
    this.createdDate = createdDate;
    this.modifiedBy = modifiedBy;
    this.modifiedDate = modifiedDate;
    this.isDelete = isDelete;
    this.rmNum1 = rmNum1;
    this.rmNum2 = rmNum2;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "REC_NO", unique = true, nullable = false)
  public Integer getRecNo() {
    return this.recNo;
  }

  public void setRecNo(Integer recNo) {
    this.recNo = recNo;
  }

  @Column(name = "BookingNo", length = 10)
  public String getBookingNo() {
    return this.bookingNo;
  }

  public void setBookingNo(String bookingNo) {
    this.bookingNo = bookingNo;
  }

  @Column(name = "HotelID", length = 10)
  public String getHotelId() {
    return this.hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  @Column(name = "RoomType", length = 200)
  public String getRoomType() {
    return this.roomType;
  }

  public void setRoomType(String roomType) {
    this.roomType = roomType;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "CheckInDate", length = 19)
  public Date getCheckInDate() {
    return this.checkInDate;
  }

  public void setCheckInDate(Date checkInDate) {
    this.checkInDate = checkInDate;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "CheckOutDate", length = 19)
  public Date getCheckOutDate() {
    return this.checkOutDate;
  }

  public void setCheckOutDate(Date checkOutDate) {
    this.checkOutDate = checkOutDate;
  }

  @Column(name = "StayCity", length = 50)
  public String getStayCity() {
    return this.stayCity;
  }

  public void setStayCity(String stayCity) {
    this.stayCity = stayCity;
  }

  @Column(name = "RoomNum")
  public Integer getRoomNum() {
    return this.roomNum;
  }

  public void setRoomNum(Integer roomNum) {
    this.roomNum = roomNum;
  }

  @Column(name = "Stay")
  public Integer getStay() {
    return this.stay;
  }

  public void setStay(Integer stay) {
    this.stay = stay;
  }

  @Column(name = "Price", precision = 9)
  public BigDecimal getPrice() {
    return this.price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Column(name = "TotalPrice", precision = 9)
  public BigDecimal getTotalPrice() {
    return this.totalPrice;
  }

  public void setTotalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
  }

  @Column(name = "State")
  public Integer getState() {
    return this.state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  @Column(name = "Remark", length = 2000)
  public String getRemark() {
    return this.remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  @Column(name = "CreatedBy", length = 20)
  public String getCreatedBy() {
    return this.createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "CreatedDate", length = 19)
  public Date getCreatedDate() {
    return this.createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  @Column(name = "ModifiedBy", length = 20)
  public String getModifiedBy() {
    return this.modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "ModifiedDate", length = 19)
  public Date getModifiedDate() {
    return this.modifiedDate;
  }

  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  @Column(name = "IsDelete")
  public Byte getIsDelete() {
    return this.isDelete;
  }

  public void setIsDelete(Byte isDelete) {
    this.isDelete = isDelete;
  }

  @Column(name = "RM_NUM1")
  public Integer getRmNum1() {
    return this.rmNum1;
  }

  public void setRmNum1(Integer rmNum1) {
    this.rmNum1 = rmNum1;
  }

  @Column(name = "RM_NUM2")
  public Integer getRmNum2() {
    return this.rmNum2;
  }

  public void setRmNum2(Integer rmNum2) {
    this.rmNum2 = rmNum2;
  }

}
