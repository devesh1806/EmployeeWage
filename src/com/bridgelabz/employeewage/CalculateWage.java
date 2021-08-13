package com.bridgelabz.employeewage;

public class CalculateWage {
	public static final int IS_Full_Time = 1;   // variable for checking employee worked full time
	public static final int Wage_per_hour = 20; //variable for wage per hour
	public static final int IS_Part_Time = 2; //variable for checking employee worked part time
	
	public static void compute() {
		int totalhours= 0 ; //variable for total hours worked by employee
		int emphrs = 0 ; //variable for hours worked by employee in day
		
		int totalwdays = 0; //variable for working days 
		
		while ( totalwdays < 20 && totalhours < 100 ) {  //condition for 20 days a month.
			
			totalwdays += 1;
			int echeck = (int)((Math.random()*10) % 3);
			
			switch(echeck) {
				case IS_Full_Time:
					emphrs = 8 ;
					break;
					
				case IS_Part_Time:
					emphrs = 4 ;
					break;
					
				default:
					emphrs = 0;
					break;
			}
			
			totalhours += emphrs;
			System.out.println("Day = " + totalwdays + " and Employee hour = " + emphrs );
			
		}
		int totalempwage = totalhours * Wage_per_hour ; 
		System.out.println("Total Employee wage is " + totalempwage );
	}
}
