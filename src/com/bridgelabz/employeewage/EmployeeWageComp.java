package com.bridgelabz.employeewage;

public class EmployeeWageComp {
	
	public static final int IS_Full_Time = 1;   // variable for checking employee worked full time
	public static final int Wage_per_hour = 20; //variable for wage per hour
	public static final int IS_Part_Time = 2; //variable for checking employee worked part time
	
	public static void main(String[] args){
		
		int ehours=0; //variable for total hours worked by employee
		int ewage =0; //variable for total wage considering hours worked by employee
		
		int echeck = (int)((Math.random()*10)%3);
		
		if (echeck==IS_Full_Time) ehours=8;
		else if (echeck == IS_Part_Time) ehours =4;
		
		ewage = ehours*Wage_per_hour;
		System.out.println("The daily Employee wage is "+ ewage);
	}
}
