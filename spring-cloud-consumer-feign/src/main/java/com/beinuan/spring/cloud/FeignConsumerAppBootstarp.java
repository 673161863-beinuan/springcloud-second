package com.beinuan.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// 开启Feign客户端，不开启会找不到服务
@EnableFeignClients
@SpringBootApplication
public class FeignConsumerAppBootstarp {
	
	
	public static void main(String[] args) {
		SpringApplication.run(FeignConsumerAppBootstarp.class, args);
	}

}
