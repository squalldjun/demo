package com.joya.demo.common;

public class VariableQuery {

	public static final String QUERY_FIND_EMPLOYEE_JOIN_ROLE_BY_ID = 
			"select * from employee e join role r on e.id = r.employee_id where e.id = ";
	public static final String QUERY_FIND_ALL_EMPLOYEE_JOIN_ROLE = 
			"select * from employee e join role r on e.id = r.employee_id";
}
