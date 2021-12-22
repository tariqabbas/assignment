package com.assignment.crudapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.crudapp.entity.DepartmentEntity;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {

	List<DepartmentEntity> findByDepartmentNameEqualsIgnoreCase(String name);

}
