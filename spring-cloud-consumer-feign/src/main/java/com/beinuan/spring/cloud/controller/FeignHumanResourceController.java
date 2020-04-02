package com.beinuan.spring.cloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.beinuan.spring.cloud.api.EmployeeRomoteService;
import com.beinuan.spring.cloud.bean.Employee;
import com.beinuan.spring.cloud.utils.ResultEntity;

@RestController
public class FeignHumanResourceController {
	
	
	@Autowired
	private EmployeeRomoteService employeeRomoteService;
	
	@RequestMapping("/feign/consumer/employee/msg")
	public Employee getEmployeeRemote() {
		return employeeRomoteService.getEmployeeMessage();
	}
	
	
	@RequestMapping("/hystrix/consumer/employee/msg")
	public ResultEntity<Employee> getEmploye(@RequestParam("signal") String signal) {
		return employeeRomoteService.getEmployee(signal);
	}
}
