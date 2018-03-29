package com.infy.forexservice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForexValueRepository extends 
    JpaRepository<ForexServiceBean, Long>{
  ForexServiceBean findByFromAndTo(String from, String to);
}