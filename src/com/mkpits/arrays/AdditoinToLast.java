package com.mkpits.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditoinToLast {

	public static void main(String[] args) throws NumberFormatException, IOException {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter a Number :");
	 long num=Long.parseLong(br.readLine());
	 long sum=0,lastDigit=0;
	 while(num>0||sum>10) {
		 if(num==0) {
			 num=sum;
			 sum=0;
		 }
		 lastDigit=num%10;
		 sum+=lastDigit;
		 num/=10;
	 }
	 System.out.println(sum);

	}

}
