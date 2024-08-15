package com.joya.demo.controller;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.joya.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employee-role/{id}")
	public Map<String, JSONObject> getEmployeeRoleById(@PathVariable String id) {
		return employeeService.getEmployeeRoleById(id);
	}

	@GetMapping("/all-employee")
	public List<Map<String, JSONObject>> getAllEmployeeJoinRole() {
		return employeeService.getAllEmployeeJoinRole();
	}
	
	@GetMapping("/test-servlet")
	public List<Map<String, JSONObject>> testServlet() throws Exception {
		return employeeService.testServlet();
	}
}
