package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnakeGunWater {
	static String sysInput;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("------------------");
		System.out.println("Welcome Snake Water Game");
		int random=(int)Math.floor(Math.random()*100);
		
		if(random>1 && random<33) {
			sysInput="s";
		}
		if(random>33 && random<66) {
			sysInput="w";
		}
		if(random>66 && random<100) {
			sysInput="g";
		}
		char ch='Y';
		//using while loop fetch old data
		while(ch=='Y'|| ch=='y') {
		System.out.println("Enter your choice:\n1)s \n2)w \n3)g");
		String userInput=br.readLine();
	 
	    if((sysInput.equalsIgnoreCase("S")&& userInput.equalsIgnoreCase("G") || sysInput.equalsIgnoreCase("W")&&userInput.equalsIgnoreCase("S"))) {
	    System.out.println("Snake win ");
	    }
		
	    if((sysInput.equalsIgnoreCase("W")&& userInput.equalsIgnoreCase("S") || sysInput.equalsIgnoreCase("G")&& userInput.equalsIgnoreCase("W"))) {
	    System.out.println("Water win ");
	    }
		
	    if((sysInput.equalsIgnoreCase("S")&& userInput.equalsIgnoreCase("G") || sysInput.equalsIgnoreCase("G")&& userInput.equalsIgnoreCase("S"))) {
	    System.out.println("Gun win ");
	    }
	    System.out.println("Do you wish to continue y/n");
	    ch=(char)br.read();
	    br.readLine();
	}
 }		
}
