package com.beinuan.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaAppBootstarp {

	public static void main(String[] args) {
		SpringApplication.run(EurekaAppBootstarp.class, args);
	}
}
