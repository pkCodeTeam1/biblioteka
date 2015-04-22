/**
 * 
 */
package pl.edu.pk.pkCodeTeam1.biblioteka;

/**
 * @author MikeNovember
 *
 */
public class BookWrapper implements Browsable {

	public void set_ID(int ID){
		m_ID = ID;
	}
	
	public Browsable search(String category) {
		return this;
	}

	public boolean is_book(){
		return true;		
	}

	public String title() {
		return new String("Tytul ksiazki");
	}
	
	private int m_ID;

}
