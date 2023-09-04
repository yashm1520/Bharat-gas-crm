package Gasbooking;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.util.*;
import Getbooking.Booking;
public class Delivery extends Booking  {
	
public Delivery(String Name, String Mobile, String Address, String Street, String Area, int numberofCylinder) {
		super(Name, Mobile, Address, Street, Area, numberofCylinder);
		
	}

public int customerotp;
public String delpersonname;
public int delmobile;
public void amount() {
	long difference=dt_2.getTime()-dt_1.getTime(); //dt_2 delivery date and dt_1 booking date
	//Duration duration=Duration.ofMillis(diff);
	//long newDifference=duration.toDays();
	long newDifference=TimeUnit.DAYS.convert(difference,TimeUnit.MILLISECONDS);
	
	if(newDifference>7) {
		refund=41.17;
		amount=amount-refund;
	}
	
}
public void verify() {
	System.out.println("Enter Otp");
	customerotp=new Scanner(System.in).nextInt();
	if(status.equals("B")) {
	if(customerotp!=otp) {
		status="C";
	}else {
		status="D";
	}
	}else {
		System.out.println("No booking found");
	}
}
public void delpersondetail() {
	
	System.out.println("Enter Delivery Person Detail");
	delpersonname=new Scanner(System.in).nextLine();
}

}
