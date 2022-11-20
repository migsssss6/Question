package com.example.loanapp;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.loanapp.model.Person;
import com.example.loanapp.repository.LoanRepository;
import com.example.loanapp.service.LoanService;

@SpringBootTest
class LoanappApplicationTests {

	@Autowired
	private LoanRepository loanRepo;

	@Autowired
	private LoanService loanService;

	@Test
	void isPersonExistsById() {
		Person p = new Person(49002010998l, 8000, 10, 1.25, 10000.00);
		loanRepo.save(p);
		List<Person> res = loanService.getAll();
		boolean result = false;
		if (res.size() > 0)
			result = true;
		assertThat(result).isTrue();

	}

}
