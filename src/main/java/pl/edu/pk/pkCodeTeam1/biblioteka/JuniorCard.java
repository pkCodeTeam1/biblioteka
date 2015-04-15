package pl.edu.pk.pkCodeTeam1.biblioteka;

public class JuniorCard implements CardType {

	public void annual_fee() {
		System.out.println( "Opłata roczna wynosi 10 zł" );
	}

	public void penalty() {
		System.out.println( "Kara za przetrzymywanie książek wynosi 7 zł" );
	}

	public String toString(){
		return "Junior";
	}
}
