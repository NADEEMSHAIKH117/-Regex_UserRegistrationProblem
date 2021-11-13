package com.bdlz.regexuser;

import java.util.Scanner;

public class RegexUserMain {
	
	RegexUserRegistration regexUserRegistration = new RegexUserRegistration();
	Scanner scanner = new Scanner(System.in);
	
	public void choice() {
		while (true) {
			System.out.println("*Enter 1 To Check First Name");
			System.out.println("*Enter 2 To Check Last Name");
			System.out.println("*Enter 3 To Check Email Id");
			System.out.println("*Enter 4 To Check Mobile Number");
			System.out.println("*Enter 5 To Check Password");
			System.out.println("*Enter 0 To Exit");
			
			int choice = scanner.nextInt();
			switch (choice) {
				case 1 :
					regexUserRegistration.userFirstName();
					break;
				case 2 :
					regexUserRegistration.userLasttName();
					break;
				case 3 :
					regexUserRegistration.userEmailId();
					break;
				case 4 :
					regexUserRegistration.userMobileNumber();
					break;
				case 5 :
					regexUserRegistration.userPassword();
					break;
				case 0 :
					System.exit(0);
					break;
				default :
					System.out.println("*Enter the Wrong input \n*Please enter the correct input");
					continue;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("\n Welcome to User Registration Program by regex \n");
		RegexUserMain regexUserMain = new RegexUserMain();
		regexUserMain.choice();
		regexUserMain.scanner.close();

	}

}
