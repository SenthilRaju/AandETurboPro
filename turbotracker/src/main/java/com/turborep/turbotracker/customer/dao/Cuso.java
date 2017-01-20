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
import javax.persistence.Transient;

/**
 * Cuso generated by hbm2java
 */
@Entity
@Table(name = "cuSO", catalog = "")
public class Cuso implements java.io.Serializable {
	
	private Integer cuSoid;
	private Integer createdById;
	private Date createdOn;
	private Integer changedById;
	private Date changedOn;
	private Integer transactionStatus;
	private Integer joReleaseId;
	private Integer rxCustomerId;
	private Integer rxBillToId;
	private Integer rxBillToAddressId;
	private Integer rxShipToId;
	private Integer rxShipToAddressId;
	private Integer veShipViaId;
	private Integer prFromWarehouseId;
	private Integer prToWarehouseId;
	private Integer cuTermsId;
	private byte shipToMode;
	private Integer coTaxTerritoryId;
	private String sonumber;
	private String customerPonumber;
	private String datePromised;
	private String quickJobName;
	private Date orderDate;
	private Date shipDate;
	private BigDecimal freight;
	private BigDecimal costTotal;
	private BigDecimal subTotal;
	private BigDecimal taxTotal;
	private BigDecimal taxRate;
	private Integer cuAssignmentId0;
	private Integer cuAssignmentId1;
	private Integer cuAssignmentId2;
	private Integer cuAssignmentId3;
	private Integer cuAssignmentId4;
	private Integer rxContactId;
	private Integer shipToIndex;
	private String trackingNumber;
	private Boolean surtaxOverrideCap;
	private BigDecimal surtaxTotal;
	private BigDecimal surtaxRate;
	private BigDecimal surtaxAmount;
	private BigDecimal singleItemTaxAmount;
	private Integer joScheddDetailID;
	private String tag;
	private BigDecimal freightCost;
	private Integer coDivisionID;
	private boolean taxExempt1;
	private boolean taxExempt2;
	private boolean taxExempt3;
	private boolean taxExempt4;
	private boolean taxExempt5;
	private boolean taxExempt6;
	private boolean taxExempt7;
	private boolean taxExempt8;
	private boolean taxExempt0;
	private Date emailTimeStamp;
	private BigDecimal whseCostTotal;
	private boolean withpriceStatus;
	private byte taxfreight;
	private BigDecimal taxableSales;
	private BigDecimal nonTaxableSales;
	//Added By Simon for Issue Fix
	private boolean isCuSOUsed;

	public Cuso() {
	}

	public Cuso(byte shipToMode) {
		this.shipToMode = shipToMode;
	}

