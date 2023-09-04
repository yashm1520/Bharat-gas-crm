package Customer;
import GasSupplier.GasAgency;
public class Customer implements GasAgency {

	public String Name;
	public String Mobile;
	public String Address;
	public String Street;
	public String Area;
	public String Pincode;
	public Customer(String Name, String Mobile, String Address, String Street, String Area) {
		
		this.Name = Name;
		this.Mobile = Mobile;
		this.Address = Address;
		this.Street = Street;
		this.Area = Area;
		this.Pincode=Pincode;
	}
	
	
	
}
