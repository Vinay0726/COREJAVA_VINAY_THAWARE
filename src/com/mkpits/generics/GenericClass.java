package com.mkpits.generics;

public class GenericClass {
//Not Bounded--No bounded in Any datatype --we can get multiple datatype in with one class
//T -Formal Type Arguement.	//Type safety //
	public static void main(String[] args) {
		
		Integer []num= {1,2,3,4,5,6,7};
		//ClassName<WrapperClass>obj=new ClassName<>();
		PrintArray<Integer> printArray=new PrintArray<Integer>();
		printArray.print(num);
		
		
		String []name= {"vinay","raj","ashik","sanket","chetan","panav"};
		PrintArray<String> printString=new PrintArray<String>();
		printString.print(name);
		
		Double []doubleNum= {10.2,26.82,62.3,52.72};
		PrintArray<Double> printDouble=new PrintArray<Double>();
		printDouble.print(doubleNum);

	}

}
