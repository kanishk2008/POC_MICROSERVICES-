package com.infy.forexservice;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Exchange_Value")
public class ForexServiceBean {
  
  @Id
  private Long id;
  
  @Column(name="currency_from")
  private String from;
  
  @Column(name="currency_to")
  private String to;
  
  private BigDecimal conversionMultiple;
  private int port;
  
  @Transient
  private String details;
  
  
  
  public String getDetails() {
	return details;
}


public void setDetails(String details) {
	this.details = details;
}


public ForexServiceBean() {
    
  }
  

  

  public Long getId() {
    return id;
  }

  public String getFrom() {
    return from;
  }

  public ForexServiceBean(String from, Long id, String to, String details, BigDecimal conversionMultiple, int port) {
	super();
	this.from = from;
	this.id = id;
	this.to = to;
	this.details = details;
	this.conversionMultiple = conversionMultiple;
	this.port = port;
}


public String getTo() {
    return to;
  }

  public BigDecimal getConversionMultiple() {
    return conversionMultiple;
  }
  
  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

}