package com.beinuan.spring.cloud.factory;

import org.springframework.stereotype.Component;

import com.beinuan.spring.cloud.api.EmployeeRomoteService;
import com.beinuan.spring.cloud.bean.Employee;
import com.beinuan.spring.cloud.utils.ResultEntity;

import feign.hystrix.FallbackFactory;

@Component
public class MyFallBackFactory implements FallbackFactory<EmployeeRomoteService> {

	@Override
	public EmployeeRomoteService create(Throwable cause) {
		return new EmployeeRomoteService() {
			
			@Override
			public Employee getEmployeeMessage() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResultEntity<Employee> getEmployee(String signal) {
				return ResultEntity.failed("降级机制生效" + cause.getMessage());
			}
		};
	}
}