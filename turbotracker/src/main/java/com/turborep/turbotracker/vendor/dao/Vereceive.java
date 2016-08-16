package com.turborep.turbotracker.vendor.dao;

// Generated Jan 23, 2012 5:39:26 PM by Hibernate Tools 3.4.0.CR1

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
 * Vereceive generated by hbm2java
 */
@Entity
@Table(name = "veReceive", catalog = "")
public class Vereceive implements java.io.Serializable {

	private Integer veReceiveId;
	private Integer rxMasterId;
	private Integer vePoid;
	private Date receiveDate;

	public Vereceive() {
	}

	public Vereceive(Integer rxMasterId, Integer vePoid, Date receiveDate) {
		this.rxMasterId = rxMasterId;
		this.vePoid = vePoid;
		this.receiveDate = receiveDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "veReceiveID", unique = true, nullable = false)
	public Integer getVeReceiveId() {
		return this.veReceiveId;
	}

	public void setVeReceiveId(Integer veReceiveId) {
		this.veReceiveId = veReceiveId;
	}

	@Column(name = "rxMasterID")
	public Integer getRxMasterId() {
		return this.rxMasterId;
	}

	public void setRxMasterId(Integer rxMasterId) {
		this.rxMasterId = rxMasterId;
	}

	@Column(name = "vePOID")
	public Integer getVePoid() {
		return this.vePoid;
	}

	public void setVePoid(Integer vePoid) {
		this.vePoid = vePoid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ReceiveDate", length = 0)
	public Date getReceiveDate() {
		return this.receiveDate;
	}

	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}

}
