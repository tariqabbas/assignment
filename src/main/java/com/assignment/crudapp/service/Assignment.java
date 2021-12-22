package com.assignment.crudapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;

public interface Assignment<T, ID> {
	T createOrUpdate(T object);

	Optional<List<T>> findByName(String name);

	Optional<T> findById(ID id);

	List<T> findAll(Pageable pageable);

	void delete(T object);

	void deleteById(ID id);

}
