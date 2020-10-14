package com.sunita.assignments.basics.control.statements;

public class ForLoopExample {

	public void forLoop(){
		
		int count=0;
		for (int i=8; i>=0; i--){
			
			if ( i %2 == 0){
			System.out.println( i + " is Even no. ");
			count++;
			}
		}
		System.out.println("Total even numbers are " + count);
	
	}
	
	public void continueDemo(){
		
		for (int i=0; i<5 ; i++){
			if ( i == 3){
				System.out.println("Skipped no." + i + "using continue statement");
						continue;
		}
			System.out.println(i);
	}
		
	}
	
	//pyramid example
	public void nestedForLoop(){
		
		System.out.println("Pyramid display using nested for loop");
		for ( int i= 1; i<=5; i++){
			for (int j=1; j<=i; j++){
				System.out.print("# " );
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		//create object
		ForLoopExample objForLoopExample = new ForLoopExample();
	//	objForLoopExample.forLoop();

		objForLoopExample.continueDemo();
		
		objForLoopExample.nestedForLoop();
	}

}
