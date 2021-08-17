package com.bridgelabz.employeewage;

public class CalculateWage {
	
	
	public static String compname;
	public static int Wage_per_hour;
	public static int hours;
	public static int days;
	static int totalempwage;
	
	public CalculateWage(String compname, int Wage_per_hour, int days, int hours) {
		 this.compname=compname;
		 this.Wage_per_hour = Wage_per_hour;
		 this.days = days;
		 this.hours = hours;
	}
	
	public void setTotalempwage(int totalempwage) {
		this.totalempwage=totalempwage;
	}
	
	
	@Override
	public String toString() {
		return "Total Employee wage earned in " + compname + " is " + totalempwage ;
	}
}
