package com.example.loanapp.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loanapp.model.Person;
import com.example.loanapp.repository.LoanRepository;

@Service
public class LoanService {

	@Autowired
	private LoanRepository loanRepo;

	public List<Person> getAll() {
		return loanRepo.findAll();
	}

	public Person createPerson(Person person) {
		Map<Long, Integer> mp = new HashMap<Long, Integer>();
		mp.put(49002010965l, 0);
		mp.put(49002010976l, 100);
		mp.put(49002010987l, 300);
		mp.put(49002010998l, 1000);
		double credit_score = 0.0;
		double maxsum = 0.0;
		for (Map.Entry<Long, Integer> hm : mp.entrySet()) {
			System.out.println(person.getPersonalCode() + "-->" + hm.getKey() + "--" + hm.getValue());
			if (person.getPersonalCode().equals(hm.getKey())) {
				credit_score = ((double) hm.getValue() / (double) person.getLoanAmount()) * person.getPeriodMonths();

				person.setCreditScore(credit_score);
				if (credit_score >= 1) {
					maxsum = person.getLoanAmount() + ((credit_score - 1.0) * person.getLoanAmount());
				} else {
					maxsum = person.getLoanAmount() - ((1.0 - credit_score) * person.getLoanAmount());
				}
				person.setMaxSum(maxsum);

			}
		}

		return loanRepo.save(person);
	}

	public Optional<Person> getPersonById(Integer id) {
		return loanRepo.findById(id);
	}

}
