package com.guffy.vo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AmazonVO {

	private Long pk;

	private String pname;

	private Long pnumber;

	private String upc;

	private String category;

	private String desc;

	private String manufac;

	private Long version;

	private Date activeDate;

	private Date inactiveDate;

	private Date createDate;

	private Long pquantity;

	private Long pthreshold;

	private Long porderQuantity;

	private Double price;

	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Long getPnumber() {
		return pnumber;
	}

	public void setPnumber(Long pnumber) {
		this.pnumber = pnumber;
	}

	public String getUpc() {

		return upc;
	}

	public void setUpc(String upc) {

		this.upc = upc;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getManufac() {
		return manufac;
	}

	public void setManufac(String manufac) {
		this.manufac = manufac;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Date getActiveDate() {
		return activeDate;
	}

	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}

	public Date getInactiveDate() {
		return inactiveDate;
	}

	public void setInactiveDate(Date inactiveDate) {
		this.inactiveDate = inactiveDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getPquantity() {
		return pquantity;
	}

	public void setPquantity(Long pquantity) {
		this.pquantity = pquantity;
	}

	public Long getPthreshold() {
		return pthreshold;
	}

	public void setPthreshold(Long pthreshold) {
		this.pthreshold = pthreshold;
	}

	public Long getPorderQuantity() {
		return porderQuantity;
	}

	public void setPorderQuantity(Long porderQuantity) {
		this.porderQuantity = porderQuantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
