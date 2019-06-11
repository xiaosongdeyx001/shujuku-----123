package com.opentravelsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_product_tmpl")
public class ProductTmpl implements java.io.Serializable {

  private Integer id;
  private Team team;
  private ProductItem item;
  private String type;
  private String destCode;
  private String subject;
  private String content;
  private Integer sortOrder;
  private Integer include;

  public ProductTmpl() {
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

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "TEAM_ID")
  public Team getTeam() {
    return this.team;
  }

  public void setTeam(Team teamId) {
    this.team = teamId;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ITEM_ID", nullable = false)
  public ProductItem getItem() {
    return this.item;
  }

  public void setItem(ProductItem itemId) {
    this.item = itemId;
  }

  @Column(name = "TYPE", nullable = false, length = 20)
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Column(name = "DEST_CODE", length = 20)
  public String getDestCode() {
    return this.destCode;
  }

  public void setDestCode(String destCode) {
    this.destCode = destCode;
  }

  @Column(name = "SUBJECT", length = 50)
  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  @Column(name = "CONTENT", length = 500)
  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Column(name = "SORT_ORDER")
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  @Column(name = "INCLUDE")
  public Integer getInclude() {
    return this.include;
  }

  public void setInclude(Integer include) {
    this.include = include;
  }

}
