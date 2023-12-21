package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.filechooser.FileNameExtensionFilter;

public class callSingleInheritance {

	public static void main(String[] args) throws IOException {
		
		DemoClass1 call=new DemoClass1();
		
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while()
		{
		System.out.println("Enter First Name");
		call.fName=br.readLine();
		if(call.fName.isEmpty()) {
			System.out.println("First Name is invalid ??");
		}
		System.out.println("Enter Last Name");
		call.lName=br.readLine();
		if(call.lName.isEmpty()) {
			System.out.println("last Name is invalid ??");
		}
		System.out.println("Enter Email");
		call.email=br.readLine();
		if(call.email.isEmpty()) {
			System.out.println("Email is invalid ??");
		}
		//Regular Expression  
		String regex="^(.+)@(.+)$";
		//Compile regular expression to get the pattern 
		Pattern pattern=Pattern.compile(regex);
		//Create instance of matcher 
		Matcher matcher=pattern.matcher(call.email);	
		if(!matcher.matches()) {
					System.out.println("Email invalid");
				}
		System.out.println("Enter Mobile");
		call.mobile=Long.parseLong(br.readLine());
		if(call.mobile<=10) {
			System.out.println("Mobile no is invalid");
		}
		if(call.fName.isEmpty()) {
			System.out.println("mobile number is invalid ??");
		}
		
	
		
		
		
		
		   
		System.out.println("Enter Gender");
		call.gender=(char)br.read();
		br.readLine();
		System.out.println("Enter Pincode");
		call.pinCode=Integer.parseInt(br.readLine());
		System.out.println("-----------------------------");
		System.out.println("      Student Information :) ");
		call.getDetails();
		System.out.println("-----------------------------");
		
		

	}

}
