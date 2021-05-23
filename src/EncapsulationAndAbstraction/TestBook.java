package EncapsulationAndAbstraction;

public class TestBook {
	public static void main(String[] args) {
	      Author a = new Author("Ram", "Ram@c.com", 'm');
	      System.out.println(a);  
	      Book dummyBook = new Book("Java for Beginners", a, 9.99, 99);
	      System.out.println(dummyBook);  
	      dummyBook.setPrice(8.88);
	      dummyBook.setQty(88);
	      System.out.println("name is: " + dummyBook.getName());
	      System.out.println("price is: " + dummyBook.getPrice());
	      System.out.println("qty is: " + dummyBook.getQty());
	      System.out.println("author is: " + dummyBook.getAuthor());  // invoke Author's toString()
	      System.out.println("author's name is: " + dummyBook.getAuthor().getName());
	      System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
	      System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());
	      Book moreDummyBook = new Book("Java for Advanced Learners",
	            new Author("Raju", "Raju@w.com", 'm'), 
	            19.99, 8);
	      System.out.println(moreDummyBook);  
	   }

}

