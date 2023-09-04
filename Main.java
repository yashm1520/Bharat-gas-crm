package Customer;
import java.util.*;
import java.time.*;
import GasSupplier.GasAgency;
import Customer.*;
import Getbooking.*;
import Gasbooking.*;
import java.text.*
;public class Main {
static int count;
static int bcount=0,ccount=0,dcount=0,pcount=0;

public static String dpname;

//@SuppressWarnings("deprecation")
@SuppressWarnings("deprecation")
public static void cylinderCount(Delivery[] obj) {
	String[] months=new String[] {
			"january","february","march","april","may","june","july","august","september","october","November","december"
	};
	for(Delivery delivery:obj) {
		 count=0;
	//	 LocalDate dt=new LocalDate.parse(dt_2);
	 System.out.println("In The Month : "+(months[delivery.dt_2.getMonth()]));
	 System.out.println("* in :"+delivery.Area);
		 if(delivery.status.equals("D")) {
			 count+=delivery.numberofCylinder;
		 }
		 System.out.println("- "+count+" cylinder delivered");
	}
	
	System.out.println("\n");
	
}
       
	public void checklist(Delivery[] obj) {
    	   String[] months=new String[] {
    				"january","february","march","april","may","june","july","august","september","october","November","decembere"
    		};
    	   int[] month=new int[12];
    	   for(Delivery delivery: obj) {
    		   if(delivery.status.equals("D")&&delivery.amount==783.75) {
    			   month[delivery.dt_2.getMonth()]+=1;
    		   }
    		   System.out.println("-------------late delivery----------");
    		   for(int i=0;i<12;i++) {
    			   if(month[i]!=0) {
    	       System.out.println("in the month of :"+months[i]+" total : "+month[i]);
    			   }
    		   }
    		   System.out.println("/n");
    	   }
    }
       public static void singlecylinder(Delivery[] obj) {
    	   int i=101;
    	   for(Delivery delivery:obj) {
    		   if(delivery.numberofCylinder==1) {
    			   System.out.println("Customer name :"+delivery.Name);
    			   System.out.println("Mobile number :"+delivery.Mobile);
    			   System.out.println("Gas Connection :"+i);
    		   }
    		   i++;
    	   }
    	  
       }
       public static void deliverydetail(Delivery[] obj) {
    	   
    	   System.out.println("---------delivery details------------");
    	   System.out.println("---------enter the name of delivery person------");
    	   dpname=new Scanner(System.in).nextLine();
		   for(Delivery delivery:obj) {
			   if(delivery.status.equals("D")&&delivery.delpersonname.equals(dpname)) {
				   System.out.println("Customer Name :"+delivery.Name+" "+delivery.Mobile+" "+delivery.Area+" "+delivery.Pincode);
				  
			   }
		   }
		   System.out.println("/n");
	   }
       
       public static void printreport(Delivery[] obj) {
    	   for(Delivery delivery:obj) {
    		   if(delivery.status.equals("D")) {
    			   dcount++;
    		   }else if(delivery.status.equals("C")) {
    			   ccount++;
    		   }else if(delivery.status.equals("B")) {
    			   bcount++;
    		   }else if(delivery.status.equals("P")) {
    			   pcount++;
    		   }
    	   }
    	   System.out.println("delivered :"+dcount);
    	   System.out.println("cancel :"+count);
    	   System.out.println("booked :"+bcount);
    	   System.out.println("pending :"+pcount);
    	   System.out.println("\n");
       }
       public static void printinvoice(Delivery[] obj) {
    	   Date d=new Date();
    	   SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
    	   String invoiceDate=sdf.format(d);
    	   for(int i=0;i<obj.length;i++) {
    		   if(obj[i].status.equals("D")) {
    			   System.out.println("--------------------------------------------------------------------");
    			   System.out.println("INVOICE");
    			   System.out.println("--------------------------------------------------------------------");
    			   System.out.println("Gas Agency Code : "+obj[i].agencyCode+"    "+"Date of invoice "+invoiceDate);
    			   System.out.println("Gas Agency Name : "+obj[i].agencyName+"   "+"Agency Phonr Number "+obj[i].agencyphonenumber);
    			   System.out.println("Gas Connection Number :"+(i+101)+"    "+"Customer Name "+obj[i].Name);
    			   System.out.println("Booking Date"+sdf.format(obj[i].dt_1)+"   "+"Customer Mobile Number "+obj[i].Mobile);
    			   System.out.println("-------------------------------------------------------------------------------------");
    			   System.out.println("Amount :"+obj[i].amount);
    			   System.out.println("Refund :"+obj[i].refund);
    			   System.out.println("Total :"+(obj[i].amount-obj[i].refund));
    			   System.out.println("-------------------------------------------------------------------------------------");
    			   System.out.println("Delivery person Name"+obj[i].delpersonname+"\t\t"+"del Mobile Number"+obj[i].delmobile);
    			   System.out.println("Delivery Date"+sdf.format(obj[i].dt_2));
    			   System.out.println("--------------------------------------------------------------------------------------");
    			   System.out.println("\n\n");
    		   }
    	   }
       }
	public static void main(String[] args) {
		System.out.println("*************************************************************");
		System.out.println("                Meena Bharat Gas Agency                      ");
		System.out.println("*************************************************************");
		Delivery[] deliveryObject=new Delivery[1];
		deliveryObject[0]=new Delivery("harsh","7000294743","kalika Nagar","Atm Line","Near Mata",1);
		for(Delivery delivery:deliveryObject) {
			delivery.delpersondetail();
			delivery.getlastDate();
			delivery.getDates();
			delivery.validate();
			delivery.amount();
			delivery.verify();
			
		}
		System.out.println();
		
		cylinderCount(deliveryObject);
		singlecylinder(deliveryObject);
		deliverydetail(deliveryObject);
		printreport(deliveryObject);
        printinvoice(deliveryObject);
	}

}
