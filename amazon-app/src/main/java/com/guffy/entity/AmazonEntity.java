package com.guffy.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.guffy.rest.ProductCategory;
import com.guffy.rest.ProductManufacture;

@Entity
@Table(name = "PRODUCT")
@XmlRootElement
@NamedQuery(name = "amazonProducts.search", query = "select c from AmazonEntity c where UPPER(c.pname) like UPPER(:p1) OR UPPER(c.pnumber) like UPPER(:p2) OR UPPER(c.upc) like UPPER(:p3)")

public class AmazonEntity {

	@Id
	@Column(name = "PROD_ID")
	@SequenceGenerator(name = "prodseq", sequenceName = "prod_seq", allocationSize = 1)
	@GeneratedValue(generator = "prodseq")
	private Long pk;

	@Column(name = "PROD_NAME")
	private String pname;

	@Column(name = "prod_number")
	private String pnumber;

	@Column(name = "prod_upc")

	private String upc;
	@Enumerated(EnumType.STRING)
	@Column(name = "prod_cat")
	private ProductCategory category;

	@Column(name = "prod_desc")
	private String desc;

	@Enumerated(EnumType.STRING)
	@Column(name = "prod_mnfc")
	private ProductManufacture manufac;

	@Column(name = "prod_ver")
	private Long version;

	@Column(name = "active_date")
	private Date activeDate;

	@Column(name = "inactive_date")
	private Date inactiveDate;

	@Column(name = "create_date")
	private Date createDate;

	@Column(name = "prod_qty")
	private Long pquantity;

	@Column(name = "prod_thres")
	private Long pthreshold;

	@Column(name = "prod_ordqty")
	private Long porderQuantity;

	@Column(name = "prod_price")
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

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public String getUpc() {

		return upc;
	}

	public void setUpc(String upc) {

		this.upc = upc;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public ProductManufacture getManufac() {
		return manufac;
	}

	public void setManufac(ProductManufacture manufac) {
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

	@Override
	public String toString() {
		return "AmazonEntity [pk=" + pk + ", pname=" + pname + ", pnumber=" + pnumber + ", upc=" + upc + ", category="
				+ category + ", desc=" + desc + ", manufac=" + manufac + ", version=" + version + ", activeDate="
				+ activeDate + ", inactiveDate=" + inactiveDate + ", createDate=" + createDate + ", pquantity="
				+ pquantity + ", pthreshold=" + pthreshold + ", porderQuantity=" + porderQuantity + ", price=" + price
				+ "]";
	}

}
