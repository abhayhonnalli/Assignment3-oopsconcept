package encapsulation;

public class Address {
	
	private String addressline;
	private String city;
	
	public Address(String addressline, String city) {
		super();
		this.addressline = addressline;
		this.city = city;
	}

	public String getAddressline() {
		return addressline;
	}


	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressDetails()
	{
		return addressline+","+city;
	}
	
	public String toString() 
    { 
        return getAddressDetails()+","+getCity();
    }


	} 

