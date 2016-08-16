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
 * Epempliability generated by hbm2java
 */
@Entity
@Table(name = "epempliability", catalog = "")
public class Epempliability implements java.io.Serializable {

	private Integer epEmpLiabilityId;
	private Integer rxMasterId;
	private Integer epCoLiabilityId;
	private Boolean active;
	private BigDecimal amount;
	private BigDecimal maximum;

	public Epempliability() {
	}

	public Epempliability(Integer rxMasterId, Integer epCoLiabilityId,
			Boolean active, BigDecimal amount, BigDecimal maximum) {
		this.rxMasterId = rxMasterId;
		this.epCoLiabilityId = epCoLiabilityId;
		this.active = active;
		this.amount = amount;
		this.maximum = maximum;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "epEmpLiabilityID", unique = true, nullable = false)
	public Integer getEpEmpLiabilityId() {
		return this.epEmpLiabilityId;
	}

	public void setEpEmpLiabilityId(Integer epEmpLiabilityId) {
		this.epEmpLiabilityId = epEmpLiabilityId;
	}

	@Column(name = "rxMasterID")
	public Integer getRxMasterId() {
		return this.rxMasterId;
	}

	public void setRxMasterId(Integer rxMasterId) {
		this.rxMasterId = rxMasterId;
	}

	@Column(name = "epCoLiabilityID")
	public Integer getEpCoLiabilityId() {
		return this.epCoLiabilityId;
	}

	public void setEpCoLiabilityId(Integer epCoLiabilityId) {
		this.epCoLiabilityId = epCoLiabilityId;
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
