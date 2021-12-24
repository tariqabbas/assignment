package com.assignment.crudapp.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.lang.Nullable;

import lombok.Data;

@Data
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

}
