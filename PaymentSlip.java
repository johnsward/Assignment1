package Package;

public class PaymentSlip {
private static final double tax = 0.7;
private String name; 
private int hourlyRate; 
private int hours;

//Constructor 1 (Default constructor) 

public PaymentSlip() {
	
}
//Constructor 2 - We can create a constructor with parameters (as shown below), 
//that allow us to modify the state (instance variables) of the object) 
//"This.name" - This, meaning the object in question.

public PaymentSlip(String name, int hourlyRate, int hours) {

	this.name = name;
	this.hourlyRate = hourlyRate;
	this.hours = hours;
}

//Getters & Setters, to be able to get and set (Methods) 

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getHourlyRate() {
	return hourlyRate;
}
public void setHourlyRate(int hourlyRate) {
	this.hourlyRate = hourlyRate;
}
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
	
} 
public int calculateSalary() {
	return hours*hourlyRate; 
}
public double calculateNetSalary() {
	return hours*hourlyRate*tax; 
	
}

}