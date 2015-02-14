package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.svc.EmployeeSvc2;

@Configuration
public class SpringRootConfig2 {
	@Bean
	public EmployeeSvc2 employeeSvc2() {
		return new EmployeeSvc2();
	}
}
