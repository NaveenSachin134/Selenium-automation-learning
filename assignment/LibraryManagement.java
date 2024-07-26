package week1.assignment;

public class LibraryManagement {
	public static void main(String[] args) {
		Library lib1 = new Library();
		
		System.out.println(lib1.addBook(null));
		 
		 lib1.issueBook();
	}
}
