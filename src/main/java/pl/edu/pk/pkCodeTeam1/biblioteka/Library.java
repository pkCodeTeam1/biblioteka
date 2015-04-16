package pl.edu.pk.pkCodeTeam1.biblioteka;

import java.util.ArrayList;

public class Library implements IObserved {

	private ArrayList<Reader> readers;
	private boolean[] bookStatus;
	
	public Library(boolean[] bookBase) {
		readers = new ArrayList<Reader>();
		this.bookStatus = bookBase;
	}

	public void addObserver(Reader r) {
		readers.add(r);		
	}

	public void deleteObserver(Reader r) {
		int index = readers.indexOf(r);
		readers.remove(index);
	}

	public void notifyObserver() {
		for(Reader r : readers){
			r.update(bookStatus);
		}
		
	}

}
