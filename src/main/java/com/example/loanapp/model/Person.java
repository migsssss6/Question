package com.example.loanapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loanapp")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Long personalCode;
	private Integer loanAmount;
	private Integer periodMonths;
	private double creditScore;
	private double maxSum;
	
	public double getMaxSum() {
		return maxSum;
	}
	public void setMaxSum(double maxSum) {
		this.maxSum = maxSum;
	}
	public double getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(double creditScore) {
		this.creditScore = creditScore;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getPersonalCode() {
		return personalCode;
	}
	public void setPersonalCode(Long personalCode) {
		this.personalCode = personalCode;
	}
	public Integer getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Integer loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Long personalCode, Integer loanAmount, Integer periodMonths, double creditScore,
			double maxSum) {
		super();
		
		this.personalCode = personalCode;
		this.loanAmount = loanAmount;
		this.periodMonths = periodMonths;
		this.creditScore = creditScore;
		this.maxSum = maxSum;
	}
	public Integer getPeriodMonths() {
		return periodMonths;
	}
	public void setPeriodMonths(Integer periodMonths) {
		this.periodMonths = periodMonths;
	}
	
	
	
	

}
