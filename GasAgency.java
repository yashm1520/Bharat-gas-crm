package GasSupplier;

public interface GasAgency {
 
  public String agencyName=" Meena Bharat Gas Agency";
  public static int agencyCode=1234;
  public int agencyphonenumber=9111149;
  public static int pincode =461001;
   default void agencyDisplay(){
	   System.out.println("Agency Name is :        " + agencyName);
	   System.out.println("Agency code is :        " + agencyCode);
	   System.out.println("Agency phone number is :" + agencyphonenumber);
   }
}
