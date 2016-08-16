package com.turborep.turbotracker.customer.dao;

// Generated Jan 23, 2012 5:39:26 PM by Hibernate Tools 3.4.0.CR1

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
 * Cureceipt generated by hbm2java
 */
@Entity
@Table(name = "cuReceipt", catalog = "")
public class Cureceipt implements java.io.Serializable {

	private Integer cuReceiptId;
	private Integer rxCustomerId;
	private Byte cuReceiptTypeId;
	private Date receiptDate;
	private String reference;
	private String memo;
	private BigDecimal amount;
	private boolean reversePaymentStatus;

	public Cureceipt() {
	}

	public Cureceipt(Date receiptDate, BigDecimal amount) {
		this.receiptDate = receiptDate;
		this.amount = amount;
	}

	public Cureceipt(Integer rxCustomerId, Byte cuReceiptTypeId,
			Date receiptDate, String reference, String memo, BigDecimal amount) {
		this.rxCustomerId = rxCustomerId;
		this.cuReceiptTypeId = cuReceiptTypeId;
		this.receiptDate = receiptDate;
		this.reference = reference;
		this.memo = memo;
		this.amount = amount;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cuReceiptID", unique = true, nullable = false)
	public Integer getCuReceiptId() {
		return this.cuReceiptId;
	}

	public void setCuReceiptId(Integer cuReceiptId) {
		this.cuReceiptId = cuReceiptId;
	}

	@Column(name = "rxCustomerID")
	public Integer getRxCustomerId() {
		return this.rxCustomerId;
	}

	public void setRxCustomerId(Integer rxCustomerId) {
		this.rxCustomerId = rxCustomerId;
	}

	@Column(name = "cuReceiptTypeID")
	public Byte getCuReceiptTypeId() {
		return this.cuReceiptTypeId;
	}

	public void setCuReceiptTypeId(Byte cuReceiptTypeId) {
		this.cuReceiptTypeId = cuReceiptTypeId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ReceiptDate", nullable = false, length = 0)
	public Date getReceiptDate() {
		return this.receiptDate;
	}

	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	@Column(name = "Reference", length = 12)
	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Column(name = "Memo", length = 50)
	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "Amount", nullable = false, scale = 4)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "reversePaymentStatus")
	public boolean isReversePaymentStatus() {
		return reversePaymentStatus;
	}

	public void setReversePaymentStatus(boolean reversePaymentStatus) {
		this.reversePaymentStatus = reversePaymentStatus;
	}

	
	
	
	

}
