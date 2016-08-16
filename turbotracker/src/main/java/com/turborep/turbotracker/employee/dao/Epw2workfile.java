package com.turborep.turbotracker.employee.dao;

// Generated Jan 23, 2012 5:39:26 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Epw2workfile generated by hbm2java
 */
@Entity
@Table(name = "epw2workfile", catalog = "")
public class Epw2workfile implements java.io.Serializable {

	private Integer epW2workFileId;
	private String la;
	private String lb;
	private String lc1;
	private String lc2;
	private String lc3;
	private String lc4;
	private String ld;
	private String le1;
	private String le2;
	private String le3;
	private String le4;
	private String le5;
	private String le6;
	private String l1;
	private String l2;
	private String l3;
	private String l4;
	private String l5;
	private String l6;
	private String l7;
	private String l8;
	private String l9;
	private String l10;
	private String l11;
	private String l12a1;
	private String l12a2;
	private String l12b1;
	private String l12b2;
	private String l12c1;
	private String l12c2;
	private String l12d1;
	private String l12d2;
	private String l13a;
	private String l13b;
	private String l13c;
	private String l14a1;
	private String l14a2;
	private String l14b1;
	private String l14b2;
	private String l14c1;
	private String l14c2;
	private String l15a;
	private String l15b;
	private String l16;
	private String l17;
	private String l18;
	private String l19;
	private String l20;

	public Epw2workfile() {
	}

	public Epw2workfile(String la, String lb, String lc1, String lc2,
			String lc3, String lc4, String ld, String le1, String le2,
			String le3, String le4, String le5, String le6, String l1,
			String l2, String l3, String l4, String l5, String l6, String l7,
			String l8, String l9, String l10, String l11, String l12a1,
			String l12a2, String l12b1, String l12b2, String l12c1,
			String l12c2, String l12d1, String l12d2, String l13a, String l13b,
			String l13c, String l14a1, String l14a2, String l14b1,
			String l14b2, String l14c1, String l14c2, String l15a, String l15b,
			String l16, String l17, String l18, String l19, String l20) {
		this.la = la;
		this.lb = lb;
		this.lc1 = lc1;
		this.lc2 = lc2;
		this.lc3 = lc3;
		this.lc4 = lc4;
		this.ld = ld;
		this.le1 = le1;
		this.le2 = le2;
		this.le3 = le3;
		this.le4 = le4;
		this.le5 = le5;
		this.le6 = le6;
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
		this.l5 = l5;
		this.l6 = l6;
		this.l7 = l7;
		this.l8 = l8;
		this.l9 = l9;
		this.l10 = l10;
		this.l11 = l11;
		this.l12a1 = l12a1;
		this.l12a2 = l12a2;
		this.l12b1 = l12b1;
		this.l12b2 = l12b2;
		this.l12c1 = l12c1;
		this.l12c2 = l12c2;
		this.l12d1 = l12d1;
		this.l12d2 = l12d2;
		this.l13a = l13a;
		this.l13b = l13b;
		this.l13c = l13c;
		this.l14a1 = l14a1;
		this.l14a2 = l14a2;
		this.l14b1 = l14b1;
		this.l14b2 = l14b2;
		this.l14c1 = l14c1;
		this.l14c2 = l14c2;
		this.l15a = l15a;
		this.l15b = l15b;
		this.l16 = l16;
		this.l17 = l17;
		this.l18 = l18;
		this.l19 = l19;
		this.l20 = l20;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "epW2WorkFileID", unique = true, nullable = false)
	public Integer getEpW2workFileId() {
		return this.epW2workFileId;
	}

	public void setEpW2workFileId(Integer epW2workFileId) {
		this.epW2workFileId = epW2workFileId;
	}

	@Column(name = "la", length = 50)
	public String getLa() {
		return this.la;
	}

	public void setLa(String la) {
		this.la = la;
	}

