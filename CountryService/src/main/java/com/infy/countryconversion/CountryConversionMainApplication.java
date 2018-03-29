package com.infy.countryconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients("com.in28minutes.springboot.microservice.example.currencyconversion")
//@EnableDiscoveryClient
public class CountryConversionMainApplication {
  public static void main(String[] args) {
    SpringApplication.run(CountryConversionMainApplication.class, args);
  }
}