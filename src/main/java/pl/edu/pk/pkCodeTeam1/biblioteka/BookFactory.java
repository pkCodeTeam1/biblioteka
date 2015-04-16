package pl.edu.pk.pkCodeTeam1.biblioteka;
import java.util.HashMap;

public class BookFactory {
	private static final HashMap<int, Book> bookMap=new HashMap();
	public static Book getBook(int id)
	{
		Book concreteBook=(Book)bookMap.get(id);
		if (concreteBook==null)
		{
			concreteBook=new Book(id);
			bookMap.put(id, concreteBook);
			System.out.println("Produkowanie książki o id: "+ id);
		}
		return concreteBook;
	}
	
}
