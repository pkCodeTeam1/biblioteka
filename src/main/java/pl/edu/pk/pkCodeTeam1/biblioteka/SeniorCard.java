package pl.edu.pk.pkCodeTeam1.biblioteka;

public class SeniorCard implements CardType {

	public void annual_fee() {
		System.out.println( "Opłata roczna wynosi 15 zł" );
	}

	public void penalty() {
		System.out.println( "Kara za przetrzymywanie książek wynosi 11 zł" );
	}

	public String toString(){
		return "Senior";
	}
}
