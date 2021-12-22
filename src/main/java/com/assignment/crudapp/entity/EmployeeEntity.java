package com.assignment.crudapp.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "employees")
public class EmployeeEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1520467287109824489L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "employee_id")
	private int employeeId;

	@Size(min = 2, message = "must be more than two characters")
	@NotEmpty(message = "first name cannot be null")
	@Basic
	@Column(name = "first_name")
	private String firstName;
	@Size(min = 2, message = "must be more than two characters")
	@NotEmpty(message = "last name cannot be null")
	@Basic
	@Column(name = "last_name")
	private String lastName;
	@Basic
	@Column(name = "email")
	private String email;

	@Pattern(regexp = "^[0-9-]*$", message = "phone number can only contain hypen")
	@Basic
	@Column(name = "phone_number", length = 20)
	private String phoneNumber;
	@Basic
	@Column(name = "hire_date")
	private Date hireDate;
	@Min(value = 1, message = "salary MUST be greater than 0")
	@Basic
	@Column(name = "salary")
	private BigDecimal salary;
	@Basic
	@Column(name = "manager_id")
	private Integer managerId;

	@OneToOne
	@JoinColumn(name = "department_id")
	@JsonIgnore
	private DepartmentEntity departmentEntity;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public DepartmentEntity getDepartmentEntity() {
		return departmentEntity;
	}

	public void setDepartmentEntity(DepartmentEntity departmentEntity) {
		this.departmentEntity = departmentEntity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(departmentEntity, email, employeeId, firstName, hireDate, lastName, managerId, phoneNumber,
				salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeEntity other = (EmployeeEntity) obj;
		return Objects.equals(departmentEntity, other.departmentEntity) && Objects.equals(email, other.email)
				&& employeeId == other.employeeId && Objects.equals(firstName, other.firstName)
				&& Objects.equals(hireDate, other.hireDate) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(managerId, other.managerId) && Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(salary, other.salary);
	}

}
