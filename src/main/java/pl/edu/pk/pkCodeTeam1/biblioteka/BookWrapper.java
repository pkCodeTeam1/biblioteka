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

	public String getTitle() {
		return BookFactory.getBook(m_ID).getTitle();
	}
	
	public String getAuthor() {
		return BookFactory.getBook(m_ID).getAuthor();
	}
	
	private int m_ID;

}
