package com.assignment.crudapp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.assignment.crudapp.entity.EmployeeEntity;
import com.assignment.crudapp.repository.EmployeeRepository;

@Service
public class EmployeeService implements Assignment<EmployeeEntity, Integer> {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeEntity createOrUpdate(EmployeeEntity object) {

		return employeeRepository.save(object);
	}

	@Override
	public Optional<List<EmployeeEntity>> findByName(String name) {

		List<EmployeeEntity> emplist = employeeRepository.findByFirstNameEqualsIgnoreCase(name).stream().map(m -> {
			EmployeeEntity dto = new EmployeeEntity();
			dto.setEmployeeId(m.getEmployeeId());
			dto.setFirstName(m.getFirstName());
			dto.setLastName(m.getLastName());
			dto.setHireDate(m.getHireDate());
			dto.setSalary(m.getSalary());
			dto.setEmail(m.getEmail());
			dto.setManagerId(m.getManagerId());
			dto.setPhoneNumber(m.getPhoneNumber());

			return dto;
		}).collect(Collectors.toList());

		return Optional.ofNullable(emplist);
	}

	@Override
	public Optional<EmployeeEntity> findById(Integer id) {

		return employeeRepository.findById(id);
	}

	@Override
	public List<EmployeeEntity> findAll(Pageable pageable) {

		return employeeRepository.findAll(pageable).getContent();
	}

	@Override
	public void delete(EmployeeEntity object) {
		employeeRepository.delete(object);

	}

	@Override
	public void deleteById(Integer id) {
		employeeRepository.deleteById(id);

	}
}
