package pl.edu.pk.pkCodeTeam1.biblioteka;

import java.util.ArrayList;
import java.util.List;

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
    
      	double w = 0.0;
      	
    	for (int i = 0; i < 20; i++){		
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
    	
    	ReaderCard user1 = new ReaderCard("0", "Jan", "Zoń", lib);
    	ReaderCard user2 = new ReaderCard("1", "Janusz", "Koksu", lib);
    	ReaderCard user3 = new ReaderCard("2", "John", "Kowalsky", lib);
    	
    	user1.readerContact.checkBook(10);
    	
    	
    		
    	

    }
}
