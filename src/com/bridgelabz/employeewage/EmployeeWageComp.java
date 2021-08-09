package com.bridgelabz.employeewage;

public class EmployeeWageComp {
	public static final int IS_Time = 1;   // variable for checking employee present or not
	public static final int Wage_per_hour = 20; //variable for wage per hour
	public static void main(String[] args){
		
		int ehours=0; //variable for total hours worked by employee
		int ewage =0; //variable for total wage considering hours worked by employee
		int poa = (int)((Math.random()*10)%2);
		if (poa==IS_Time) ehours=8;
		ewage = ehours*Wage_per_hour;
		System.out.println("The daily Employee wage is "+ ewage);
	}
}
