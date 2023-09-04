package Getbooking;
import Customer.Connection;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
public class Booking extends Connection {

	public double otp=5678,amount=825.0,refund=0;
	public String dt,delDate,status,DelMobileNod="9111149543";
			public Date dt_1;
			public  Date dt_2;
	         
	public Booking(String Name, String Mobile, String Address, String Street, String Area, int numberofCylinder) {
		super(Name, Mobile, Address, Street, Area, numberofCylinder);
		
	}
	   public void getDates() {
		// booking date
		System.out.println("enter booking date: ");
		dt=new Scanner(System.in).next();
		
		SimpleDateFormat dateformat=new SimpleDateFormat("dd/mm/yyyy");
		
		try {
			dt_1=dateformat.parse(dt);
		}catch(Exception e) {
			System.out.println("error is occur"+e);
		}
		// delivery date
		System.out.println("Enter delivery date");
		delDate=new Scanner(System.in).next();
		
		try {
			dt_2=dateformat.parse(delDate);
		}catch(Exception e) {
			System.out.println("Error occur"+e);
		}
		
		// difference between two date
		
		try {
			long difference=dt_2.getTime()-dt_1.getTime();
			
			// difference in days
			long newDifference=TimeUnit.DAYS.convert(difference,TimeUnit.MILLISECONDS);
			if(newDifference>7) {
				status="P";
			}
		}catch(Exception e) {
			System.out.println("error"+e);
		}
		
		
	}
	public void validate() {
		long diff=dt_1.getTime()-lastDate.getTime();
		
		// difference in days
		//Duration duration=Duration.ofMillis(diff);
		//long difference=duration.toDays();
				long difference=TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
		
		if(numberofCylinder==1) {
			if(difference<30) {
				status="C";
				System.out.println("Difference is less  between lastdate and booking date");
			}else {
				status="B";
				lastDate=dt_1;
			}
		}else if(numberofCylinder==2) {
			if(difference<50) {
				status="C";
				System.out.println("Difference is less between lastdate and booking date");
			}else {
				status="B";
				lastDate=dt_1;
			}
		}
		
	}
	
}
