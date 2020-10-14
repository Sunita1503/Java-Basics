package com.sunita.assignments.basics.datatypes;

// java program to demonstrate arrays 
public class ArraysExample {
	
	// declare, instantiate, initialize  one Dimensional array
	
	public void oneDArray(){
		
		int intArray[] = new int[5];
		intArray[0] = 45 ;
		intArray[1] = 67;
		intArray[2] = 22;
		intArray[3] = 67;
		intArray[4] = 33;
		
		//display array values
		System.out.println("Print Array values");
		for( int i=0; i<=4 ; i++){
			System.out.println(intArray[i]);
		}
	}
	
	public void multiDimensionalArray(){
		//declaring and initializing 2D array
		int intArray[][] = {{1,2,4},{2,3,6},{4,5,8}};
		
		for (int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		ArraysExample objArraysExample = new ArraysExample();
		objArraysExample.oneDArray();
		
		objArraysExample.multiDimensionalArray();

	}

}
