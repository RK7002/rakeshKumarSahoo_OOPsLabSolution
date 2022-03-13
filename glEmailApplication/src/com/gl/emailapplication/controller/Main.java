package com.gl.emailapplication.controller;

import java.util.Scanner;
import com.gl.emailapplication.model.Employee;
import com.gl.emailapplication.service.CredentialService;

public class Main {	
	public static void main(String[] args) {
		 String firstName="";
		 String lastName="";
		 Scanner scanner=new Scanner(System.in);
		 
		 System.out.println("Welcome To IT Credentials Administrator.");
		 //Input Employee Name
		 System.out.println("\nPlease Enter Employee's First Name: \n");
		 firstName=scanner.nextLine();
		 System.out.println("Please Enter Employee's Last Name: \n");
		 lastName=scanner.nextLine();
		
		 // Creating A Employee
		 Employee employee=new Employee(firstName, lastName);		
		 
		 //Input Department Details
		 System.out.println("\nPlease Enter The Department from the following,");
		 System.out.println("1. Technical \n2. Admin \n3. Human Resource \n4. Legal");
		 int track=scanner.nextInt();
		 if(track<=0||track>=5) {
				System.out.println("\nInValid Choice !!!!!! \n");
		 }else {
			 //Create & Print The Credentials Details
			 new CredentialService().showCredentials(employee,track);
		 }
		 scanner.close();
	}	
}
