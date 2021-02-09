package encapsulationbook;

public class EngineeringBook extends Book{
	public EngineeringBook(int bookNo, String title, String author, float price) {
		super(bookNo, title, author, price);
		// TODO Auto-generated constructor stub
	}


	private String category;

	
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return super.toString()+"EngineeringBook [category=" + category + "]";
	}


	
	

}
