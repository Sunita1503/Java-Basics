package com.sunita.assignments.basics.datatypes;

//demo java program for char data type
public class CharExample {

	public void charDemo(){
		char varChar = 'p';
		System.out.println("char value is " + varChar );
		varChar++;
		System.out.println("New char value is " + varChar);
	}
	
	
	public static void main(String[] args) {
		
		//create object of class charExample 
		CharExample objCharExample = new CharExample();
		
		//access the method charDemo
		objCharExample.charDemo();

	}

}
