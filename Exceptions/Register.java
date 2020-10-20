package com.validation;

import java.util.Scanner;

import com.Exceptions.NameExistsException;
import com.Exceptions.TooLongException;
import com.Exceptions.TooShortException;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validator validator = new Validator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name");
		String uname = sc.next();
		try {
			boolean valid = validator.validateName(username);
			if(valid) {
				System.out.println("Welcome "+username);
				System.out.println("Enter Password");
				String pass = sc.next();
				if(validator.validatePassword(password));
				System.out.println("You are registered successfully");
			}
		} catch (NameExistsException e) {
			System.out.println("Name already Exists");
		} catch (TooLongException e) {
			System.out.println(e.getMessage());
		} catch (TooShortException e) {
		
		System.out.println(e.getMessage());
		}
		sc.close();

	}

}
