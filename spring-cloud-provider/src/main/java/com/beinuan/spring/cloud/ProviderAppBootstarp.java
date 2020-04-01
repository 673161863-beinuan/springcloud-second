package com.beinuan.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// ������·������
@EnableCircuitBreaker
//�߰汾���Բ���@EnableEurekaClient
@EnableEurekaClient
@SpringBootApplication
public class ProviderAppBootstarp {
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProviderAppBootstarp.class, args);
	}

}
