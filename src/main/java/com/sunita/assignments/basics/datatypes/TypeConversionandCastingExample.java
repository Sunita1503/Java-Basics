package com.sunita.assignments.basics.datatypes;

//demo java program for Type Conversion and Casting
public class TypeConversionandCastingExample {
	
	public static void main(String[] args) {
		
		//narrowing or type casting

		float varFloat = 34.52f;
		int varInt = (int) varFloat; //typecasting

		System.out.println("Integer number " + varInt);
		System.out.println("Float number " + varFloat);

		//widening or type conversion
		 
		 varFloat  = varInt;
		
		System.out.println("New Integer number " + varInt);
		System.out.println("New Float number " + varFloat);
		
		//overflow
		varInt = 131;
		byte varByte = (byte)varInt;
		System.out.println("Byte value " + varByte);
		
		
		
		
	}

}
