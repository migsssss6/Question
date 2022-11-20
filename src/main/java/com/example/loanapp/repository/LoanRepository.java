package com.example.loanapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loanapp.model.Person;

@Repository
public interface LoanRepository extends JpaRepository<Person,Integer> {
	
	List<Person> findAll();
	
	

}
