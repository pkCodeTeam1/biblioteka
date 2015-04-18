package pl.edu.pk.pkCodeTeam1.biblioteka;

public class Book implements IDataLoad {
	private String author;
	private String title;
	private int id;
	
	public Book(int iidd)
	{
		this.id=iidd;
	}
	
	public void setAuthor(String auth)
	{
		this.author=auth;
	}
	
	public void setTitle(String titl)
	{
		this.title=titl;
	}
	
	public void loadDataOfBook()
	{
		System.out.println("Laduje dane ksiazki o id: "+ id+ " Autor: "+ author+ " Tytul: "+title);
	}
	
	
	
	

}
