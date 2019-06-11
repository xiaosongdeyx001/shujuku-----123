package com.opentravelsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_expense_tmpl")
public class TblExpenseTmpl implements java.io.Serializable {

  private Integer id;
  private int number;
  private String item;
  private String content;
  private String include;
  private Integer sortOrder;

  public TblExpenseTmpl() {
  }

  public TblExpenseTmpl(int number, String item) {
    this.number = number;
    this.item = item;
  }

  public TblExpenseTmpl(int number, String item, String content,
      String include, Integer sortOrder) {
    this.number = number;
    this.item = item;
    this.content = content;
    this.include = include;
    this.sortOrder = sortOrder;
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

  @Column(name = "NUMBER", nullable = false)
  public int getNumber() {
    return this.number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  @Column(name = "ITEM", nullable = false, length = 30)
  public String getItem() {
    return this.item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  @Column(name = "CONTENT", length = 500)
  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Column(name = "INCLUDE", length = 1)
  public String getInclude() {
    return this.include;
  }

  public void setInclude(String include) {
    this.include = include;
  }

  @Column(name = "SORT_ORDER")
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

}
