package encapsulation;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address ad=new Address("Ist Main HSR Layout"," Bangalore");
		System.out.println(	ad.getAddressDetails());
			
			Customer cs=new Customer("john", ad);
			System.out.println("Customer name;" +cs.getCustomerName());
			System.out.println(	"Residential address;" +cs.getResidentialAddress());
	}

}
