package com.sunita.assignments.basics.control.statements;


public class WhileAndDoWhileExample {
	
	public void whileDemo()
	{
		System.out.println("While loop demo ");
		int i=4;
		while (i != 9){
			System.out.println("New value of i is " + i); 
			i++;
		}
	}
	
	public void doWhileDemo(){
		
		System.out.println("Do while demo");
		int j=4;
		do {
			System.out.println("  value of j is " + j );   // line is printed even if condition is false
			j++;
			
		}while(j == 9);
			
	}
	
	public static void main(String[] args) {
		
		WhileAndDoWhileExample objWhileAndDoWhileExample = new WhileAndDoWhileExample();
		objWhileAndDoWhileExample.whileDemo();
		
		objWhileAndDoWhileExample.doWhileDemo();
	}

}
