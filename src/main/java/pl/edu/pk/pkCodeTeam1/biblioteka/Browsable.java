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
	public void add(String subcategory);
	public void remove(String subcategory);

}
