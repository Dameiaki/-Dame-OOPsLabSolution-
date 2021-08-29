package com.gl.java.driver;
import java.util.Scanner;

import com.gl.java.employee.Employee;
import com.gl.java.service.*;

public class Driver {
	
	public static void main(String[] args) {
		Employee emp=new Employee("Amit", "Kumar");
		CredentialService service=new  CredentialService();
		
		System.out.println("Please enter Department from the following ");
		System.out.println("1.Tech ");
		System.out.println("2.Admin ");
		System.out.println("3.Hr ");
		System.out.println("4.Legal ");
		
		
		
		
		Scanner sc= new Scanner(System.in);
		
		int option = sc.nextInt();
		sc.close();
		
		
		
		switch (option) {		
		case 1: service.showCredential(emp);
				System.out.println("Email--> "+service.generateEmailAdd(emp.getFirstname(), emp.getLastname(), "Tech"));
				System.out.print("Password-->");
				System.out.print(service.generatePassword(8));
				break;
				
		case 2: service.showCredential(emp);
				System.out.println("Email--> "+service.generateEmailAdd(emp.getFirstname(), emp.getLastname(), "Admin"));
				System.out.print("Password-->");
				System.out.print(service.generatePassword(8));
				break;
		
		case 3: service.showCredential(emp);
				System.out.println("Email--> "+service.generateEmailAdd(emp.getFirstname(), emp.getLastname(), "Hr"));
				System.out.print("Password-->");
				System.out.print(service.generatePassword(8));
				break;
		
		case 4: service.showCredential(emp);
				System.out.println("Email--> "+service.generateEmailAdd(emp.getFirstname(), emp.getLastname(), "Legal"));
				System.out.print("Password--> ");
				System.out.print(service.generatePassword(8));
				break;
			

		default:
			System.out.println("Invaild Input ");
			break;
		}
		
		
		
	}

}
