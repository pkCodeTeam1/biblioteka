package pl.edu.pk.pkCodeTeam1.biblioteka;

public class StandardCard implements CardType {

	public void annual_fee() {
		System.out.println( "Opłata roczna wynosi 20 zł" );
	}

	public void penalty() {
		System.out.println( "Kara za przetrzymywanie książek wynosi 19 zł" );
	}

	public String toString(){
		return "Standard";
	}
}
