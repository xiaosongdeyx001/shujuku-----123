package com.opentravelsoft.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_category")
public class Category implements java.io.Serializable {

  private Integer catId;
  private Category parent;
  private String code;
  private String name;
  private String keywords;
  private String description;
  private String metaKeywords;
  private String metaDesc;
  private Set<Category> children = new HashSet<Category>(0);

  public Category() {
  }

  public Category(String name) {
    this.name = name;
  }

  public Category(Category category, String code, String name, String keywords,
      String description, String metaKeywords, String metaDesc,
      Set<Category> categories) {
    this.parent = category;
    this.code = code;
    this.name = name;
    this.keywords = keywords;
    this.description = description;
    this.metaKeywords = metaKeywords;
    this.metaDesc = metaDesc;
    this.children = categories;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "CAT_ID", unique = true, nullable = false)
  public Integer getCatId() {
    return this.catId;
  }

  public void setCatId(Integer catId) {
    this.catId = catId;
  }

  @Column(name = "CODE", length = 20)
  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Column(name = "NAME", nullable = false, length = 50)
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "KEYWORDS", length = 100)
  public String getKeywords() {
    return this.keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  @Column(name = "DESCRIPTION", length = 100)
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Column(name = "META_KEYWORDS", length = 50)
  public String getMetaKeywords() {
    return this.metaKeywords;
  }

  public void setMetaKeywords(String metaKeywords) {
    this.metaKeywords = metaKeywords;
  }

  @Column(name = "META_DESC", length = 50)
  public String getMetaDesc() {
    return this.metaDesc;
  }

  public void setMetaDesc(String metaDesc) {
    this.metaDesc = metaDesc;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "PARENT_ID")
  public Category getParent() {
    return parent;
  }

  public void setParent(Category parent) {
    this.parent = parent;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
  public Set<Category> getChildren() {
    return children;
  }

  public void setChildren(Set<Category> children) {
    this.children = children;
  }

}