	public Cuso(Integer createdById, Date createdOn, Integer changedById,
			Date changedOn, Integer transactionStatus, Integer joReleaseId,
			Integer rxCustomerId, Integer rxBillToId,
			Integer rxBillToAddressId, Integer rxShipToId,
			Integer rxShipToAddressId, Integer veShipViaId,
			Integer prFromWarehouseId, Integer prToWarehouseId,
			Integer cuTermsId, byte shipToMode, Integer coTaxTerritoryId,
			String sonumber, String customerPonumber, String datePromised,
			String quickJobName, Date orderDate, Date shipDate,
			BigDecimal freight, BigDecimal costTotal, BigDecimal subTotal,
			BigDecimal taxTotal, BigDecimal taxRate, Integer cuAssignmentId0,
			Integer cuAssignmentId1, Integer cuAssignmentId2,
			Integer cuAssignmentId3, Integer cuAssignmentId4,
			String trackingNumber, Boolean surtaxOverrideCap,
			BigDecimal surtaxTotal, BigDecimal surtaxRate, Integer joScheddDetailID, String tag,
			BigDecimal freightCost, Integer coDivisionID, boolean taxExempt1,	 boolean taxExempt2,
			boolean taxExempt3, boolean taxExempt4, boolean taxExempt5, boolean taxExempt6,
			boolean taxExempt7, boolean taxExempt8, boolean taxExempt0,
			BigDecimal surtaxAmount, BigDecimal singleItemTaxAmount, Date emailTimeStamp,Integer rxContactId) {
		this.createdById = createdById;
		this.createdOn = createdOn;
		this.changedById = changedById;
		this.changedOn = changedOn;
		this.transactionStatus = transactionStatus;
		this.joReleaseId = joReleaseId;
		this.rxCustomerId = rxCustomerId;
		this.rxBillToId = rxBillToId;
		this.rxBillToAddressId = rxBillToAddressId;
		this.rxShipToId = rxShipToId;
		this.rxShipToAddressId = rxShipToAddressId;
		this.veShipViaId = veShipViaId;
		this.prFromWarehouseId = prFromWarehouseId;
		this.prToWarehouseId = prToWarehouseId;
		this.cuTermsId = cuTermsId;
		this.shipToMode = shipToMode;
		this.coTaxTerritoryId = coTaxTerritoryId;
		this.sonumber = sonumber;
		this.customerPonumber = customerPonumber;
		this.datePromised = datePromised;
		this.quickJobName = quickJobName;
		this.orderDate = orderDate;
		this.shipDate = shipDate;
		this.freight = freight;
		this.costTotal = costTotal;
		this.subTotal = subTotal;
		this.taxTotal = taxTotal;
		this.taxRate = taxRate;
		this.cuAssignmentId0 = cuAssignmentId0;
		this.cuAssignmentId1 = cuAssignmentId1;
		this.cuAssignmentId2 = cuAssignmentId2;
		this.cuAssignmentId3 = cuAssignmentId3;
		this.cuAssignmentId4 = cuAssignmentId4;
		this.trackingNumber = trackingNumber;
		this.surtaxOverrideCap = surtaxOverrideCap;
		this.surtaxTotal = surtaxTotal;
		this.surtaxRate = surtaxRate;
		this.surtaxAmount = surtaxAmount;
		this.singleItemTaxAmount = singleItemTaxAmount;
		this.tag = tag;
		this.freightCost = freightCost;
		this.coDivisionID = coDivisionID;
		this.taxExempt0 = taxExempt0;
		this.taxExempt1 = taxExempt1;
		this.taxExempt2 = taxExempt2;
		this.taxExempt3 = taxExempt3;
		this.taxExempt4 = taxExempt4;
		this.taxExempt5 = taxExempt5;
		this.taxExempt6 = taxExempt6;
		this.taxExempt7 = taxExempt7;
		this.taxExempt8 = taxExempt8;
		this.emailTimeStamp=emailTimeStamp;
		this.rxContactId=rxContactId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cuSOID", unique = true, nullable = false)
	public Integer getCuSoid() {
		return this.cuSoid;
	}

	public void setCuSoid(Integer cuSoid) {
		this.cuSoid = cuSoid;
	}

	@Column(name = "CreatedByID")
	public Integer getCreatedById() {
		return this.createdById;
	}

	public void setCreatedById(Integer createdById) {
		this.createdById = createdById;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedOn", length = 0)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "ChangedByID")
	public Integer getChangedById() {
		return this.changedById;
	}

	public void setChangedById(Integer changedById) {
		this.changedById = changedById;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ChangedOn", length = 0)
	public Date getChangedOn() {
		return this.changedOn;
	}

	public void setChangedOn(Date changedOn) {
		this.changedOn = changedOn;
	}

	@Column(name = "TransactionStatus")
	public Integer getTransactionStatus() {
		return this.transactionStatus;
	}

	public void setTransactionStatus(Integer transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	@Column(name = "joReleaseID")
	public Integer getJoReleaseId() {
		return this.joReleaseId;
	}

	public void setJoReleaseId(Integer joReleaseId) {
		this.joReleaseId = joReleaseId;
	}

	@Column(name = "rxCustomerID")
	public Integer getRxCustomerId() {
		return this.rxCustomerId;
	}

	public void setRxCustomerId(Integer rxCustomerId) {
		this.rxCustomerId = rxCustomerId;
	}

	@Column(name = "rxBillToID")
	public Integer getRxBillToId() {
		return this.rxBillToId;
	}

	public void setRxBillToId(Integer rxBillToId) {
		this.rxBillToId = rxBillToId;
	}

	@Column(name = "rxBillToAddressID")
	public Integer getRxBillToAddressId() {
		return this.rxBillToAddressId;
	}

	public void setRxBillToAddressId(Integer rxBillToAddressId) {
		this.rxBillToAddressId = rxBillToAddressId;
	}

	@Column(name = "rxShipToID")
	public Integer getRxShipToId() {
		return this.rxShipToId;
	}

	public void setRxShipToId(Integer rxShipToId) {
		this.rxShipToId = rxShipToId;
	}

	@Column(name = "rxShipToAddressID")
	public Integer getRxShipToAddressId() {
		return this.rxShipToAddressId;
	}

	public void setRxShipToAddressId(Integer rxShipToAddressId) {
		this.rxShipToAddressId = rxShipToAddressId;
	}

	@Column(name = "veShipViaID")
	public Integer getVeShipViaId() {
		return this.veShipViaId;
	}

	public void setVeShipViaId(Integer veShipViaId) {
		this.veShipViaId = veShipViaId;
	}

	@Column(name = "prFromWarehouseID")
	public Integer getPrFromWarehouseId() {
		return this.prFromWarehouseId;
	}

	public void setPrFromWarehouseId(Integer prFromWarehouseId) {
		this.prFromWarehouseId = prFromWarehouseId;
	}

	@Column(name = "prToWarehouseID")
	public Integer getPrToWarehouseId() {
		return this.prToWarehouseId;
	}

	public void setPrToWarehouseId(Integer prToWarehouseId) {
		this.prToWarehouseId = prToWarehouseId;
	}

	@Column(name = "cuTermsID")
	public Integer getCuTermsId() {
		return this.cuTermsId;
	}

	public void setCuTermsId(Integer cuTermsId) {
		this.cuTermsId = cuTermsId;
	}

	@Column(name = "ShipToMode", nullable = false)
	public byte getShipToMode() {
		return this.shipToMode;
	}

	public void setShipToMode(byte shipToMode) {
		this.shipToMode = shipToMode;
	}

	@Column(name = "coTaxTerritoryID")
	public Integer getCoTaxTerritoryId() {
		return this.coTaxTerritoryId;
	}

	public void setCoTaxTerritoryId(Integer coTaxTerritoryId) {
		this.coTaxTerritoryId = coTaxTerritoryId;
	}

	@Column(name = "SONumber", length = 20)
	public String getSonumber() {
		return this.sonumber;
	}

	public void setSonumber(String sonumber) {
		this.sonumber = sonumber;
	}

	@Column(name = "CustomerPONumber", length = 20)
	public String getCustomerPonumber() {
		return this.customerPonumber;
	}

	public void setCustomerPonumber(String customerPonumber) {
		this.customerPonumber = customerPonumber;
	}

	@Column(name = "DatePromised", length = 12)
	public String getDatePromised() {
		return this.datePromised;
	}

	public void setDatePromised(String datePromised) {
		this.datePromised = datePromised;
	}

	@Column(name = "QuickJobName", length = 40)
	public String getQuickJobName() {
		return this.quickJobName;
	}

	public void setQuickJobName(String quickJobName) {
		this.quickJobName = quickJobName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OrderDate", length = 0)
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ShipDate", length = 0)
	public Date getShipDate() {
		return this.shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	@Column(name = "Freight", scale = 4)
	public BigDecimal getFreight() {
		return this.freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

	@Column(name = "CostTotal", scale = 4)
	public BigDecimal getCostTotal() {
		return this.costTotal;
	}

	public void setCostTotal(BigDecimal costTotal) {
		this.costTotal = costTotal;
	}

	@Column(name = "SubTotal", scale = 4)
	public BigDecimal getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	@Column(name = "TaxTotal", scale = 4)
	public BigDecimal getTaxTotal() {
		return this.taxTotal;
	}

	public void setTaxTotal(BigDecimal taxTotal) {
		this.taxTotal = taxTotal;
	}

	@Column(name = "TaxRate", scale = 4)
	public BigDecimal getTaxRate() {
		return this.taxRate;
	}

	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	@Column(name = "cuAssignmentID0")
	public Integer getCuAssignmentId0() {
		return this.cuAssignmentId0;
	}

	public void setCuAssignmentId0(Integer cuAssignmentId0) {
		this.cuAssignmentId0 = cuAssignmentId0;
	}

	@Column(name = "cuAssignmentID1")
	public Integer getCuAssignmentId1() {
		return this.cuAssignmentId1;
	}

	public void setCuAssignmentId1(Integer cuAssignmentId1) {
		this.cuAssignmentId1 = cuAssignmentId1;
	}

	@Column(name = "cuAssignmentID2")
	public Integer getCuAssignmentId2() {
		return this.cuAssignmentId2;
	}

	public void setCuAssignmentId2(Integer cuAssignmentId2) {
		this.cuAssignmentId2 = cuAssignmentId2;
	}

	@Column(name = "cuAssignmentID3")
	public Integer getCuAssignmentId3() {
		return this.cuAssignmentId3;
	}

	public void setCuAssignmentId3(Integer cuAssignmentId3) {
		this.cuAssignmentId3 = cuAssignmentId3;
	}

	@Column(name = "cuAssignmentID4")
	public Integer getCuAssignmentId4() {
		return this.cuAssignmentId4;
	}

	public void setCuAssignmentId4(Integer cuAssignmentId4) {
		this.cuAssignmentId4 = cuAssignmentId4;
	}

	@Column(name = "TrackingNumber", length = 30)
	public String getTrackingNumber() {
		return this.trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	@Column(name = "SurtaxOverrideCap")
	public Boolean getSurtaxOverrideCap() {
		return this.surtaxOverrideCap;
	}

	public void setSurtaxOverrideCap(Boolean surtaxOverrideCap) {
		this.surtaxOverrideCap = surtaxOverrideCap;
	}

	@Column(name = "SurtaxTotal", scale = 4)
	public BigDecimal getSurtaxTotal() {
		return this.surtaxTotal;
	}

	public void setSurtaxTotal(BigDecimal surtaxTotal) {
		this.surtaxTotal = surtaxTotal;
	}

	@Column(name = "SurtaxRate", scale = 4)
	public BigDecimal getSurtaxRate() {
		return this.surtaxRate;
	}

	public void setSurtaxRate(BigDecimal surtaxRate) {
		this.surtaxRate = surtaxRate;
	}

	@Column(name = "SurtaxAmount", scale = 4)
	public BigDecimal getSurtaxAmount() {
		return this.surtaxAmount;
	}

	public void setSurtaxAmount(BigDecimal surtaxAmount) {
		this.surtaxAmount = surtaxAmount;
	}

	@Column(name = "SingleItemTaxAmount", scale = 4)
	public BigDecimal getSingleItemTaxAmount() {
		return this.singleItemTaxAmount;
	}

	public void setSingleItemTaxAmount(BigDecimal singleItemTaxAmount) {
		this.singleItemTaxAmount = singleItemTaxAmount;
	}

	@Column(name = "joSchedDetailID")
	public Integer getJoScheddDetailID() {
		return joScheddDetailID;
	}

	public void setJoScheddDetailID(Integer joScheddDetailID) {
		this.joScheddDetailID = joScheddDetailID;
	}

	@Column(name = "Tag")
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Column(name = "FreightCost", scale = 4)
	public BigDecimal getFreightCost() {
		return freightCost;
	}

	public void setFreightCost(BigDecimal freightCost) {
		this.freightCost = freightCost;
	}

	@Column(name = "coDivisionID")
	public Integer getCoDivisionID() {
		return coDivisionID;
	}

	public void setCoDivisionID(Integer coDivisionID) {
		this.coDivisionID = coDivisionID;
	}

	@Column(name = "TaxExempt1", scale = 4)
	public boolean isTaxExempt1() {
		return taxExempt1;
	}

	public void setTaxExempt1(boolean taxExempt1) {
		this.taxExempt1 = taxExempt1;
	}

	@Column(name = "TaxExempt2", scale = 4)
	public boolean isTaxExempt2() {
		return taxExempt2;
	}

	public void setTaxExempt2(boolean taxExempt2) {
		this.taxExempt2 = taxExempt2;
	}

	@Column(name = "TaxExempt3", scale = 4)
	public boolean isTaxExempt3() {
		return taxExempt3;
	}

	public void setTaxExempt3(boolean taxExempt3) {
		this.taxExempt3 = taxExempt3;
	}

	@Column(name = "TaxExempt4", scale = 4)
	public boolean isTaxExempt4() {
		return taxExempt4;
	}

	public void setTaxExempt4(boolean taxExempt4) {
		this.taxExempt4 = taxExempt4;
	}

	@Column(name = "TaxExempt5", scale = 4)
	public boolean isTaxExempt5() {
		return taxExempt5;
	}

	public void setTaxExempt5(boolean taxExempt5) {
		this.taxExempt5 = taxExempt5;
	}

	@Column(name = "TaxExempt6", scale = 4)
	public boolean isTaxExempt6() {
		return taxExempt6;
	}

	public void setTaxExempt6(boolean taxExempt6) {
		this.taxExempt6 = taxExempt6;
	}

	@Column(name = "TaxExempt7", scale = 4)
	public boolean isTaxExempt7() {
		return taxExempt7;
	}

	public void setTaxExempt7(boolean taxExempt7) {
		this.taxExempt7 = taxExempt7;
	}

	@Column(name = "TaxExempt8", scale = 4)
	public boolean isTaxExempt8() {
		return taxExempt8;
	}

	public void setTaxExempt8(boolean taxExempt8) {
		this.taxExempt8 = taxExempt8;
	}

	@Column(name = "TaxExempt0", scale = 4)
	public boolean isTaxExempt0() {
		return taxExempt0;
	}

	public void setTaxExempt0(boolean taxExempt0) {
		this.taxExempt0 = taxExempt0;
	}
	@Column(name = "emailTimeStamp")
	public Date getEmailTimeStamp() {
		return emailTimeStamp;
	}

	public void setEmailTimeStamp(Date emailTimeStamp) {
		this.emailTimeStamp = emailTimeStamp;
	}

	@Column(name = "rxContactID")
	public Integer getRxContactId() {
		return rxContactId;
	}

	public void setRxContactId(Integer rxContactId) {
		this.rxContactId = rxContactId;
	}

	@Column(name = "whseCostTotal")
	public BigDecimal getWhseCostTotal() {
		return whseCostTotal;
	}

	public void setWhseCostTotal(BigDecimal whseCostTotal) {
		this.whseCostTotal = whseCostTotal;
	}

	@Column(name = "ShiptoIndex")
	public Integer getShipToIndex() {
		return shipToIndex;
	}

	public void setShipToIndex(Integer shipToIndex) {
		this.shipToIndex = shipToIndex;
	}

	@Column(name = "withpriceStatus")
	public boolean isWithpriceStatus() {
		return withpriceStatus;
	}

	public void setWithpriceStatus(boolean withpriceStatus) {
		this.withpriceStatus = withpriceStatus;
	}
	

	@Column(name="taxfreight")
	public byte getTaxfreight() {
		return taxfreight;
	}

	public void setTaxfreight(byte taxfreight) {
		this.taxfreight = taxfreight;
	}
	@Column(name="TaxableSales")
	public BigDecimal getTaxableSales() {
		return taxableSales;
	}

	public void setTaxableSales(BigDecimal taxableSales) {
		this.taxableSales = taxableSales;
	}
	@Column(name="NonTaxableSales")
	public BigDecimal getNonTaxableSales() {
		return nonTaxableSales;
	}

	public void setNonTaxableSales(BigDecimal nonTaxableSales) {
		this.nonTaxableSales = nonTaxableSales;
	}

	@Transient
	public boolean isCuSOUsed() {
		return isCuSOUsed;
	}

	public void setCuSOUsed(boolean isCuSOUsed) {
		this.isCuSOUsed = isCuSOUsed;
	}
	
	
}
