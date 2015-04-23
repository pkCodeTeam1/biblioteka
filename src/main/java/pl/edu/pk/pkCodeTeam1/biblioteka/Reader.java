package pl.edu.pk.pkCodeTeam1.biblioteka;


public class Reader implements IObserver{

	private Library library;
	private boolean[] bookStatus;
	
	public Reader(Library library) {
		this.library = library;
		this.library.addObserver(this);
		this.library.notifyObserver();
	}
	
	public boolean checkBook(int bookID){
		if(bookStatus[bookID])
			return true;
		else
			return false;
	}
	
	public void update(boolean[] bookStatus) {
		this.bookStatus = bookStatus;
	}

}
