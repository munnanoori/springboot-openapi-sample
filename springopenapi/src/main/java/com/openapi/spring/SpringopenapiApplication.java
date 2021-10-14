package com.openapi.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.openapi.spring.entities.Person;
import com.openapi.spring.repositories.PersonRepository;

@SpringBootApplication
public class SpringopenapiApplication {

	@Autowired
	PersonRepository personRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringopenapiApplication.class, args);
	}
}
