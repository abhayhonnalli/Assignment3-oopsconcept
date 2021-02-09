package encapsulationbook;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*EngineeringBook bk=(EngineeringBook) new Book(1122,"The Grass is always Greener","Arnold", 900,"Crime");
		System.out.println("bookNo;"+bk.getBookNo());
		System.out.println("book title;"+bk.getTitle());
		
		System.out.println("book Author;"+bk.getAuthor());
		System.out.println("bookprice;"+bk.getPrice());
		
		System.out.println("category"+bk.getCategory());*/
		EngineeringBook book=new EngineeringBook(0, null, null, 0);
		book.setBookNo(1122);
		book.setAuthor("Arnold");
		book.setTitle("The Grass is always Greener");
		book.setPrice(900);
		book.setCategory("crime");
		System.out.println(book);
	}

}
