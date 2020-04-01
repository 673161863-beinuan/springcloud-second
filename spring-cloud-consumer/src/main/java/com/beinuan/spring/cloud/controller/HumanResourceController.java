package com.beinuan.spring.cloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.beinuan.spring.cloud.bean.Employee;

@RestController
public class HumanResourceController {
	
	
	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping("/consumer/get/empl/msg")
	public Employee getEmpl() {
		// 远程访问地址
//		String host = "http://localhost:1000";
		String host = "http://provider-1000";
		
		// 远程访问url
		String url = "/get/empl/message";
		
		return restTemplate.getForObject(host + url, Employee.class);
	}

}
