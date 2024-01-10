package com.mkpits.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//for position
		int num[]= {1,2,3,4,5,6};
		System.out.println("Enter number:");
		int num1=Integer.parseInt(br.readLine());
		for(int i = 0;i<num.length;i++) {
			
				if(num[i]==num1) {
					   System.out.println("Current is :-"+(i+1)+" Position");
				}
				
			}
		}
		   
}
