package com.bridgelabz.employeewage;

public class EmployeeWageComp {
	
	public static void main(String[] args){
		
		//company1
		CalculateWage cw1 = new CalculateWage("Reliance",20,20,100);
		
		//company2
		CalculateWage cw2 = new CalculateWage("Capgemini",25,22,110);
		
		cw1.compute();
		System.out.println(cw1);
		System.out.println();
		cw2.compute();
		System.out.println(cw2);
		
	}
}
