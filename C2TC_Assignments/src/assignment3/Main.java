package assignment3;


	public class Main {
		public static void main(String args[]) {
			  // Part A: Inheritance
	        Book book = new Book(07, "OOPS CONCEPT", "ROHINRAJ");
	        Magazine magazine = new Magazine(71, "Tech talent", 65);

	        // Demonstrating is-a relationship
	        book.displayInfo();
	        magazine.displayInfo();

	        // Part B: Composition
	        Library library = new Library();
	        library.addItem(book);
	        library.addItem(magazine);

	        library.showAllItems();
		}
	}



