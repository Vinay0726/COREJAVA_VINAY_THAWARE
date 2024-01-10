package com.mkpits.demo;

import java.util.Iterator;

public class AutomorphicOrNot {

	public static void main(String[] args) {
		
		int num=766;
		
		System.out.println("Number is:"+num);
		int square=num*num;
        System.out.println("Square is :"+square);
        
        square=square%100 ;
        System.out.println(square);
        
        if(num==square) {
        	System.out.println("IT is a Automorphic ");
        	
        }
        else {
        	System.out.println("It is not Automorphic");
        }
           
        
        
	}

}
