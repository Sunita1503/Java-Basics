package com.sunita.assignments.basics.datatypes;

//demo java program for Integer data type
public class IntegerExample {
	
	//demo method for byte data type
	public void byteDemo(){
		
		byte varByte = -128;
		System.out.println("Byte value is " + varByte);
		varByte--;
		System.out.println("New byte value " + varByte);
	}
	
	//demo method for short data type
	public void shortDemo(){
		
		short varShort = 32767;
		System.out.println("Short varibale value " + varShort);
		varShort++;
		System.out.println("New short variable value " + varShort);
		
		
	}
	
	//demo method for int data type using multiplication of two numbers
	public int multiplyIntegerNumbers(int param1, int param2){
		int result = param1 * param2 ;
		System.out.println("Multiplication of two integer numbers " + param1 + " and " + param2 + " is : " + result);
		return result;
	}
	
	//demo method for long data type
	public long addLongnumbers(long param1, long param2){
		long result = param1 + param2;
		System.out.println("Addition of two long numbers " + param1 + " and " + param2 + " is :" + result);
		return result;
	}
	

	public static void main(String[] args) {
		
		//create object for class integerExample
		IntegerExample objIntegerExample = new IntegerExample();
		
		//call byteDemo method
		objIntegerExample.byteDemo();
		
		//call method shortDemo
		objIntegerExample.shortDemo();
		
		//multiplication of two integer numbers
		objIntegerExample.multiplyIntegerNumbers(25, 40);
		
		//Addition of two long numbers
		objIntegerExample.addLongnumbers(23524314341446l, 85874387483979487l);

	}

}
