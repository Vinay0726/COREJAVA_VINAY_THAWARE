package com.mkpits.cfs;

public class NestedForLoop {

	public static void main(String[] args) {
		
		
		
		for(int i=0;i<=5;i++) {
			System.out.println("Inner Loop :"+i);
			for(int j=1;j<=5;j++) {
				System.out.println("Outer Loop :"+j);
				
			}
			
		}

		for(int i=0;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
