package com.turborep.turbotracker.customer.dao;

// Generated Jan 23, 2012 5:39:26 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * Cumaster generated by hbm2java
 */
@Entity
@Table(name = "cuMaster", catalog = "")
public class Cumaster implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int cuMasterId;
	private Integer cuTermsId;
	private Integer cuAssignmentId0;
	private Integer cuAssignmentId1;
	private Integer cuAssignmentId2;
	private Integer cuAssignmentId3;
	private Integer cuAssignmentId4;
	private Boolean porequired;
	private Integer cuMasterTypeId;
	private Byte priceLevel;
	private Boolean creditHold;
	private BigDecimal creditLimit;
	private Date creditHoldOverride;
	private String taxExemptNumber;
	private String accountNumber;
	
    private Integer coDivisionId;
    private byte finCharge;
    private Date creditAppDate;
    private byte statements;
    private Integer quoteMethod;
    private Integer invoiceMethod;
    private Integer statementMethod;
    private BigDecimal defaultMult;
    private String qmText;
    private String imText;
    private String smText;
    private Integer prWarehouseId;
    private Date avgDaysAsOf;
    private byte useAvgDaysAsOf;
    private String salesrep;
    private String csr;
    private String salesmgr;
    private String engineer;
    private String projectmgr;
    
    private Date currentDate;
    private Integer defaultTaxTerritory;
    private Integer coTaxID;
    private String taxName;
    private String taxRate;
    
    
	public Cumaster() {
	}

	public Cumaster(int cuMasterId) {
		this.cuMasterId = cuMasterId;
	}

	public Cumaster(int cuMasterId, Integer cuTermsId, Integer cuAssignmentId0,
			Integer cuAssignmentId1, Integer cuAssignmentId2,
			Integer cuAssignmentId3, Integer cuAssignmentId4,
			Boolean porequired, Integer cuMasterTypeId, Byte priceLevel,
			Boolean creditHold, BigDecimal creditLimit,
			Date creditHoldOverride, String taxExemptNumber,
			String accountNumber, Integer coDivisionId, byte finCharge, 
			Date creditAppDate, byte statements, Integer quoteMethod, Integer invoiceMethod, 
			Integer statementMethod, BigDecimal defaultMult, String qmText, 
			String imText, String smText, Integer prWarehouseId, Date avgDaysAsOf, byte useAvgDaysAsOf) {
		this.cuMasterId = cuMasterId;
		this.cuTermsId = cuTermsId;
		this.cuAssignmentId0 = cuAssignmentId0;
		this.cuAssignmentId1 = cuAssignmentId1;
		this.cuAssignmentId2 = cuAssignmentId2;
		this.cuAssignmentId3 = cuAssignmentId3;
		this.cuAssignmentId4 = cuAssignmentId4;
		this.porequired = porequired;
		this.cuMasterTypeId = cuMasterTypeId;
		this.priceLevel = priceLevel;
		this.creditHold = creditHold;
		this.creditLimit = creditLimit;
		this.creditHoldOverride = creditHoldOverride;
		this.taxExemptNumber = taxExemptNumber;
		this.accountNumber = accountNumber;
		this.coDivisionId = coDivisionId;
		this.finCharge = finCharge;
		this.creditAppDate = creditAppDate;
		this.statements = statements;
		this.quoteMethod = quoteMethod;
		this.invoiceMethod = invoiceMethod;
		this.statementMethod = statementMethod;
		this.defaultMult = defaultMult;
		this.qmText = qmText;
		this.imText = imText;
		this.smText = smText;
		this.prWarehouseId = prWarehouseId;
		this.avgDaysAsOf = avgDaysAsOf;
		this.useAvgDaysAsOf = useAvgDaysAsOf;
	}

	@Id
	@Column(name = "cuMasterID", unique = true, nullable = false)
	public int getCuMasterId() {
		return this.cuMasterId;
	}

	public void setCuMasterId(int cuMasterId) {
		this.cuMasterId = cuMasterId;
	}

	@Column(name = "cuTermsID")
	public Integer getCuTermsId() {
		return this.cuTermsId;
	}

	public void setCuTermsId(Integer cuTermsId) {
		this.cuTermsId = cuTermsId;
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

	@Column(name = "PORequired")
	public Boolean getPorequired() {
		return this.porequired;
	}

	public void setPorequired(Boolean porequired) {
		this.porequired = porequired;
	}

	@Column(name = "cuMasterTypeID")
	public Integer getCuMasterTypeId() {
		return this.cuMasterTypeId;
	}

	public void setCuMasterTypeId(Integer cuMasterTypeId) {
		this.cuMasterTypeId = cuMasterTypeId;
	}

	@Column(name = "PriceLevel")
	public Byte getPriceLevel() {
		return this.priceLevel;
	}

	public void setPriceLevel(Byte priceLevel) {
		this.priceLevel = priceLevel;
	}

	@Column(name = "CreditHold")
	public Boolean getCreditHold() {
		return this.creditHold;
	}

	public void setCreditHold(Boolean creditHold) {
		this.creditHold = creditHold;
	}

	@Column(name = "CreditLimit", scale = 4)
	public BigDecimal getCreditLimit() {
		return this.creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreditHoldOverride", length = 0)
	public Date getCreditHoldOverride() {
		return this.creditHoldOverride;
	}

	public void setCreditHoldOverride(Date creditHoldOverride) {
		this.creditHoldOverride = creditHoldOverride;
	}

	@Column(name = "TaxExemptNumber", length = 30)
	public String getTaxExemptNumber() {
		return this.taxExemptNumber;
	}

	public void setTaxExemptNumber(String taxExemptNumber) {
		this.taxExemptNumber = taxExemptNumber;
	}

	@Column(name = "AccountNumber", length = 20)
	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

    @Column(name="coDivisionID")
    public Integer getCoDivisionId() {
        return this.coDivisionId;
    }
    
    public void setCoDivisionId(Integer coDivisionId) {
        this.coDivisionId = coDivisionId;
    }

    
    @Column(name="FinCharge", nullable=false)
    public byte getFinCharge() {
        return this.finCharge;
    }
    
    public void setFinCharge(byte finCharge) {
        this.finCharge = finCharge;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CreditAppDate", length=19)
    public Date getCreditAppDate() {
        return this.creditAppDate;
    }
    
    public void setCreditAppDate(Date creditAppDate) {
        this.creditAppDate = creditAppDate;
    }

    
    @Column(name="Statements", nullable=false)
    public byte getStatements() {
        return this.statements;
    }
    
    public void setStatements(byte statements) {
        this.statements = statements;
    }

    
    @Column(name="QuoteMethod")
    public Integer getQuoteMethod() {
        return this.quoteMethod;
    }
    
    public void setQuoteMethod(Integer quoteMethod) {
        this.quoteMethod = quoteMethod;
    }

    
    @Column(name="InvoiceMethod")
    public Integer getInvoiceMethod() {
        return this.invoiceMethod;
    }
    
    public void setInvoiceMethod(Integer invoiceMethod) {
        this.invoiceMethod = invoiceMethod;
    }

    
    @Column(name="StatementMethod")
    public Integer getStatementMethod() {
        return this.statementMethod;
    }
    
    public void setStatementMethod(Integer statementMethod) {
        this.statementMethod = statementMethod;
    }

    
    @Column(name="DefaultMult", scale=4)
    public BigDecimal getDefaultMult() {
        return this.defaultMult;
    }
    
    public void setDefaultMult(BigDecimal defaultMult) {
        this.defaultMult = defaultMult;
    }

    
    @Column(name="QM_Text", length=64)
    public String getQmText() {
        return this.qmText;
    }
    
    public void setQmText(String qmText) {
        this.qmText = qmText;
    }

    
    @Column(name="IM_Text", length=64)
    public String getImText() {
        return this.imText;
    }
    
    public void setImText(String imText) {
        this.imText = imText;
    }

    
    @Column(name="SM_Text", length=64)
    public String getSmText() {
        return this.smText;
    }
    
    public void setSmText(String smText) {
        this.smText = smText;
    }

    
    @Column(name="prWarehouseID")
    public Integer getPrWarehouseId() {
        return this.prWarehouseId;
    }
    
    public void setPrWarehouseId(Integer prWarehouseId) {
        this.prWarehouseId = prWarehouseId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="AvgDaysAsOf", length=19)
    public Date getAvgDaysAsOf() {
        return this.avgDaysAsOf;
    }
    
    public void setAvgDaysAsOf(Date avgDaysAsOf) {
        this.avgDaysAsOf = avgDaysAsOf;
    }

    
    @Column(name="UseAvgDaysAsOf", nullable=false)
    public byte getUseAvgDaysAsOf() {
        return this.useAvgDaysAsOf;
    }
    
    public void setUseAvgDaysAsOf(byte useAvgDaysAsOf) {
        this.useAvgDaysAsOf = useAvgDaysAsOf;
    }
    @Transient
	public String getSalesrep() {
		return salesrep;
	}
	public void setSalesrep(String salesrep) {
		this.salesrep = salesrep;
	}
	@Transient
	public String getCsr() {
		return csr;
	}
	public void setCsr(String csr) {
		this.csr = csr;
	}
	@Transient
	public String getEngineer() {
		return engineer;
	}

	public void setEngineer(String engineer) {
		this.engineer = engineer;
	}
	@Transient
	public String getProjectmgr() {
		return projectmgr;
	}

	public void setProjectmgr(String projectmgr) {
		this.projectmgr = projectmgr;
	}

	
	@Transient
	public String getSalesmgr() {
		return salesmgr;
	}
	@Transient
	public void setSalesmgr(String salesmgr) {
		this.salesmgr = salesmgr;
	}
	
	
	@Transient
	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	@Transient
	public Integer getDefaultTaxTerritory() {
		return defaultTaxTerritory;
	}

	public void setDefaultTaxTerritory(Integer defaultTaxTerritory) {
		this.defaultTaxTerritory = defaultTaxTerritory;
	}

	@Transient
	public Integer getCoTaxID() {
		return coTaxID;
	}

	public void setCoTaxID(Integer coTaxID) {
		this.coTaxID = coTaxID;
	}

	@Transient
	public String getTaxName() {
		return taxName;
	}

	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}

	@Transient
	public String getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}
	
	

}
