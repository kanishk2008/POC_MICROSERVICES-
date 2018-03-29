package com.infy.forexservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class ForexServiceController {
  
  @Autowired
  private Environment environment;
  
  @Autowired
  private ForexValueRepository repository;
  
  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public ForexServiceBean retrieveExchangeValue
    (@PathVariable String from, @PathVariable String to){
    
    ForexServiceBean exchangeValue =  
        repository.findByFromAndTo(from, to);
    /*Map<String, String> uriVariables = new HashMap<>();
	uriVariables.put("from", from);
	uriVariables.put("to", to);
	String det = new RestTemplate().getForObject(
			"http://localhost:8200/country-details/from/{from}/to/{to}", String.class,
			uriVariables);
	
	 

	String delimiter = ":\""; 
	Pattern pattern = Pattern.compile(Pattern.quote(delimiter)); 
	String[] tokens = pattern.split(det);
	for(int i =0; i< tokens.length;i++) {
		System.out.println(tokens[i]);
	}
	*/
	
    exchangeValue.setPort(
        Integer.parseInt(environment.getProperty("local.server.port")));
    //Integer index = tokens[tokens.length-1].indexOf("\\");
    
    //exchangeValue.setDetails();
    return exchangeValue;
  }
  
  @GetMapping("/currency-exchange/parallel/from/{from}/to/{to}")
  public ForexServiceBean retrieveExchangeValueAlone
    (@PathVariable String from, @PathVariable String to){
    
    ForexServiceBean exchangeValue =  
        repository.findByFromAndTo(from, to);
   
    exchangeValue.setPort(
            Integer.parseInt(environment.getProperty("local.server.port")));
	
	    
    
    return exchangeValue;
  }
  
  
  
}