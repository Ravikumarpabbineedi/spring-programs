package com.ravi.springprograms;

import org.springframework.stereotype.Component;

@Component
public class HomeLoanService {

	public void loanInfo() {
		System.out.println("Here the details about loans on Home");
		System.out.println("Loan for 2BHK flats is upto 5 lakhs we can provide");
		System.out.println("Rate of Interest is 85 paise");
	}
}
