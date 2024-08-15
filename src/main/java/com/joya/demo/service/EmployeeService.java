package com.joya.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.joya.demo.common.VariableNames;
import com.joya.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ServletService servletService;
	
	ObjectMapper objectMapper = new ObjectMapper();

	public Map<String, JSONObject> getEmployeeRoleById(String id) {
		if(id.isBlank()) return new HashMap<>();
		Map<String, JSONObject> employee = employeeRepo.findEmployeeRoleById(id);
		return employee;
	}

	public List<Map<String, JSONObject>> getAllEmployeeJoinRole() {
		// TODO Auto-generated method stub
		return employeeRepo.getAllEmployeeJoinRole();
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, JSONObject>> testServlet() throws Exception {
		// TODO Auto-generated method stub
		return objectMapper.readValue(servletService.doGet(VariableNames.URI_SAMPLE), ArrayList.class);
	}
}
