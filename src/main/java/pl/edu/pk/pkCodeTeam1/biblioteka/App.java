package pl.edu.pk.pkCodeTeam1.biblioteka;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final String authors[]={"JanuszC", "AdamK", "JozefS", "StanislawW", "JuliuszS", "KrzysztofB"};
	private static final String titles[]={"X", "XX", "XXX", "Y", "YY", "YYY", "Z", "ZZ", "ZZZ"};
	private static final String categories[]={"A", "AA", "AAA", "B", "BB", "BBB", "C", "CC", "CCC"};
	private static ClassifiedCatalogue katalog= new ClassifiedCatalogue();
	private static boolean [] bookReserved = new boolean [20];
	
	private static String getRandomCategory()
	{
		return categories[(int)(Math.random()*categories.length)];
	}
	
	private static String getRandomCategoryNumber(int n)
	{
		if(n == 0)
			return "";
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0 ; i < n ; ++i){
			sb.append((int)(Math.random()*3));
			if (i < n-1)
				sb.append(".");
		}
		
		return sb.toString();
	}
	
	
	private static String getRandomAuthor()
	{
		return authors[(int)(Math.random()*authors.length)];
	}
	
	private static String getRandomTitle()
	{
		return titles[(int)(Math.random()*titles.length)];
	}
	
    public static void main( String[] args )
    {
    	katalog.add_category("", "glowna");
      	//katalog.print("");
      	
      	katalog.add_category("",  getRandomCategory());
		katalog.add_category("",  getRandomCategory());
		katalog.add_category("", getRandomCategory());
		katalog.add_category("0", getRandomCategory());
		katalog.add_category("1", getRandomCategory());
		katalog.add_category("2", getRandomCategory());
      	
    	for (int i = 0; i < bookReserved.length; i++){		
    		Book book=(Book)BookFactory.getBook(i);
    		book.setAuthor(getRandomAuthor());
    		book.setTitle(getRandomTitle());
    		BookWrapper bookw = new BookWrapper();
    		bookw.set_ID(i);
    		String subcat = getRandomCategoryNumber(1);
    		katalog.add_book(subcat, i);
    		bookReserved[i] = true;
    		//katalog.print(subcat);		
    	}
    	
    	Library lib = new Library(bookReserved);
    	
    	ReaderCard [] users = { new ReaderCard("0", "Jan", "Zoń", lib),
    						  	new ReaderCard("1", "Janusz", "Koksu", lib),
    						  	new ReaderCard("2", "John", "Kowalsky", lib) };
    	String surname;
    	Scanner reading = new Scanner(System.in);
    	boolean found = false;
    	int selection = 0, i, age;
    	
		System.out.print("\tProgram biblioteka\n\nAby zalogować się na swoje konto podaj nazwisko: ");
		surname = reading.nextLine();
		for (i = 0; i < users.length; i++) {
			if(surname.equalsIgnoreCase(users[i].getSurname())) {
				found = true;
				break;
			}
		}
		if(found == true)
			System.out.println("\nWitaj " + surname + "!\n");
		else {
			System.out.println("\nNie ma Cię w bazie biblioteki!");
			selection = 7;
		}
    	
		while(selection != 7){
    		
    		System.out.println("\n\tMenu\n\nWybierz:\n> 1 - Wyświetlenie kategorii");
    		System.out.println("> 2 - Wyszukanie książki\n> 3 - Sprawdzenie, czy książka jest dostępna");
    		System.out.println("> 4 - Wyświetlnienie informacji o koncie");
    		System.out.print("> 5 - Zmiana typu konta\n> 6 - Co wam jeszcze przyjdzie do głowy\n> 7 - wyjście z programu\n\n> ");
    		selection = reading.nextInt();
    		System.out.println();
    		
    		switch (selection) {
			case 1:
					
				break;
			case 2:
				
				break;
			case 3:
				
		    	//if(users[0].readerContact.checkBook(10)) 
		    		//bookReserved[10] = false;
				
				break;
			case 4:
				System.out.println(users[i]);
				break;
			case 5:
				System.out.print("Podaj swój wiek: ");
				age = reading.nextInt();
				if(age < 18){
					users[i].type_junior();
					System.out.print("Typ konta został zmieniony na Junior");
				}
				else if(age < 60) {
					users[i].type_standard();
					System.out.print("Typ konta został zmieniony na Standard");
				}
				else {
					users[i].type_senior();
					System.out.print("Typ konta został zmieniony na Senior");
				}
				break;
			case 6:
				
				break;
			case 7:
				break;
			default:
				System.out.println("Wybrana przez Ciebie opcja nie istnieje!");
				break;
			}
    		
    	}
    
    	System.out.println("Dziękujemy za skorzystanie z naszego programu.");
    }
}
