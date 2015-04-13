/**
 * 
 */
package pl.edu.pk.pkCodeTeam1.biblioteka;

/**
 * @author MikeNovember
 *
 */
public class Book implements Browsable {

	public Browsable search(String category) {
		return this;
	}

	public boolean is_book(){
		return true;		
	}

	public String to_string() {
		return new String("Tytul ksiazki");
	}

	public String contents_string() {
		return new String("Opis ksiazki");
	}

}
