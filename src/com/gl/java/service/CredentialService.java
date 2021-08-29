package com.gl.java.service;


import java.util.Random;

import com.gl.java.employee.Employee;

public class CredentialService {

	
	public String generateEmailAdd(String firstname, String lastname, String department) {
		return firstname+lastname+"@"+department+"."+"GL.com";
		
	}
	
	public char[] generatePassword(int lenght) {
		
		String letters="ABCDEFGHIJKLMOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialchar="!@#$%^&*";
		
		String password = letters+numbers+specialchar;
		
//		instantiating random class
		Random random =new Random();
//		Creating new character array
		char[] randomPass= new char[lenght];
		
		
//charAt() returns a random char at a random index but using random.nextint does so continuously until equal to length 
		 
		for(int i=0;i<lenght;i++) {
			
			randomPass[i]= password.charAt(random.nextInt(password.length()));
		}
		return randomPass;
	}
	
	
	public void showCredential(Employee emp) {
		System.out.println("Dear "+ emp.getFirstname()+" These are your credentials");	
		
	}
	
	
	
	
}
