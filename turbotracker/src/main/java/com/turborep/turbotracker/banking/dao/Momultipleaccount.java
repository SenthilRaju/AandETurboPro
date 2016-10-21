package com.turborep.turbotracker.banking.dao;

// Generated Jul 9, 2014 5:57:18 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Transient;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Momultipleaccount generated by hbm2java
 */
@Entity
@Table(name = "moMultipleAccount", catalog = "")
public class Momultipleaccount implements java.io.Serializable {

	private Integer moMultipleAccountsId;
	private Integer moTransactionId;
	private Integer coAccountId;
	private BigDecimal amount;
	private String description;
	public Momultipleaccount() {
	}

	public Momultipleaccount(Integer moTransactionId, Integer coAccountId,
			BigDecimal amount) {
		this.moTransactionId = moTransactionId;
		this.coAccountId = coAccountId;
		this.amount = amount;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "moMultipleAccountsID", unique = true, nullable = false)
	public Integer getMoMultipleAccountsId() {
		return this.moMultipleAccountsId;
	}

	public void setMoMultipleAccountsId(Integer moMultipleAccountsId) {
		this.moMultipleAccountsId = moMultipleAccountsId;
	}

	@Column(name = "moTransactionID")
	public Integer getMoTransactionId() {
		return this.moTransactionId;
	}

	public void setMoTransactionId(Integer moTransactionId) {
		this.moTransactionId = moTransactionId;
	}

	@Column(name = "coAccountID")
	public Integer getCoAccountId() {
		return this.coAccountId;
	}

	public void setCoAccountId(Integer coAccountId) {
		this.coAccountId = coAccountId;
	}

	@Column(name = "Amount", scale = 4)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	@Transient
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}