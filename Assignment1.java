package Package;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Assignment1 {
	
public static void main(String[] args) throws InterruptedException {
PaymentSlip ps=new PaymentSlip();

Scanner sc=new Scanner (System.in);


String name;
int hourlyRate; 
int hours; 

 System.out.println("Employee name: ");
 		name=sc.nextLine(); 
 		ps.setName(name);
 System.out.println("Hourly rate: ");
 		hourlyRate=sc.nextInt();
 		ps.setHourlyRate(hourlyRate);
 System.out.println("Amount of hours worked: ");
 		hours=sc.nextInt(); 
 		ps.setHours(hours);

 System.out.print("\nCalculating"); 
 	for(int i=0; i<3; i++) {
 	TimeUnit.SECONDS.sleep(1);
 	System.out.print(".");
 }
 	
 	
 System.out.println("\n------------------------");
 System.out.println("## PAYMENT INFORMATION ##");
 System.out.println("Name: " + "\t" + "\t" + "\t" + ps.getName());
 System.out.println("Hourly rate: " + "\t" + "\t"  + ps.getHourlyRate() + " USD");
 System.out.println("Hours worked: " + "\t" + "\t" + ps.getHours() + " Hours" + "\n");
 System.out.println("Salary before tax: " + "\t" + ps.calculateSalary() +  " USD");
 System.out.println("Salary after tax: " + "\t" + ps.calculateNetSalary() + " USD" + "\n");
 System.out.println("If you have any questions regarding your salary, contact Bob");
 System.out.println("------------------------");

}	
 	}



		