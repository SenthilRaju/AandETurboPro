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
 * Epempdeduction generated by hbm2java
 */
@Entity
@Table(name = "epempdeduction", catalog = "")
public class Epempdeduction implements java.io.Serializable {

	private Integer epEmpDeductionId;
	private Integer rxMasterId;
	private Integer epCoDeductionId;
	private Boolean active;
	private BigDecimal amount;
	private BigDecimal maximum;

	public Epempdeduction() {
	}

	public Epempdeduction(Integer rxMasterId, Integer epCoDeductionId,
			Boolean active, BigDecimal amount, BigDecimal maximum) {
		this.rxMasterId = rxMasterId;
		this.epCoDeductionId = epCoDeductionId;
		this.active = active;
		this.amount = amount;
		this.maximum = maximum;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "epEmpDeductionID", unique = true, nullable = false)
	public Integer getEpEmpDeductionId() {
		return this.epEmpDeductionId;
	}

	public void setEpEmpDeductionId(Integer epEmpDeductionId) {
		this.epEmpDeductionId = epEmpDeductionId;
	}

	@Column(name = "rxMasterID")
	public Integer getRxMasterId() {
		return this.rxMasterId;
	}

	public void setRxMasterId(Integer rxMasterId) {
		this.rxMasterId = rxMasterId;
	}

	@Column(name = "epCoDeductionID")
	public Integer getEpCoDeductionId() {
		return this.epCoDeductionId;
	}

	public void setEpCoDeductionId(Integer epCoDeductionId) {
		this.epCoDeductionId = epCoDeductionId;
	}

	@Column(name = "Active")
	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Column(name = "Amount", scale = 4)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "Maximum", scale = 4)
	public BigDecimal getMaximum() {
		return this.maximum;
	}

	public void setMaximum(BigDecimal maximum) {
		this.maximum = maximum;
	}

}