package com.bdlz.regexuser;

import java.util.Scanner;

public class RegexUserRegistration {
	
	Scanner scanner = new Scanner(System.in);
	UserDetails userDetails = new UserDetails();
	
	public void userFirstName() {
		System.out.println("Enter your First Name : ");
		String firstName = scanner.next();
		userDetails.firstName(firstName);
	}
	
	public void userLasttName() {
		System.out.println("Enter your Last Name : ");
		String lastName = scanner.next();
		userDetails.lastName(lastName);
	}
	
	public void userEmailId() {
		System.out.println("Enter Your Emai Id : ");
		String emailId = scanner.next();
		userDetails.emailId(emailId);
	}
	
    public void userMobileNumber() {
        System.out.println("Enter your MobileNumber");
        String mobileNumber = scanner.next();
        userDetails.mobileNumber(mobileNumber);
    }
}
