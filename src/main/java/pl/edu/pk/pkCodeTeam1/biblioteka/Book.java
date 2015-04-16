package pl.edu.pk.pkCodeTeam1.biblioteka;

public class Book implements IDataLoad {
	private String author;
	private String title;
	
	public Book(String aut="jan", String titl="brak")
	{
		this.author=aut;
		this.title=titl;
	}
	
	public void zaladujDane()
	{
		System.out.println("Laduje dane.");
	}
	
	
	
	

}
