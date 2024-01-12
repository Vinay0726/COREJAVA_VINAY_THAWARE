package com.mkpits.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterClass {
// Printer Writer-	Print formatted representation of objects to a text-output stream 
//It does not conatin methods for writing raw bytes,for which a program should use non coded byte streams.
//it mostly use web pages output jsp pages
	public static void main(String[] args) throws IOException  {
		//PrintWriter(output stream,boolean auto flush)
		PrintWriter pw=new PrintWriter(System.out, true);
		pw.println("Hello");
		pw.close();
		//pw.flush();
		PrintWriter pw1=new PrintWriter(new FileWriter("E:\\xyz.txt",true),true);
		pw1.println("helllo");
		pw1.close();
		////pw.flush();
		
	}

}
