package com.sunita.assignments.basics.variables;

//Demo java program for variables - local , static and instance 
public class VariableExample {
	
	
	
	int varEmpNo ;		//instance variable
	String varEmpName;	//instance variable
	static String varCompanyName = "OFS";  //static variable
	
	//constructor
	public VariableExample(int empNo , String  empName) {
		
		varEmpNo = empNo;
		varEmpName = empName;
		
	}
	
	//method to display values
	void displayEmpInformation(){
		System.out.println(" Employee No  : " + varEmpNo + " Emp Name : " + varEmpName + " For Company  : " + varCompanyName );
	}
	
	
	public static void main(String[] args) {
		
		//create objects for employees information
		VariableExample objVariableExample1 = new VariableExample(11, "Bhaskar");
		VariableExample objVariableExample2 = new VariableExample(34, "Ojaswi" );
		
		//display information
		objVariableExample1.displayEmpInformation();
		objVariableExample2.displayEmpInformation();
		
	}
}
