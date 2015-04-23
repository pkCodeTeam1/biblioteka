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
	
	private static String getRandomCategory()
	{
		return categories[(int)(Math.random()*categories.length)];
	}
	
	private static String getRandomCategoryNumber(int n)
	{
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

    	for (int i=1; i<=20; i++){
    			
    		Book book=(Book)BookFactory.getBook(i);
    		book.setAuthor(getRandomAuthor());
    		book.setTitle(getRandomTitle());
    		BookWrapper bookw = new BookWrapper();
    		bookw.set_ID(i);
    		katalog.add_category(getRandomCategoryNumber(1), getRandomCategory());
    			
    	}
        
    }
}
