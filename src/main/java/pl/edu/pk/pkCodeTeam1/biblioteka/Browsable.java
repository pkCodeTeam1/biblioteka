/**
 * 
 */
package pl.edu.pk.pkCodeTeam1.biblioteka;

/**
 * @author MikeNovember
 *
 */
public interface Browsable {
	
	public Browsable search(String category);
	public String to_string();
	public String contents_string();
	public boolean is_book();

}
