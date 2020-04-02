package com.beinuan.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
// ¿ªÆôzuul´úÀí
@EnableZuulProxy
public class ZuulAppMain {

	public static void main(String[] args) {
		SpringApplication.run(ZuulAppMain.class, args);
	}
}
