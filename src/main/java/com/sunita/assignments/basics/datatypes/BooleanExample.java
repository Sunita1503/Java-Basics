package com.sunita.assignments.basics.datatypes;

//Demo java program for boolean data type
public class BooleanExample {

	
	public void booleanDemo(){
		
		boolean flag = true;
		
		if (flag) 
			System.out.println("Positive scenario");
		else
			System.out.println("Negative scenario");
	}
	
	public static void main(String[] args) {

		//create object of BooleanExample
		BooleanExample objBooleanExample = new BooleanExample();
		objBooleanExample.booleanDemo();
	}

}
