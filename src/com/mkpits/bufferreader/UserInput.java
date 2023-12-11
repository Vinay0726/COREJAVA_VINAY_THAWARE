package com.mkpits.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name:");
		String name=br.readLine();
		System.out.println("Name:"+name);
		System.out.println("Enter age:");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Age:"+age);
		
	}

}
