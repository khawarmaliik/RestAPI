package com.springboot.databaseproperties.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.databaseproperties.request.AddBookRequest;

public interface BookRepository extends CrudRepository<AddBookRequest, Integer> {}
