package com.bridgelabz.employeewage;

public class CalculateWage {
	
	public static final int IS_Full_Time = 1;   // variable for checking employee worked full time
	public static final int IS_Part_Time = 2; //variable for checking employee worked part time
	
	CalculateWage(String compname, int Wage_per_hour, int days, int hours) {
		int totalhours= 0 ; //variable for total hours worked by employee
		int emphrs = 0 ; //variable for hours worked by employee in day
		
		int totalwdays = 0; //variable for working days 
		
		while ( totalwdays < days && totalhours < hours ) {  
			
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
			
		}
		int totalempwage = totalhours * Wage_per_hour ; 
		System.out.println("Total Employee wage earned in " + compname + " is " + totalempwage );
	}
}
