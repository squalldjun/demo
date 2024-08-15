package com.joya.demo.repository;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.joya.demo.bean.Employee;
import com.joya.demo.common.VariableNames;
import com.joya.demo.common.VariableQuery;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	
	@Query(value = VariableQuery.QUERY_FIND_EMPLOYEE_JOIN_ROLE_BY_ID + ":" + VariableNames.ID, nativeQuery = true)
	Map<String, JSONObject> findEmployeeRoleById(@Param(VariableNames.ID) String id);

	@Query(value = VariableQuery.QUERY_FIND_ALL_EMPLOYEE_JOIN_ROLE, nativeQuery = true)
	List<Map<String, JSONObject>> getAllEmployeeJoinRole();

}
