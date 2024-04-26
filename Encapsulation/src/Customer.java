
public class Customer {
	public String getCustomer_name() {
		return Customer_name;
	}
	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}
	public int getCustomer_ID() {
		return Customer_ID;
	}
	public void setCustomer_ID(int customer_ID) {
		Customer_ID = customer_ID;
	}
	public String getCustumer_Address() {
		return Custumer_Address;
	}
	public void setCustumer_Address(String custumer_Address) {
		Custumer_Address = custumer_Address;
	}
	private String Customer_name;
	private int Customer_ID;
	private String Customer_Gender;
	public String getCustomer_Gender() {
		return Customer_Gender;
	}
	public void setCustomer_Gender(String customer_Gender) {
		Customer_Gender = customer_Gender;
	}
	public long getCustomer_mobile_number() {
		return Customer_mobile_number;
	}
	public void setCustomer_mobile_number(long customer_mobile_number) {
		Customer_mobile_number = customer_mobile_number;
	}
	private long Customer_mobile_number;
	private String Custumer_Address;
}

class Customer_Info {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Customer cs=new Customer();
		cs.setCustomer_ID(101);
		cs.setCustomer_name("Ninja");
		cs.setCustumer_Address("Pune,Maharashtra,India");
		cs.setCustomer_Gender("F");
		cs.setCustomer_mobile_number(987654321);
		
		
		System.out.println("ID No	: "+cs.getCustomer_ID());
		System.out.println("Name	: "+cs.getCustomer_name());
		System.out.println("Address : "+cs.getCustumer_Address());
		System.out.println("Gender  : "+cs.getCustomer_Gender());
		System.out.println("Mobile No. : "+ cs.getCustomer_mobile_number());
	}
}