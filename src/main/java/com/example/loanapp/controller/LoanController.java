package com.example.loanapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loanapp.model.Person;
import com.example.loanapp.service.LoanService;

@RestController
public class LoanController {
	
	
	@Autowired
	private LoanService loanService;
	
	@GetMapping("/person")
	@CrossOrigin
	public List<Person> getAllPerson(){
		
		return loanService.getAll();
	}
	
	@PostMapping("/person")
	@CrossOrigin
	public Person createPerson(@RequestBody Person person) {
		return loanService.createPerson(person);
	}
	
	@GetMapping("/person/{id}")
	@CrossOrigin
	public Optional<Person> getPersonById(@PathVariable Integer id) {
		
		return loanService.getPersonById(id);
	}

}
