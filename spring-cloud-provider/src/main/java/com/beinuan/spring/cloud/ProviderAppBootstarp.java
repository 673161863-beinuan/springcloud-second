package com.beinuan.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// 开启断路器功能
@EnableCircuitBreaker
//高版本可以不加@EnableEurekaClient
@EnableEurekaClient
@SpringBootApplication
public class ProviderAppBootstarp {
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProviderAppBootstarp.class, args);
	}

}
