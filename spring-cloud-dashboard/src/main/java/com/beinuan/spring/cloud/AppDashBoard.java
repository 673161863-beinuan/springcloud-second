package com.beinuan.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
// @EnableHystrixDashboard ¿ªÆô¼à¿ØÒÇ±íÅÌ
@EnableHystrixDashboard
public class AppDashBoard {

	
	public static void main(String[] args) {
		SpringApplication.run(AppDashBoard.class, args);
	}
}
