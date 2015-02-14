package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.svc.EmployeeSvc1;
import com.svc.EmployeeSvc2;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	EmployeeSvc1 empSvc1;
	@Autowired
	EmployeeSvc2 empSvc2;

	@RequestMapping(value = "/info.htm", method = RequestMethod.GET)
	public String name() {
		return "employee";
	}
}
