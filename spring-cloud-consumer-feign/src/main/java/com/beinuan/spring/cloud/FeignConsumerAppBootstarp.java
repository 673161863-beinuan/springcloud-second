package com.beinuan.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// ����Feign�ͻ��ˣ����������Ҳ�������
@EnableFeignClients
@SpringBootApplication
public class FeignConsumerAppBootstarp {
	
	
	public static void main(String[] args) {
		SpringApplication.run(FeignConsumerAppBootstarp.class, args);
	}

}
