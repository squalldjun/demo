package com.joya.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joya.demo.service.FileService;

@RestController
public class FileController {

	@Autowired
	FileService fileService;
	
	@GetMapping("/read-file")
	public String readFile() throws IOException {
		return fileService.getFileContent2();
	}
}
