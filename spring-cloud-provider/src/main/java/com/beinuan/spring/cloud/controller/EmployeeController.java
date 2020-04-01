package com.beinuan.spring.cloud.controller;

import javax.servlet.http.HttpServletRequest;

import org.bouncycastle.crypto.RuntimeCryptoException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.beinuan.spring.cloud.bean.Employee;
import com.beinuan.spring.cloud.utils.ResultEntity;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class EmployeeController {

	// @HystrixCommand�Ǳ��÷���������
	@HystrixCommand(fallbackMethod = "getEmployeeBackup")
	@RequestMapping("/provider/hystrix/get/empl")
	public ResultEntity<Employee> getEmployee(@RequestParam("signal") String signal) throws InterruptedException {

		if ("timeout".equals(signal)) {
			Thread.sleep(5000);
		}
		
		if("bang".equals(signal)) {
			throw new RuntimeCryptoException();
		}
		return ResultEntity.successWithData(new Employee(333, "jerry", 3333.44));
	}

	public ResultEntity<Employee> getEmployeeBackup(@RequestParam("signal") String signal) {

		return ResultEntity.failed("����ʧ�ܣ�����");
	}

	@RequestMapping("/get/empl/message")
	public Employee getEmployeeMessage(HttpServletRequest request) {

		// ��ȡ��ǰ����˿ں�
		int port = request.getServerPort();
		return new Employee(1, "tom  -->" + port, 4567.7);
	}

}
