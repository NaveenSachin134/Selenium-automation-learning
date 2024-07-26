package week1.assignment;

public class Library {
	
	 String addBook(String bookTitle) {
		
		return("Book added Successfully");
		}
	 public void issueBook() {
		 
		 System.err.println("Book issued Successfully");
	 }
	 
	 public static void main(String[] args) {
		
		 Library lib=new Library();
		 
		 System.out.println(lib.addBook(null));
		 
		 lib.issueBook();
	}
	 

}

//	String s=Java Quiz;
