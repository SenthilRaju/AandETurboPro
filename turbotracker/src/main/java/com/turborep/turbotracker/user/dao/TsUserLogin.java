package com.turborep.turbotracker.user.dao;
// Generated May 16, 2012 6:04:11 PM by Hibernate Tools 3.4.0.CR1


import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigInteger;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * TsUserLogin generated by hbm2java
 */
@Entity
@Table(name="tsUserLogin",catalog="")
public class TsUserLogin  implements java.io.Serializable {


	private Integer userLoginId;
	private String loginName;
	private String loginPassword;
	private String fullName;
	private String initials;
	private byte systemAdministrator;
	private byte salesRep;
	private byte employee0;
	private byte employee1;
	private byte employee2;
	private byte employee3;
	private byte employee4;
	private byte inactive;
	private String emailName;
	private String emailAddr;
	private String logOnName;
	private String logOnPswd;
	private byte useAuthentication;
	private String ccaddr1;
	private String ccname1;
	private String ccaddr2;
	private String ccname2;
	private String ccaddr3;
	private String ccname3;
	private String ccaddr4;
	private String ccname4;
	private String bccaddr;
	private String smtpsvr;
	private byte smtpemailActive;
	private Integer smtpport;
	private String userzipcode;
	private Integer userperpage;
	private Integer customerperpage;
	private Integer vendorperpage;
	private Integer employeeperpage;
	private Integer rolodexperpage;
	private Integer activeUserList;
	private Integer activeEmployeeList;
	private Integer chartsperpage;
	private Integer bankingperpage;
	private Integer inventoryperpage;
	private String appletLocalUrl;
	private Integer loginStatus;
	
	public TsUserLogin() {
	}

	
	public TsUserLogin(byte systemAdministrator, byte salesRep, byte employee0, byte employee1, byte employee2, byte employee3, byte employee4, byte inactive, byte useAuthentication, byte smtpemailActive) {
        this.systemAdministrator = systemAdministrator;
        this.salesRep = salesRep;
        this.employee0 = employee0;
        this.employee1 = employee1;
        this.employee2 = employee2;
        this.employee3 = employee3;
        this.employee4 = employee4;
        this.inactive = inactive;
        this.useAuthentication = useAuthentication;
        this.smtpemailActive = smtpemailActive;
	}
	public TsUserLogin(String loginName, String loginPassword, String fullName, String initials, byte systemAdministrator, byte salesRep, byte employee0, byte employee1, byte employee2, byte employee3, byte employee4, byte inactive, String emailName, String emailAddr, 
										String logOnName, String logOnPswd, byte useAuthentication, String ccaddr1, String ccname1, String ccaddr2, String ccname2, String ccaddr3, String ccname3, String ccaddr4, String ccname4, String bccaddr, String smtpsvr, 
										byte smtpemailActive, Integer smtpport, Set tsMessagesForFromId, Set tsUserGroupLinks, Set tsBugReports, Set tsMessagesForUserToId, String userzipcode, Integer userperpage, Integer customerperpage, Integer vendorperpage, 
										Integer employeeperpage, Integer theRoldoexperpage, Integer theActiveUserList, Integer theChartsperpage, Integer theBankingPerPage) {
		this.loginName = loginName;
		this.loginPassword = loginPassword;
		this.fullName = fullName;
		this.initials = initials;
		this.systemAdministrator = systemAdministrator;
		this.salesRep = salesRep;
		this.employee0 = employee0;
		this.employee1 = employee1;
		this.employee2 = employee2;
		this.employee3 = employee3;
		this.employee4 = employee4;
		this.inactive = inactive;
		this.emailName = emailName;
		this.emailAddr = emailAddr;
		this.logOnName = logOnName;
		this.logOnPswd = logOnPswd;
		this.useAuthentication = useAuthentication;
		this.ccaddr1 = ccaddr1;
		this.ccname1 = ccname1;
		this.ccaddr2 = ccaddr2;
		this.ccname2 = ccname2;
		this.ccaddr3 = ccaddr3;
		this.ccname3 = ccname3;
		this.ccaddr4 = ccaddr4;
		this.ccname4 = ccname4;
		this.bccaddr = bccaddr;
		this.smtpsvr = smtpsvr;
		this.smtpemailActive = smtpemailActive;
		this.smtpport = smtpport;
		this.userzipcode = userzipcode;
		this.userperpage =userperpage;
		this.customerperpage =customerperpage;
		this.vendorperpage =vendorperpage;
		this.employeeperpage =employeeperpage;
		this.rolodexperpage =theRoldoexperpage;
		this.activeUserList = theActiveUserList;
		this.chartsperpage = theChartsperpage;
		this.setBankingperpage(theBankingPerPage);
	}
   
