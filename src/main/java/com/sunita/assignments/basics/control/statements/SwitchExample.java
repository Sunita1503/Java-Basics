package com.sunita.assignments.basics.control.statements;

//demo java program for Switch case and break statements
public class SwitchExample {
	
	public void switchcaseWithBreak(char param1){
		
		
		switch (param1){
			
			case 'A' : System.out.println(" First grade");
						break;
			case 'B' : System.out.println(" Second grade");
						break;
			case 'C' : System.out.println(" Third grade");
						break;
			case 'D' : System.out.println(" Fail");
						break;
			default  : System.out.println("Inavlid Input ");
		
		
		}
		
	}
	
	public void switchcaseWithoutBreak(int param1){
		
		
		switch (param1){
		case 1 :  System.out.println( "Monday");
		case 2 :  System.out.println("Tuesday");
		case 3 :  System.out.println( "Wednesday");
		case 4 :  System.out.println( "Thursday");
		case 5 :  System.out.println( "Friday");
		case 6 :  System.out.println("Saturday");
		case 7 :  System.out.println("Sunday");
		}
		
	}
	
	public static void main(String[] args) {
	
		SwitchExample objSwitchExample = new SwitchExample();
		objSwitchExample.switchcaseWithBreak('B');
		
		objSwitchExample.switchcaseWithoutBreak(3);
		
	}

}
