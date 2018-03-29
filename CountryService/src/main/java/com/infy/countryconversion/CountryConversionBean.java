package com.infy.countryconversion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Country_Conversion")
public class CountryConversionBean {
 
	public CountryConversionBean() {
		super();
	}

	@Id
	private int id;
	 @Column(name="currency_from")
	  private String from;
	  
	  @Column(name="currency_to")
	  private String to;
	
	

	public CountryConversionBean(int id, String from, String to, String details) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.details = details;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column
	private String details;

public String getDetails() {
	return details;
}

public void setDetails(String details) {
	this.details = details;
}

public CountryConversionBean(String details) {
	super();
	this.details = details;
}
  
}