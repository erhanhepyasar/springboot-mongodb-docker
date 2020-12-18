package com.demo.spring.mongo.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.mongo.api.model.Person;
import com.demo.spring.mongo.api.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	//Create operation
	public Person create(String firstName, String lastName, int age) {
		return personRepository.save(new Person(firstName, lastName, age));
	}
	
	//Retrieve operation
	public List<Person> getAll() {
		return personRepository.findAll();		
	}
	
	public Person getByFirstName(String firstName) {
		return personRepository.findByFirstName(firstName);
	}
	
	//Update operation
	public Person update(String firstName, String lastName, int age) {
		Person person = personRepository.findByFirstName(firstName);
		person.setLastName(lastName);
		person.setAge(age);
		return personRepository.save(person);
	}
	
	//Delete operation
	public void deleteAll() {
		personRepository.deleteAll();
	}
	
	public void delete(String firstName) {
		Person person = personRepository.findByFirstName(firstName);
		personRepository.delete(person);
	}

}