	@Column(name = "lb", length = 50)
	public String getLb() {
		return this.lb;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	@Column(name = "lc1", length = 50)
	public String getLc1() {
		return this.lc1;
	}

	public void setLc1(String lc1) {
		this.lc1 = lc1;
	}

	@Column(name = "lc2", length = 50)
	public String getLc2() {
		return this.lc2;
	}

	public void setLc2(String lc2) {
		this.lc2 = lc2;
	}

	@Column(name = "lc3", length = 50)
	public String getLc3() {
		return this.lc3;
	}

	public void setLc3(String lc3) {
		this.lc3 = lc3;
	}

	@Column(name = "lc4", length = 50)
	public String getLc4() {
		return this.lc4;
	}

	public void setLc4(String lc4) {
		this.lc4 = lc4;
	}

	@Column(name = "ld", length = 50)
	public String getLd() {
		return this.ld;
	}

	public void setLd(String ld) {
		this.ld = ld;
	}

	@Column(name = "le1", length = 50)
	public String getLe1() {
		return this.le1;
	}

	public void setLe1(String le1) {
		this.le1 = le1;
	}

	@Column(name = "le2", length = 50)
	public String getLe2() {
		return this.le2;
	}

	public void setLe2(String le2) {
		this.le2 = le2;
	}

	@Column(name = "le3", length = 50)
	public String getLe3() {
		return this.le3;
	}

	public void setLe3(String le3) {
		this.le3 = le3;
	}

	@Column(name = "le4", length = 50)
	public String getLe4() {
		return this.le4;
	}

	public void setLe4(String le4) {
		this.le4 = le4;
	}

	@Column(name = "le5", length = 50)
	public String getLe5() {
		return this.le5;
	}

	public void setLe5(String le5) {
		this.le5 = le5;
	}

	@Column(name = "le6", length = 50)
	public String getLe6() {
		return this.le6;
	}

	public void setLe6(String le6) {
		this.le6 = le6;
	}

	@Column(name = "l1", length = 50)
	public String getL1() {
		return this.l1;
	}

	public void setL1(String l1) {
		this.l1 = l1;
	}

	@Column(name = "l2", length = 50)
	public String getL2() {
		return this.l2;
	}

	public void setL2(String l2) {
		this.l2 = l2;
	}

	@Column(name = "l3", length = 50)
	public String getL3() {
		return this.l3;
	}

	public void setL3(String l3) {
		this.l3 = l3;
	}

	@Column(name = "l4", length = 50)
	public String getL4() {
		return this.l4;
	}

	public void setL4(String l4) {
		this.l4 = l4;
	}

	@Column(name = "l5", length = 50)
	public String getL5() {
		return this.l5;
	}

	public void setL5(String l5) {
		this.l5 = l5;
	}

	@Column(name = "l6", length = 50)
	public String getL6() {
		return this.l6;
	}

	public void setL6(String l6) {
		this.l6 = l6;
	}

	@Column(name = "l7", length = 50)
	public String getL7() {
		return this.l7;
	}

	public void setL7(String l7) {
		this.l7 = l7;
	}

	@Column(name = "l8", length = 50)
	public String getL8() {
		return this.l8;
	}

	public void setL8(String l8) {
		this.l8 = l8;
	}

	@Column(name = "l9", length = 50)
	public String getL9() {
		return this.l9;
	}

	public void setL9(String l9) {
		this.l9 = l9;
	}

	@Column(name = "l10", length = 50)
	public String getL10() {
		return this.l10;
	}

	public void setL10(String l10) {
		this.l10 = l10;
	}

	@Column(name = "l11", length = 50)
	public String getL11() {
		return this.l11;
	}

	public void setL11(String l11) {
		this.l11 = l11;
	}

	@Column(name = "l12a1", length = 1)
	public String getL12a1() {
		return this.l12a1;
	}

	public void setL12a1(String l12a1) {
		this.l12a1 = l12a1;
	}

	@Column(name = "l12a2", length = 50)
	public String getL12a2() {
		return this.l12a2;
	}

	public void setL12a2(String l12a2) {
		this.l12a2 = l12a2;
	}

	@Column(name = "l12b1", length = 1)
	public String getL12b1() {
		return this.l12b1;
	}

	public void setL12b1(String l12b1) {
		this.l12b1 = l12b1;
	}

	@Column(name = "l12b2", length = 50)
	public String getL12b2() {
		return this.l12b2;
	}

	public void setL12b2(String l12b2) {
		this.l12b2 = l12b2;
	}

	@Column(name = "l12c1", length = 1)
	public String getL12c1() {
		return this.l12c1;
	}

	public void setL12c1(String l12c1) {
		this.l12c1 = l12c1;
	}

	@Column(name = "l12c2", length = 50)
	public String getL12c2() {
		return this.l12c2;
	}

	public void setL12c2(String l12c2) {
		this.l12c2 = l12c2;
	}

	@Column(name = "l12d1", length = 1)
	public String getL12d1() {
		return this.l12d1;
	}

	public void setL12d1(String l12d1) {
		this.l12d1 = l12d1;
	}

	@Column(name = "l12d2", length = 50)
	public String getL12d2() {
		return this.l12d2;
	}

	public void setL12d2(String l12d2) {
		this.l12d2 = l12d2;
	}

	@Column(name = "l13a", length = 1)
	public String getL13a() {
		return this.l13a;
	}

	public void setL13a(String l13a) {
		this.l13a = l13a;
	}

	@Column(name = "l13b", length = 1)
	public String getL13b() {
		return this.l13b;
	}

	public void setL13b(String l13b) {
		this.l13b = l13b;
	}

	@Column(name = "l13c", length = 1)
	public String getL13c() {
		return this.l13c;
	}

	public void setL13c(String l13c) {
		this.l13c = l13c;
	}

	@Column(name = "l14a1", length = 50)
	public String getL14a1() {
		return this.l14a1;
	}

	public void setL14a1(String l14a1) {
		this.l14a1 = l14a1;
	}

	@Column(name = "l14a2", length = 50)
	public String getL14a2() {
		return this.l14a2;
	}

	public void setL14a2(String l14a2) {
		this.l14a2 = l14a2;
	}

	@Column(name = "l14b1", length = 50)
	public String getL14b1() {
		return this.l14b1;
	}

	public void setL14b1(String l14b1) {
		this.l14b1 = l14b1;
	}

	@Column(name = "l14b2", length = 50)
	public String getL14b2() {
		return this.l14b2;
	}

	public void setL14b2(String l14b2) {
		this.l14b2 = l14b2;
	}

	@Column(name = "l14c1", length = 50)
	public String getL14c1() {
		return this.l14c1;
	}

	public void setL14c1(String l14c1) {
		this.l14c1 = l14c1;
	}

	@Column(name = "l14c2", length = 50)
	public String getL14c2() {
		return this.l14c2;
	}

	public void setL14c2(String l14c2) {
		this.l14c2 = l14c2;
	}

	@Column(name = "l15a", length = 50)
	public String getL15a() {
		return this.l15a;
	}

	public void setL15a(String l15a) {
		this.l15a = l15a;
	}

	@Column(name = "l15b", length = 50)
	public String getL15b() {
		return this.l15b;
	}

	public void setL15b(String l15b) {
		this.l15b = l15b;
	}

	@Column(name = "l16", length = 50)
	public String getL16() {
		return this.l16;
	}

	public void setL16(String l16) {
		this.l16 = l16;
	}

	@Column(name = "l17", length = 50)
	public String getL17() {
		return this.l17;
	}

	public void setL17(String l17) {
		this.l17 = l17;
	}

	@Column(name = "l18", length = 50)
	public String getL18() {
		return this.l18;
	}

	public void setL18(String l18) {
		this.l18 = l18;
	}

	@Column(name = "l19", length = 50)
	public String getL19() {
		return this.l19;
	}

	public void setL19(String l19) {
		this.l19 = l19;
	}

	@Column(name = "l20", length = 50)
	public String getL20() {
		return this.l20;
	}

	public void setL20(String l20) {
		this.l20 = l20;
	}

}
