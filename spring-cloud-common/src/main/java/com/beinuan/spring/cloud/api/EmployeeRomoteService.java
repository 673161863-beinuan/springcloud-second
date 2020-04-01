package com.beinuan.spring.cloud.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.beinuan.spring.cloud.bean.Employee;
import com.beinuan.spring.cloud.factory.MyFallBackFactory;
import com.beinuan.spring.cloud.utils.ResultEntity;
/**
 * Զ�̷�����ýӿ�
 * @author ��ů
 *
 * @date: 2020��4��1��
 */
// value = "provider-1000"�Ƿ����ṩ�ߵ�����
// fallbackFactory = MyFallBackFactory.class ���񽵼�����ع�����
@FeignClient(value = "provider-1000",fallbackFactory = MyFallBackFactory.class) 
public interface EmployeeRomoteService {
	
	// @RequestMapping��ֵҪ������ṩ�ߵĵ�ַ��ȫһ����
	// ���е�ע�������Ӧ�ô���
	@RequestMapping("/get/empl/message")
	public Employee getEmployeeMessage();
	
	@RequestMapping("/provider/hystrix/get/empl")
	public ResultEntity<Employee> getEmployee(@RequestParam("signal") String signal);
}
