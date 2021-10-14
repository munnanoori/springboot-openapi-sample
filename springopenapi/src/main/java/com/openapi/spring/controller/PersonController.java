package com.openapi.spring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.openapi.spring.entities.Person;
import com.openapi.spring.repositories.PersonRepository;

@RestController
public class PersonController {
	
	@Autowired
	PersonRepository personRepository;
	
	@PostMapping("/person/add")
	public ResponseEntity<Person> insertPerson(@RequestBody Person person) {
		
		personRepository.save(person);
		
		return new ResponseEntity<Person>(person, HttpStatus.OK);
		
	}
	
	@GetMapping("/person/retrieve/{id}")
	public ResponseEntity<Object> retrievePerson(@PathVariable Long id) {
		
		Optional<Person> person = personRepository.findById(id);
		
		if(person.isPresent()){
			return new ResponseEntity(person.get(),HttpStatus.OK);
		}
		
		return new ResponseEntity<Object>("Not found person",HttpStatus.BAD_REQUEST);
	}

}
