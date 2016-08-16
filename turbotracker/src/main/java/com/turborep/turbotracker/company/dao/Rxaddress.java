package com.turborep.turbotracker.company.dao;

// Generated Jan 23, 2012 5:39:26 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Transient;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Rxaddress generated by hbm2java
 */
@Entity
@Table(name = "rxAddress", catalog = "")
public class Rxaddress implements java.io.Serializable {

	private Integer rxAddressId;
	private Integer rxMasterId;
	private Boolean inActive;
	private String name;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private Boolean isStreet;
	private Boolean isMailing;
	private Boolean isBillTo;
	private Boolean isShipTo;
	private Integer coTaxTerritoryId;
	private String phone1;
	private String phone2;
	private String fax;
	private Integer otherBillTo;
	private Integer otherShipTo;
	private Boolean isDefault=false; 
	private Boolean isRemitTo=false; 
	public Rxaddress() {
	}

	public Rxaddress(Integer rxMasterId, Boolean inActive, String name,
			String address1, String address2, String city, String state,
			String zip, Boolean isStreet, Boolean isMailing, Boolean isBillTo,
			Boolean isShipTo, Integer coTaxTerritoryId) {
		this.rxMasterId = rxMasterId;
		this.inActive = inActive;
		this.name = name;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.isStreet = isStreet;
		this.isMailing = isMailing;
		this.isBillTo = isBillTo;
		this.isShipTo = isShipTo;
		this.coTaxTerritoryId = coTaxTerritoryId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "rxAddressID", unique = true, nullable = false)
	public Integer getRxAddressId() {
		return this.rxAddressId;
	}

	public void setRxAddressId(Integer rxAddressId) {
		this.rxAddressId = rxAddressId;
	}

	@Column(name = "rxMasterID")
	public Integer getRxMasterId() {
		return this.rxMasterId;
	}

	public void setRxMasterId(Integer rxMasterId) {
		this.rxMasterId = rxMasterId;
	}

	@Column(name = "InActive")
	public Boolean getInActive() {
		return this.inActive;
	}

	public void setInActive(Boolean inActive) {
		this.inActive = inActive;
	}

	@Column(name = "Name", length = 40)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Address1", length = 40)
	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Column(name = "Address2", length = 40)
	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Column(name = "City", length = 30)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "State", length = 2)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "Zip", length = 10)
	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Column(name = "IsStreet")
	public Boolean getIsStreet() {
		return this.isStreet;
	}

	public void setIsStreet(Boolean isStreet) {
		this.isStreet = isStreet;
	}

	@Column(name = "IsMailing")
	public Boolean getIsMailing() {
		return this.isMailing;
	}

	public void setIsMailing(Boolean isMailing) {
		this.isMailing = isMailing;
	}

	@Column(name = "IsBillTo")
	public Boolean getIsBillTo() {
		return this.isBillTo;
	}

	public void setIsBillTo(Boolean isBillTo) {
		this.isBillTo = isBillTo;
	}

	@Column(name = "IsShipTo")
	public Boolean getIsShipTo() {
		return this.isShipTo;
	}

	public void setIsShipTo(Boolean isShipTo) {
		this.isShipTo = isShipTo;
	}

	@Column(name = "coTaxTerritoryID")
	public Integer getCoTaxTerritoryId() {
		return this.coTaxTerritoryId;
	}

	public void setCoTaxTerritoryId(Integer coTaxTerritoryId) {
		this.coTaxTerritoryId = coTaxTerritoryId;
	}

	@Column(name = "Phone1", length = 30)
	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String Phone1) {
		this.phone1 = Phone1;
	}

	@Column(name = "Phone2", length = 30)
	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String Phone2) {
		this.phone2 = Phone2;
	}
	
	@Column(name = "Fax", length = 30)
	public String getFax() {
		return fax;
	}

	public void setFax(String Fax) {
		this.fax = Fax;
	}

	@Column(name = "otherBillTo")
	public Integer getOtherBillTo() {
		return otherBillTo;
	}

	public void setOtherBillTo(Integer otherBillTo) {
		this.otherBillTo = otherBillTo;
	}

	@Column(name = "otherShipTo")
	public Integer getOtherShipTo() {
		return otherShipTo;
	}

	public void setOtherShipTo(Integer otherShipTo) {
		this.otherShipTo = otherShipTo;
	}
	@Column(name = "IsDefault")
	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	@Column(name = "IsRemitTo")
	public Boolean getIsRemitTo() {
		return isRemitTo;
	}

	public void setIsRemitTo(Boolean isRemitTo) {
		this.isRemitTo = isRemitTo;
	}
		
}

