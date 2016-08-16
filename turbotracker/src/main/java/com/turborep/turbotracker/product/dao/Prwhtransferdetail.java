package com.turborep.turbotracker.product.dao;

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
 * Prwhtransferdetail generated by hbm2java
 */
@Entity
@Table(name = "prWHtransferDetail", catalog = "")
public class Prwhtransferdetail implements java.io.Serializable {

	private Integer prTransferDetailId;
	private Integer prTransferId;
	private Integer prMasterId;
	private String description;
	private BigDecimal quantityTransfered;
	private BigDecimal inventoryCost;
	private BigDecimal quantityAvailable;
	private BigDecimal difference;
	private String itemCode;
	private Integer userId ;
	private String userName;

	public Prwhtransferdetail() {
	}

	public Prwhtransferdetail(Integer prTransferId, Integer prMasterId,
			String description, BigDecimal quantityTransfered,
			BigDecimal inventoryCost, String itemCode) {
		this.prTransferId = prTransferId;
		this.prMasterId = prMasterId;
		this.description = description;
		this.quantityTransfered = quantityTransfered;
		this.inventoryCost = inventoryCost;
		this.itemCode = itemCode;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "prTransferDetailID", unique = true, nullable = false)
	public Integer getPrTransferDetailId() {
		return this.prTransferDetailId;
	}

	public void setPrTransferDetailId(Integer prTransferDetailId) {
		this.prTransferDetailId = prTransferDetailId;
	}

	@Column(name = "prTransferID")
	public Integer getPrTransferId() {
		return this.prTransferId;
	}

	public void setPrTransferId(Integer prTransferId) {
		this.prTransferId = prTransferId;
	}

	@Column(name = "prMasterID")
	public Integer getPrMasterId() {
		return this.prMasterId;
	}

	public void setPrMasterId(Integer prMasterId) {
		this.prMasterId = prMasterId;
	}

	@Column(name = "Description", length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "QuantityTransfered", scale = 4)
	public BigDecimal getQuantityTransfered() {
		return this.quantityTransfered;
	}

	public void setQuantityTransfered(BigDecimal quantityTransfered) {
		this.quantityTransfered = quantityTransfered;
	}

	@Column(name = "InventoryCost", scale = 4)
	public BigDecimal getInventoryCost() {
		return this.inventoryCost;
	}

	public void setInventoryCost(BigDecimal inventoryCost) {
		this.inventoryCost = inventoryCost;
	}

	@Column(name = "QuantityAvailable", scale = 4)
	public BigDecimal getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(BigDecimal quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
	
	@Column(name = "ItemCode", length = 20)
	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public BigDecimal getDifference() {
		return difference;
	}

	public void setDifference(BigDecimal difference) {
		this.difference = difference;
	}
	
	@Transient
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Transient
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	


}
