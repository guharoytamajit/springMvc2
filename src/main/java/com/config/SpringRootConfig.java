package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.svc.EmployeeSvc1;

@Configuration
public class SpringRootConfig {
	@Bean
	public EmployeeSvc1 employeeSvc1() {
		return new EmployeeSvc1();
	}
}
