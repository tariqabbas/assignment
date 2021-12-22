package com.assignment.crudapp.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

import com.assignment.crudapp.dto.DepartmentDto;
import com.assignment.crudapp.dto.PaginatedDto;
import com.assignment.crudapp.entity.DepartmentEntity;
import com.assignment.crudapp.service.DepartmentService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Department API")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private ModelMapper mapper;

	@GetMapping("/assignment/test")
	public String sayHello() {
		return "OpenAPI Hello World";
	}

	@PostMapping("/assignment/createdepartment")
	public ResponseEntity<?> createDepartment(@RequestBody DepartmentDto departmentDto) {
		ResponseEntity<?> responseEntity;
		try {
			DepartmentEntity departmentEntity = new DepartmentEntity();
			departmentEntity.setDepartmentName(departmentDto.getDepartmentName());
			departmentEntity.setManagerId(departmentDto.getManagerId());

			responseEntity = new ResponseEntity<>(
					mapper.map(departmentService.createOrUpdate(departmentEntity), DepartmentDto.class), HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
			return responseEntity;
		}
		return responseEntity;
	}

	@GetMapping("/assignment/finddepartmentbyname")
	public ResponseEntity<?> findDepartmentByName(@RequestParam String departmentName) {
		ResponseEntity<?> responseEntity = null;
		List<DepartmentEntity> departmentEntity = null;
		try {
			Optional<List<DepartmentEntity>> depart = departmentService.findByName(departmentName);
			if (depart.isPresent()) {
				departmentEntity = depart.get();
				responseEntity = new ResponseEntity<>(departmentEntity, HttpStatus.OK);
			} else {
				responseEntity = new ResponseEntity<>("No Department Exists", HttpStatus.OK);
			}

		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
			return responseEntity;
		}
		return responseEntity;
	}

	@PostMapping("/assignment/listdepartments")
	public ResponseEntity<?> listAllDepartments(@RequestBody PaginatedDto paginatedDto) {
		ResponseEntity<?> responseEntity = null;
		List<DepartmentDto> departmentList = null;
		Pageable pageable = null;
		try {

			pageable = PageRequest.of(paginatedDto.getPage(), paginatedDto.getSize());

			Optional<List<DepartmentEntity>> depart = Optional.ofNullable(departmentService.findAll(pageable));
			if (depart.isPresent()) {
				departmentList = depart.get().stream().map(m -> {
					return mapper.map(m, DepartmentDto.class);
				}).collect(Collectors.toList());
				responseEntity = new ResponseEntity<>(departmentList, HttpStatus.OK);
			} else {
				responseEntity = new ResponseEntity<>("No Departments Found", HttpStatus.OK);
			}

		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
			return responseEntity;
		}
		return responseEntity;

	}

	@GetMapping("/assignment/finddepartmentbyid")
	public ResponseEntity<?> findDepartmentById(@RequestParam Integer id) {
		ResponseEntity<?> responseEntity = null;
		DepartmentEntity departmentEntity = null;
		try {
			Optional<DepartmentEntity> depart = departmentService.findById(id);
			if (depart.isPresent()) {
				departmentEntity = depart.get();
				responseEntity = new ResponseEntity<>(departmentEntity, HttpStatus.OK);
			} else {
				responseEntity = new ResponseEntity<>("No department Exists with Id " + id, HttpStatus.OK);
			}

		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
			return responseEntity;
		}
		return responseEntity;
	}

	@PostMapping("/assignment/deletedepartment/{departmentID}")
	public ResponseEntity<?> deleteDepartments(@RequestParam Integer departmentID) {
		ResponseEntity<?> responseEntity = null;

		try {
			departmentService.deleteById(departmentID);
			responseEntity = new ResponseEntity<>("Deleted Successfully ", HttpStatus.OK);
		} catch (

		Exception e) {
			responseEntity = new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
			return responseEntity;
		}
		return responseEntity;

	}

}
