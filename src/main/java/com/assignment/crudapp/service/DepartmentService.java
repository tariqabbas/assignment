package com.assignment.crudapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.assignment.crudapp.entity.DepartmentEntity;
import com.assignment.crudapp.repository.DepartmentRepository;

@Service
public class DepartmentService implements Assignment<DepartmentEntity, Integer> {
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Optional<List<DepartmentEntity>> findByName(String name) {

		return Optional.ofNullable(departmentRepository.findByDepartmentNameEqualsIgnoreCase(name));
	}

	@Override
	public List<DepartmentEntity> findAll(Pageable pageable) {

		return departmentRepository.findAll(pageable).getContent();
	}

	@Override
	public Optional<DepartmentEntity> findById(Integer id) {

		return departmentRepository.findById(id);
	}

	@Override
	public DepartmentEntity createOrUpdate(DepartmentEntity object) {

		return departmentRepository.save(object);
	}

	@Override
	public void delete(DepartmentEntity object) {
		departmentRepository.delete(object);

	}

	@Override
	public void deleteById(Integer id) {
		departmentRepository.deleteById(id);

	}

}
