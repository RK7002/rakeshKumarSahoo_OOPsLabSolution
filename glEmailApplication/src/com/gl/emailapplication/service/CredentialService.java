package com.gl.emailapplication.service;

import com.gl.emailapplication.model.Employee;
import java.util.Random;

public class CredentialService{
	// 8 character/string Password Generator Method 
	private String generatePassword() {
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*!"; 
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i < 8; i++){
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();        
	}
	// Email Address Generator
	private String generateEmailAddress(Employee employee,String departmentName) {
		String firstName=employee.getFirstName().toLowerCase().replaceAll(" ","");
		String lastName=employee.getLastName().toLowerCase().replaceAll(" ","");
		return (firstName+lastName+"@"+departmentName+".greatlearning.com");
	}
	// Public Method For Printing Employee Credentials
	public void showCredentials(Employee employee,int departNo) {
		System.out.println("---------------------------------------------------------------------------------- ");
		System.out.println("\nDear "+employee.getFirstName()+" your generated credentials are as follows : ");
		System.out.println("Email --> "+generateEmailAddress(employee,getDepartmentName(departNo)));
		System.out.println("Password --> "+generatePassword());
		System.out.println("---------------------------------------------------------------------------------- ");
	}
	//additional method for department short-form generator
	private String getDepartmentName(int a) {
		switch (a) {
			case 1: {return "tech";}
			case 2: {return "admin";}
			case 3: {return "hr";}
			case 4: {return "legal";}
			default:{return "";}
		}
	}
}
