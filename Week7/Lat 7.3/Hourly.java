package anotherTypeOfEmployee;

public class Hourly extends Employee {
	private int hoursWorked;
 
	//--------------------------------------------------------------------------------
	// sets up this hourly employee using the specified information.
	//--------------------------------------------------------------------------------
	public Hourly (String eName, String eAddress, String ePhone, String socSecNumber, double rate){
		
		super (eName, eAddress, ePhone, socSecNumber, rate);
		
		hoursWorked = 0;
	}
	//--------------------------------------------------------------------------------
	// computes and returns the pay for this hourly employee.
	//--------------------------------------------------------------------------------
	public void addHours (int moreHours){
		hoursWorked += moreHours;
	}
	
	public double pay (){
		double payment = payRate * hoursWorked;
		
		hoursWorked = 0;
		
		return payment;
	}
	//--------------------------------------------------------------------------------
	// returns information about this hourly employee as a string .
	//--------------------------------------------------------------------------------
	public String toString(){
		String result = super.toString();
		
		result += "\nCurrent hours: " + hoursWorked;
		
		return result;		
	}
}