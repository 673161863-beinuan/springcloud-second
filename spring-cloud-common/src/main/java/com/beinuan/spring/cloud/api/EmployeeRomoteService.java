package com.beinuan.spring.cloud.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.beinuan.spring.cloud.bean.Employee;
import com.beinuan.spring.cloud.factory.MyFallBackFactory;
import com.beinuan.spring.cloud.utils.ResultEntity;
/**
 * 远程服务调用接口
 * @author 北暖
 *
 * @date: 2020年4月1日
 */
// value = "provider-1000"是服务提供者的名称
// fallbackFactory = MyFallBackFactory.class 服务降级处理回滚工厂
@FeignClient(value = "provider-1000",fallbackFactory = MyFallBackFactory.class) 
public interface EmployeeRomoteService {
	
	// @RequestMapping的值要与服务提供者的地址完全一样。
	// 所有的注解参数都应该带上
	@RequestMapping("/get/empl/message")
	public Employee getEmployeeMessage();
	
	@RequestMapping("/provider/hystrix/get/empl")
	public ResultEntity<Employee> getEmployee(@RequestParam("signal") String signal);
}
