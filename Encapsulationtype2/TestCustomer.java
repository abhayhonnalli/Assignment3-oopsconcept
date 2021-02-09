package encapsulatiotype2;


public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust=new Customer("John",new Address("1st Main HSR Layout","Banglore"),new Address("1st Main Electronics city","Banglore"));
		System.out.println(cust.getCustomerDetails());
	}

}
