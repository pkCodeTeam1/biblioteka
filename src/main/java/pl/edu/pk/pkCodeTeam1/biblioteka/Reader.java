package pl.edu.pk.pkCodeTeam1.biblioteka;


public class Reader implements IObserver{

	private Library library;
	private boolean[] bookStatus;
	
	public Reader(Library library) {
		this.library = library;
		this.library.addObserver(this);
		this.library.notifyObserver();
	}
	
	public void checkBook(int bookID){
		if(bookStatus[bookID])
			System.out.println("dostępna");
		else
			System.out.println("niedostępna");
	}
	
	public void update(boolean[] bookStatus) {
		this.bookStatus = bookStatus;
	}

}
