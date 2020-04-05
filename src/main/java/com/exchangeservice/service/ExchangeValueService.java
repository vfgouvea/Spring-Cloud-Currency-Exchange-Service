package com.exchangeservice.service;

import com.exchangeservice.model.ExchangeValue;
import com.exchangeservice.repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeValueService {

    @Autowired
    private ExchangeValueRepository repository;

    public ExchangeValueService(){  }

    public ExchangeValue findByFromAndTo(String from, String to){
        return repository.findByFromAndTo(from,to);
    }


}
