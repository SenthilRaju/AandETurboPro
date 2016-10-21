package com.turborep.turbotracker.employee.dao;

// Generated Jan 23, 2012 5:39:26 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Eptrandeduction generated by hbm2java
 */
@Entity
@Table(name = "eptrandeduction", catalog = "")
public class Eptrandeduction implements java.io.Serializable {

	private Integer epTranDeductionId;
	private Integer epTransactionId;
	private Integer epCoDeductionId;
	private BigDecimal deductionAmount;
	private Boolean override;

	public Eptrandeduction() {
	}

	public Eptrandeduction(Integer epTransactionId, Integer epCoDeductionId,
			BigDecimal deductionAmount, Boolean override) {
		this.epTransactionId = epTransactionId;
		this.epCoDeductionId = epCoDeductionId;
		this.deductionAmount = deductionAmount;
		this.override = override;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "epTranDeductionID", unique = true, nullable = false)
	public Integer getEpTranDeductionId() {
		return this.epTranDeductionId;
	}

	public void setEpTranDeductionId(Integer epTranDeductionId) {
		this.epTranDeductionId = epTranDeductionId;
	}

	@Column(name = "epTransactionID")
	public Integer getEpTransactionId() {
		return this.epTransactionId;
	}

	public void setEpTransactionId(Integer epTransactionId) {
		this.epTransactionId = epTransactionId;
	}

	@Column(name = "epCoDeductionID")
	public Integer getEpCoDeductionId() {
		return this.epCoDeductionId;
	}

	public void setEpCoDeductionId(Integer epCoDeductionId) {
		this.epCoDeductionId = epCoDeductionId;
	}

	@Column(name = "DeductionAmount", scale = 4)
	public BigDecimal getDeductionAmount() {
		return this.deductionAmount;
	}

	public void setDeductionAmount(BigDecimal deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	@Column(name = "Override")
	public Boolean getOverride() {
		return this.override;
	}

	public void setOverride(Boolean override) {
		this.override = override;
	}

}