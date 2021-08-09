package com.bridgelabz.employeewage;

public class EmployeeWageComp {
	public static final int IS_Time = 1;   // variable for checking employee present or not
	public static void main(String[] args){
		
		int poa = (int)((Math.random()*10)%2);
		if (poa==IS_Time) System.out.println("Employee is present");
		else System.out.println("Employee is absent");
	}
}
