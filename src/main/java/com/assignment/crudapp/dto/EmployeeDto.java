package com.assignment.crudapp.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class EmployeeDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6440560156455196216L;
	private int employeeId;
	@Size(min = 2, message = "first name must be more than two characters")
	@NotNull(message = "first name cannot be null")
	private String firstName;
	@Size(min = 2, message = "last name must be more than two characters")
	@NotNull(message = "last name cannot be null")
	private String lastName;

	private String email;
	@Pattern(regexp = "^[0-9-]*$", message = "phone number can contain hypen")
	@Size(min = 1, max = 20)
	private String phoneNumber;

	private Date hireDate;
	@Min(value = 1, message = "salary must be greater than 0")
	private BigDecimal salary;

	private Integer managerId;
	private int departmentId;
	private DepartmentDto departmentEntity;

}
