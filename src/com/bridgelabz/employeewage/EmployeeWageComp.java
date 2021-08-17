package com.bridgelabz.employeewage;

public class EmployeeWageComp {
	
	public static final int IS_Full_Time = 1;   // variable for checking employee worked full time
	public static final int IS_Part_Time = 2; //variable for checking employee worked part time
	int num = 0;
	CalculateWage[] arr;
	
	public EmployeeWageComp(){
		arr = new CalculateWage[3];
	}
	
	private void addcompwage(String compname, int Wage_per_hour, int days, int hours) {
		arr[num] = new CalculateWage(compname, Wage_per_hour, days, hours);
		num++;
	}
	
	private void computeemp() {
		for(int i=0;i<num;i++) {
			int totalhours= 0 ; //variable for total hours worked by employee
			int emphrs = 0 ; //variable for hours worked by employee in day
			
			int totalwdays = 0; //variable for working days 
			
			while ( totalwdays < arr[i].days && totalhours < arr[i].hours ) {  
				
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
			arr[i].setTotalempwage(totalhours * arr[i].Wage_per_hour) ;
			System.out.println(arr[i]);
			System.out.println();
		}
		
	}
		
	
	
	public static void main(String[] args){
		
		EmployeeWageComp emp1 = new EmployeeWageComp();
		emp1.addcompwage("JIO", 20, 20, 100);
		emp1.addcompwage("Reliance", 25, 22, 110);
		emp1.computeemp();
		
	}
}
