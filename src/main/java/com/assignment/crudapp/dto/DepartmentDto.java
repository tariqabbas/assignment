package com.assignment.crudapp.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.lang.Nullable;

public class DepartmentDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8038707876965729042L;
	private int departmentId;
	private String departmentName;
	private Integer managerId;
	@Nullable
	private List<EmployeeDto> employees;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public List<EmployeeDto> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeDto> employees) {
		this.employees = employees;
	}

}
