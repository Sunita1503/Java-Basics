package com.sunita.assignments.basics.datatypes;

//demo java program for Float data type
public class FloatExample {

	//demo method for float data type
	public float subtractFloatnumbers(float param1, float param2){
		
		float result = param1 - param2;
		System.out.println("Subtraction of two float numbers " + param1 + " and " + param2 + " is : " + result);
		return result;
	}
	
	//demo method for double data type
	public double addDoubleNumbers(double param1, double param2){
		
		double result = param1 + param2;
		System.out.println("Addition of two double numbers " + param1 + " and " + param2 + " is : " + result);
		return result;
		
	}
	public static void main(String[] args) {
		
		//create object of class floatExample to access methods
		FloatExample objFloatexample = new FloatExample();
		
		//call method subtractFloatnumbers
		objFloatexample.subtractFloatnumbers(25245.464751447f, -3483248.535232136f);
		
		//call method addDoubleNumbers
		objFloatexample.addDoubleNumbers(-5344834.55363636d, 888745.411324d);
		

	}

}
