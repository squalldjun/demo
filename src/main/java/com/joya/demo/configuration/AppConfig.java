package com.joya.demo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.joya.demo.bean.EnvironmentVariables;
import com.joya.demo.common.VariableNames;

@Configuration //config for bean
@EnableWebMvc //enbale cors origin
public class AppConfig implements WebMvcConfigurer {
	
	@Value("${"+VariableNames.DB_NAME+"}")
	private String dbName;
	
	@Value("${"+VariableNames.DB_URL+"}")
	private String dbUrl;
	
	@Value("${"+VariableNames.DB_USERNAME+"}")
	private String dbUsername;
	
	@Value("${"+VariableNames.CLASS_PATH+"}")
	private String classPath;
	
	@Value("${"+VariableNames.FILE_PATH+"}")
	private String filePath;
	
	@Bean
	public EnvironmentVariables setEnvironmentVariables() {
		EnvironmentVariables envar = new EnvironmentVariables();
		envar.setDbName(dbName);
		envar.setDbUsername(dbUsername);
		envar.setDbUrl(dbUrl);
		envar.setClassPath(classPath);
		envar.setFilePath(filePath);
		return envar;
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Override 
	public void addCorsMappings(CorsRegistry registry) { 
		registry.addMapping("/**");
	}
}
