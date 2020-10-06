package com.cg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {

	Scanner in = new Scanner(System.in);

	public void firstNameValidator() {
		System.out.println("enter your first name");
		System.out.println("first name should start with uppercase and have min 3 characters");
		String firstName = in.next();
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		Boolean b = matcher.find();
		if (b)
			System.out.println("First Name is Validated");
		else
			System.out.println("Please enter the name as mentioned");

	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration system");

		UserRegistrationMain newUser = new UserRegistrationMain();

		// first name validator
		newUser.firstNameValidator();
	}
}
