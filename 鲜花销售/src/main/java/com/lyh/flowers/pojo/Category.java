package com.lyh.flowers.pojo;

import java.util.List;


public class Category {
	private String cid;// 主键 
	private String pid;
	private String cname;// 分类名称
	private Category parent;// 父分类
	private String cdesc;// 分类描述
	private List<Category> children;// 子分类
	private int orderBy;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public int getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(int orderBy) {
		this.orderBy = orderBy;
	}
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Category getParent() {
		return parent;
	}
	public void setParent(Category parent) {
		this.parent = parent;
	}
	
	public List<Category> getChildren() {
		return children;
	}
	public void setChildren(List<Category> children) {
		this.children = children;
	}
	
	
	public String getCdesc() {
		return cdesc;
	}
	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + ", parent="
				+ parent + ", desc=" + cdesc + ", children=" + children + "]";
	}
	
}
