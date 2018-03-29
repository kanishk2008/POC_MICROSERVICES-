package com.infy.countryconversion;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CountryConversionController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	  private CountryValueRepository repository;
	
	 @GetMapping("/country-details/from/{from}/to/{to}")
	  public CountryConversionBean retrieveCountryDetails
	    (@PathVariable String from, @PathVariable String to){
		
		 CountryConversionBean bean = 
			        repository.findByFromAndTo(from, to);     
	    return bean;
	  }

	

}