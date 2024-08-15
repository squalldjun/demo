package com.joya.demo.service;

import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServletService {

	@Autowired
	RestTemplate restTemplate;
	
	public String doGet(String uri) throws Exception {
		String result = restTemplate.getForObject(uri, String.class);
		if(result.isEmpty()) throw new Exception(result);
		return result;
	}
	
	public void doPost(String uri, Map<String, JSONObject> body)throws Exception {
		String result = restTemplate.postForObject(uri, body, String.class);
		if(result.isBlank()) throw new Exception(result);
	}
}
