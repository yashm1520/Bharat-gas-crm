package Customer;
import java.text.*;
import java.util.*;
public class Connection extends Customer {
	
	public int numberofCylinder;
	public static int connectionNumber=100;
	{
		connectionNumber=1+connectionNumber;
	}
	public String date;
	public Date lastDate=null;
	
	
	SimpleDateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy");


	public Connection(String Name, String Mobile, String Address, String Street, String Area,int numberofCylinder) {
		super(Name, Mobile, Address, Street, Area);
		this.numberofCylinder=numberofCylinder;
	}
	
      public void getlastDate() {
	   System.out.println("Enter the last date");
	   date=new Scanner(System.in).next();
	  
	   try {
		   lastDate=dateformat.parse(date);
	   }catch(Exception e) {
		   System.out.println("the exception is "+ e);
	   }
	   
   }
}
