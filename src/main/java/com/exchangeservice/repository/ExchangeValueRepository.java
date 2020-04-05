package com.exchangeservice.repository;


import com.exchangeservice.model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {

    ExchangeValue findByFromAndTo(String from,String to);

}
