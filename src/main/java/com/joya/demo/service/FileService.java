package com.joya.demo.service;

import java.io.IOException;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.joya.demo.bean.EnvironmentVariables;

@Service
public class FileService {

	@Autowired
	EnvironmentVariables envar;
	
	@Autowired
	ResourceLoader resourceLoader;
	
	public String getFileContent() throws IOException {
		Resource resource = resourceLoader.getResource(envar.getClassPath());
		return new String(Files.readAllBytes(resource.getFile().toPath()));
	}
	
	public String getFileContent2() throws IOException {
		Resource resource = resourceLoader.getResource(envar.getFilePath());
		return new String(Files.readAllBytes(resource.getFile().toPath()));
	}
}
