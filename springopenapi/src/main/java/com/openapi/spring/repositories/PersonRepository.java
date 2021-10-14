package com.openapi.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openapi.spring.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

	
}
