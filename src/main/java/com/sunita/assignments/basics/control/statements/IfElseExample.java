package com.sunita.assignments.basics.control.statements;

//Demo java program for if else statement
public class IfElseExample {

	public void display(int param1){
		
		if (param1 < 0)
			System.out.println("It's negative number");
		else if (param1 >0)
			System.out.println("it's positive number");
		else if (param1 == 0)
			System.out.println("It's " + param1);
		
	}
	
	public static void main(String[] args) {
	
	  IfElseExample objIfElseExample = new IfElseExample();
	  objIfElseExample.display(0);
	  objIfElseExample.display(4);
	  objIfElseExample.display(-5);
		
	}

}
