package com.assignment.crudapp.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.crudapp.dto.EmployeeDto;
import com.assignment.crudapp.dto.PaginatedDto;
import com.assignment.crudapp.entity.EmployeeEntity;
import com.assignment.crudapp.service.EmployeeService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Employee API")
public class EmployeeController {

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/assignment/createemployee")
	public ResponseEntity<?> createEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
		ResponseEntity<?> responseEntity;
		try {
			EmployeeEntity employeeEntity = employeeService
					.createOrUpdate(mapper.map(employeeDto, EmployeeEntity.class));
			EmployeeDto dto = new EmployeeDto();
			dto.setEmployeeId(employeeEntity.getEmployeeId());
			dto.setFirstName(employeeEntity.getFirstName());
			dto.setLastName(employeeEntity.getLastName());
			dto.setHireDate(employeeEntity.getHireDate());
			responseEntity = new ResponseEntity<>(dto, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
			return responseEntity;
		}
		return responseEntity;
	}

	@GetMapping("/assignment/findemployeebyname")
	public ResponseEntity<?> findEmployeeByName(@RequestParam String employeeName) {
		ResponseEntity<?> responseEntity = null;
		List<EmployeeEntity> employeeEntity = null;
		try {
			Optional<List<EmployeeEntity>> depart = employeeService.findByName(employeeName);
			if (depart.isPresent()) {
				employeeEntity = depart.get();
				responseEntity = new ResponseEntity<>(employeeEntity, HttpStatus.OK);
			} else {
				responseEntity = new ResponseEntity<>("No Employee with first Name " + employeeName + " Exists",
						HttpStatus.OK);
			}

		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
			return responseEntity;
		}
		return responseEntity;
	}

	@PostMapping("/assignment/listemployees")
	public ResponseEntity<?> listEmployees(@RequestBody PaginatedDto paginatedDto) {
		ResponseEntity<?> responseEntity = null;
		List<EmployeeDto> employeeList = null;
		Pageable pageable = null;
		try {

			pageable = PageRequest.of(paginatedDto.getPage(), paginatedDto.getSize());

			Optional<List<EmployeeEntity>> depart = Optional.ofNullable(employeeService.findAll(pageable));
			if (depart.isPresent()) {
				employeeList = depart.get().stream().map(m -> {
					EmployeeDto employeeDto = new EmployeeDto();
					employeeDto.setEmployeeId(m.getEmployeeId());
					employeeDto.setFirstName(m.getFirstName());
					employeeDto.setLastName(m.getLastName());
					employeeDto.setHireDate(m.getHireDate());
					employeeDto.setSalary(m.getSalary());
					employeeDto.setEmail(m.getEmail());
					employeeDto.setManagerId(m.getManagerId());
					employeeDto.setPhoneNumber(m.getPhoneNumber());
					employeeDto.setDepartmentId(m.getDepartmentEntity().getDepartmentId());
//					employeeDto.setDepartmentEntity(mapper.map(m.getDepartmentEntity(), DepartmentDto.class));
					return employeeDto;
				}).collect(Collectors.toList());
				responseEntity = new ResponseEntity<>(employeeList, HttpStatus.OK);
			} else {
				responseEntity = new ResponseEntity<>("No Employee found", HttpStatus.OK);
			}

		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
			return responseEntity;
		}
		return responseEntity;

	}

	@GetMapping("/assignment/findemployeebyid/{id}")
	public ResponseEntity<?> findEmployeeById(@RequestParam Integer id) {
		ResponseEntity<?> responseEntity = null;
		EmployeeEntity employeeEntity = null;
		try {
			Optional<EmployeeEntity> depart = employeeService.findById(id);
			if (depart.isPresent()) {
				employeeEntity = depart.get();
				responseEntity = new ResponseEntity<>(employeeEntity, HttpStatus.OK);
			} else {
				responseEntity = new ResponseEntity<>("No Employee for Id " + id, HttpStatus.OK);
			}

		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
			return responseEntity;
		}
		return responseEntity;
	}

	@PostMapping("/assignment/deleteemployee")
	public ResponseEntity<?> deleteEmployee(@RequestParam Integer employeeID) {
		ResponseEntity<?> responseEntity = null;

		try {
			employeeService.deleteById(employeeID);
			responseEntity = new ResponseEntity<>("Deleted Successfully ", HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
			return responseEntity;
		}
		return responseEntity;

	}
}
