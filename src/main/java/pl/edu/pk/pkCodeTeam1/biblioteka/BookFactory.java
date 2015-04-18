package pl.edu.pk.pkCodeTeam1.biblioteka;
import java.util.HashMap;

public class BookFactory {
	private static final HashMap<Integer, Book> bookMap=new HashMap<Integer, Book>();
	public static Book getBook(int id)
	{
		Book book=(Book)bookMap.get(id);
		if (book==null)
		{
			book=new Book(id);
			bookMap.put(id, book);
			System.out.println("Produkowanie ksiazki o id: "+ id);
		}
		return book;
	}
	
}
