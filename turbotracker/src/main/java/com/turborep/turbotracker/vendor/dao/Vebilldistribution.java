package com.turborep.turbotracker.vendor.dao;

// Generated Jan 23, 2012 5:39:26 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Transient;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Vebilldistribution generated by hbm2java
 */
@Entity
@Table(name = "veBillDistribution", catalog = "")
public class Vebilldistribution implements java.io.Serializable {

	private Integer veBillDistributionId;
	private Integer veBillId;
	private Integer coExpenseAccountId;
	private BigDecimal expenseAmount;
	private Integer joMasterId;
	private String number;
	private String desc;
	private String jobNumber;

	public Vebilldistribution() {
	}

	public Vebilldistribution(Integer veBillId, Integer coExpenseAccountId,
			BigDecimal expenseAmount) {
		this.veBillId = veBillId;
		this.coExpenseAccountId = coExpenseAccountId;
		this.expenseAmount = expenseAmount;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "veBillDistributionID", unique = true, nullable = false)
	public Integer getVeBillDistributionId() {
		return this.veBillDistributionId;
	}

	public void setVeBillDistributionId(Integer veBillDistributionId) {
		this.veBillDistributionId = veBillDistributionId;
	}

	@Column(name = "veBillID")
	public Integer getVeBillId() {
		return this.veBillId;
	}

	public void setVeBillId(Integer veBillId) {
		this.veBillId = veBillId;
	}

	@Column(name = "coExpenseAccountID")
	public Integer getCoExpenseAccountId() {
		return this.coExpenseAccountId;
	}

	public void setCoExpenseAccountId(Integer coExpenseAccountId) {
		this.coExpenseAccountId = coExpenseAccountId;
	}

	@Column(name = "ExpenseAmount", scale = 4)
	public BigDecimal getExpenseAmount() {
		return this.expenseAmount;
	}

	public void setExpenseAmount(BigDecimal expenseAmount) {
		this.expenseAmount = expenseAmount;
	}
	@Column(name = "joMasterID")
	public Integer getJoMasterId() {
		return this.joMasterId;
	}

	public void setJoMasterId(Integer joMasterId) {
		this.joMasterId = joMasterId;
	}
	@Transient
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	@Transient
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Transient
	public String getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

}
