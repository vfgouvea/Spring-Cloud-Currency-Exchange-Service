package com.exchangeservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeApplication.class, args);
	}

	//Serve para rastrear a requisiçao, assim , se der pau pelo caminho eu sei onde deu
	//2020-03-20 13:27:05.388  INFO [currency-exchange-service,8cb1b72d5e9fcf99,2a07d33d94637964,true] id->8cb1b72d5e9fcf99
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
}
