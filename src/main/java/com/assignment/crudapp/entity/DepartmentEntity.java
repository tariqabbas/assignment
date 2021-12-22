package com.assignment.crudapp.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class DepartmentEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "department_id")
	private int departmentId;
	@Basic
	@Column(name = "department_name")
	private String departmentName;
	@Basic
	@Column(name = "manager_id")
	private Integer managerId;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	private List<EmployeeEntity> employees;

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

	public List<EmployeeEntity> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeEntity> employees) {
		this.employees = employees;
	}

	@Override
	public int hashCode() {
		return Objects.hash(departmentId, departmentName, employees, managerId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartmentEntity other = (DepartmentEntity) obj;
		return departmentId == other.departmentId && Objects.equals(departmentName, other.departmentName)
				&& Objects.equals(employees, other.employees) && Objects.equals(managerId, other.managerId);
	}

}
