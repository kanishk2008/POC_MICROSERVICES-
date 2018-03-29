package com.infy.countryconversion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryValueRepository extends 
    JpaRepository<CountryConversionBean, Long>{
	CountryConversionBean findByFromAndTo(String from, String to);
}