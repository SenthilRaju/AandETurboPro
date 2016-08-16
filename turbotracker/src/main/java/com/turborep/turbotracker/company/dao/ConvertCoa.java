package com.turborep.turbotracker.company.dao;

// Generated Jan 23, 2012 5:39:26 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ConvertCoa generated by hbm2java
 */
@Entity
@Table(name = "convert_coa", catalog = "")
public class ConvertCoa implements java.io.Serializable {

	private ConvertCoaId id;

	public ConvertCoa() {
	}

	public ConvertCoa(ConvertCoaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "account", column = @Column(name = "Account")),
			@AttributeOverride(name = "description", column = @Column(name = "Description")) })
	public ConvertCoaId getId() {
		return this.id;
	}

	public void setId(ConvertCoaId id) {
		this.id = id;
	}

}
