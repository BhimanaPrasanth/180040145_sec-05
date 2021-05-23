package Library;

public class LibraryInterface {
	public static void main(String[] args) {
		KidsUser k = new KidsUser();
		
		k.setAge(10);
		k.setBookType("Kids");
		k.registerAccount();
		k.requestBook();
		
		k.setAge(18);	
		k.setBookType("Fiction");		
		k.registerAccount();
		k.requestBook();

		System.out.println();
		
		AdultUser a = new AdultUser();
		
		a.setAge(5);
		a.setBookType("Kids");
		a.registerAccount();
		a.requestBook();
		
		a.setAge(23);	
		a.setBookType("Fiction");		
		a.registerAccount();
		a.requestBook();
		
	}

}

