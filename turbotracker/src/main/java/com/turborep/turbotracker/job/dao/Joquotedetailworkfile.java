package com.turborep.turbotracker.job.dao;

// Generated Jan 23, 2012 5:39:26 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Joquotedetailworkfile generated by hbm2java
 */
@Entity
@Table(name = "joquotedetailworkfile", catalog = "")
public class Joquotedetailworkfile implements java.io.Serializable {

	private Integer joQuoteDetailWorkFileId;
	private String product;
	private String productNote;
	private String itemQuantity;
	private String paragraph;
	private Integer rxManufacturerId;
	private BigDecimal price;
	private String inlineNote;
	private BigDecimal cost;

	public Joquotedetailworkfile() {
	}

	public Joquotedetailworkfile(String product, String productNote,
			String itemQuantity, String paragraph, Integer rxManufacturerId,
			BigDecimal price, String inlineNote, BigDecimal cost) {
		this.product = product;
		this.productNote = productNote;
		this.itemQuantity = itemQuantity;
		this.paragraph = paragraph;
		this.rxManufacturerId = rxManufacturerId;
		this.price = price;
		this.inlineNote = inlineNote;
		this.cost = cost;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "joQuoteDetailWorkFileID", unique = true, nullable = false)
	public Integer getJoQuoteDetailWorkFileId() {
		return this.joQuoteDetailWorkFileId;
	}

	public void setJoQuoteDetailWorkFileId(Integer joQuoteDetailWorkFileId) {
		this.joQuoteDetailWorkFileId = joQuoteDetailWorkFileId;
	}

	@Column(name = "Product")
	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@Column(name = "ProductNote")
	public String getProductNote() {
		return this.productNote;
	}

	public void setProductNote(String productNote) {
		this.productNote = productNote;
	}

	@Column(name = "ItemQuantity", length = 8)
	public String getItemQuantity() {
		return this.itemQuantity;
	}

	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	@Column(name = "Paragraph", length = 16)
	public String getParagraph() {
		return this.paragraph;
	}

	public void setParagraph(String paragraph) {
		this.paragraph = paragraph;
	}

	@Column(name = "rxManufacturerID")
	public Integer getRxManufacturerId() {
		return this.rxManufacturerId;
	}

	public void setRxManufacturerId(Integer rxManufacturerId) {
		this.rxManufacturerId = rxManufacturerId;
	}

	@Column(name = "Price", scale = 4)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "InlineNote")
	public String getInlineNote() {
		return this.inlineNote;
	}

	public void setInlineNote(String inlineNote) {
		this.inlineNote = inlineNote;
	}

	@Column(name = "Cost", scale = 4)
	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

}