	@Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="UserLoginID", unique=true, nullable=false)
    public Integer getUserLoginId() {
        return this.userLoginId;
    }
    
    public void setUserLoginId(Integer userLoginId) {
        this.userLoginId = userLoginId;
    }

    
    @Column(name="LoginName", length=15)
    public String getLoginName() {
        return this.loginName;
    }
    
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    
    @Column(name="LoginPassword", length=15)
    public String getLoginPassword() {
        return this.loginPassword;
    }
    
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    
    @Column(name="FullName", length=50)
    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    
    @Column(name="Initials", length=6)
    public String getInitials() {
        return this.initials;
    }
    
    public void setInitials(String initials) {
        this.initials = initials;
    }

    
    @Column(name="SystemAdministrator", nullable=false)
    public byte getSystemAdministrator() {
        return this.systemAdministrator;
    }
    
    public void setSystemAdministrator(byte systemAdministrator) {
        this.systemAdministrator = systemAdministrator;
    }

    
    @Column(name="SalesRep", nullable=false)
    public byte getSalesRep() {
        return this.salesRep;
    }
    
    public void setSalesRep(byte salesRep) {
        this.salesRep = salesRep;
    }

    
    @Column(name="Employee0", nullable=false)
    public byte getEmployee0() {
        return this.employee0;
    }
    
    public void setEmployee0(byte employee0) {
        this.employee0 = employee0;
    }

    
    @Column(name="Employee1", nullable=false)
    public byte getEmployee1() {
        return this.employee1;
    }
    
    public void setEmployee1(byte employee1) {
        this.employee1 = employee1;
    }

    
    @Column(name="Employee2", nullable=false)
    public byte getEmployee2() {
        return this.employee2;
    }
    
    public void setEmployee2(byte employee2) {
        this.employee2 = employee2;
    }

    
    @Column(name="Employee3", nullable=false)
    public byte getEmployee3() {
        return this.employee3;
    }
    
    public void setEmployee3(byte employee3) {
        this.employee3 = employee3;
    }

    
    @Column(name="Employee4", nullable=false)
    public byte getEmployee4() {
        return this.employee4;
    }
    
    public void setEmployee4(byte employee4) {
        this.employee4 = employee4;
    }

    
    @Column(name="Inactive", nullable=false)
    public byte getInactive() {
        return this.inactive;
    }
    
    public void setInactive(byte inactive) {
        this.inactive = inactive;
    }

    
    @Column(name="EmailName", length=64)
    public String getEmailName() {
        return this.emailName;
    }
    
    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    
    @Column(name="EmailAddr", length=128)
    public String getEmailAddr() {
        return this.emailAddr;
    }
    
    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    
    @Column(name="LogOnName", length=128)
    public String getLogOnName() {
        return this.logOnName;
    }
    
    public void setLogOnName(String logOnName) {
        this.logOnName = logOnName;
    }

    
    @Column(name="LogOnPswd", length=64)
    public String getLogOnPswd() {
        return this.logOnPswd;
    }
    
    public void setLogOnPswd(String logOnPswd) {
        this.logOnPswd = logOnPswd;
    }

    
    @Column(name="UseAuthentication", nullable=false)
    public byte getUseAuthentication() {
        return this.useAuthentication;
    }
    
    public void setUseAuthentication(byte useAuthentication) {
        this.useAuthentication = useAuthentication;
    }

    
    @Column(name="CCAddr1", length=128)
    public String getCcaddr1() {
        return this.ccaddr1;
    }
    
    public void setCcaddr1(String ccaddr1) {
        this.ccaddr1 = ccaddr1;
    }

    
    @Column(name="CCName1", length=128)
    public String getCcname1() {
        return this.ccname1;
    }
    
    public void setCcname1(String ccname1) {
        this.ccname1 = ccname1;
    }

    
    @Column(name="CCAddr2", length=128)
    public String getCcaddr2() {
        return this.ccaddr2;
    }
    
    public void setCcaddr2(String ccaddr2) {
        this.ccaddr2 = ccaddr2;
    }

    
    @Column(name="CCName2", length=128)
    public String getCcname2() {
        return this.ccname2;
    }
    
    public void setCcname2(String ccname2) {
        this.ccname2 = ccname2;
    }

    
    @Column(name="CCAddr3", length=128)
    public String getCcaddr3() {
        return this.ccaddr3;
    }
    
    public void setCcaddr3(String ccaddr3) {
        this.ccaddr3 = ccaddr3;
    }

    
    @Column(name="CCName3", length=128)
    public String getCcname3() {
        return this.ccname3;
    }
    
    public void setCcname3(String ccname3) {
        this.ccname3 = ccname3;
    }

    
    @Column(name="CCAddr4", length=128)
    public String getCcaddr4() {
        return this.ccaddr4;
    }
    
    public void setCcaddr4(String ccaddr4) {
        this.ccaddr4 = ccaddr4;
    }

    
    @Column(name="CCName4", length=128)
    public String getCcname4() {
        return this.ccname4;
    }
    
    public void setCcname4(String ccname4) {
        this.ccname4 = ccname4;
    }

    
    @Column(name="BCCaddr", length=128)
    public String getBccaddr() {
        return this.bccaddr;
    }
    
    public void setBccaddr(String bccaddr) {
        this.bccaddr = bccaddr;
    }

    
    @Column(name="SMTPSvr", length=128)
    public String getSmtpsvr() {
        return this.smtpsvr;
    }
    
    public void setSmtpsvr(String smtpsvr) {
        this.smtpsvr = smtpsvr;
    }

    
    @Column(name="SMTPEmailActive", nullable=false)
    public byte getSmtpemailActive() {
        return this.smtpemailActive;
    }
    
    public void setSmtpemailActive(byte smtpemailActive) {
        this.smtpemailActive = smtpemailActive;
    }

    
    @Column(name="SMTPPort")
    public Integer getSmtpport() {
        return this.smtpport;
    }
    
    public void setSmtpport(Integer smtpport) {
        this.smtpport = smtpport;
    }

    @Column(name="userZipCode")
	public String getUserzipcode() {
		return userzipcode;
	}


	public void setUserzipcode(String userzipcode) {
		this.userzipcode = userzipcode;
	}

	@Column(name="userPerPage")
	public Integer getUserperpage() {
		return userperpage;
	}


	public void setUserperpage(Integer userperpage) {
		this.userperpage = userperpage;
	}

	@Column(name="customerPerPage")
	public Integer getCustomerperpage() {
		return customerperpage;
	}


	public void setCustomerperpage(Integer customerperpage) {
		this.customerperpage = customerperpage;
	}

	@Column(name="vendorPerPage")
	public Integer getVendorperpage() {
		return vendorperpage;
	}


	public void setVendorperpage(Integer vendorperpage) {
		this.vendorperpage = vendorperpage;
	}

	@Column(name="employeePerPage")
	public Integer getEmployeeperpage() {
		return employeeperpage;
	}


	public void setEmployeeperpage(Integer employeeperpage) {
		this.employeeperpage = employeeperpage;
	}

	@Column(name="rolodexPerPage")
	public Integer getRolodexperpage() {
		return rolodexperpage;
	}

	public void setRolodexperpage(Integer rolodexperpage) {
		this.rolodexperpage = rolodexperpage;
	}

	@Column(name="activeUserList")
	public Integer getActiveUserList() {
		return activeUserList;
	}

	public void setActiveUserList(Integer activeUserList) {
		this.activeUserList = activeUserList;
	}

	@Column(name="activeEmployeeList")
	public Integer getActiveEmployeeList() {
		return activeEmployeeList;
	}

	public void setActiveEmployeeList(Integer activeEmployeeList) {
		this.activeEmployeeList = activeEmployeeList;
	}

	@Column(name="chartAccountPerPage")
	public Integer getChartsperpage() {
		return chartsperpage;
	}

	public void setChartsperpage(Integer chartsperpage) {
		this.chartsperpage = chartsperpage;
	}

	@Column(name="bankingPerPage")
	public Integer getBankingperpage() {
		return bankingperpage;
	}

	public void setBankingperpage(Integer bankingperpage) {
		this.bankingperpage = bankingperpage;
	}

	
	@Column(name="inventoryPerPage")
	public Integer getInventoryperpage() {
		return inventoryperpage;
	}


	public void setInventoryperpage(Integer inventoryperpage) {
		this.inventoryperpage = inventoryperpage;
	}
	
	@Column(name="appletLocalUrl")
	public String getAppletLocalUrl() {
		return appletLocalUrl;
	}


	public void setAppletLocalUrl(String appletLocalUrl) {
		this.appletLocalUrl = appletLocalUrl;
	}

   @Column(name="LoginStatus")
	public Integer getLoginStatus() {
		return loginStatus;
	}


	public void setLoginStatus(Integer loginStatus) {
		this.loginStatus = loginStatus;
	}
}
