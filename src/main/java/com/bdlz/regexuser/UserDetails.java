package com.bdlz.regexuser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
	public String regex;
	
	public void firstName(String FirstName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern =Pattern.compile(regex);
		Matcher matcher =pattern.matcher(FirstName);
		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("InValid");
		}
					
	}
	
	public void lastName(String lastName) {
		regex ="^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern =Pattern.compile(regex);
		Matcher matcher =pattern.matcher(lastName);
		if(matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("InValid");
		}
	}
}
