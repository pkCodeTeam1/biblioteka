package pl.edu.pk.pkCodeTeam1.biblioteka;

import java.util.ArrayList;

public class Library implements IObserved {

	private ArrayList<Reader> readers;
	
	public Library() {
		readers = new ArrayList<Reader>();
	}
	
	@Override
	public void addObserver(Reader r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteObserver(Reader r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
