/**
 * 
 */
package pl.edu.pk.pkCodeTeam1.biblioteka;

/**
 * @author MikeNovember
 * 
 *
 */
public class ClassifiedCatalogue {
	
	public Browsable find(String category){
		return m_category_hierarchy.search(category);
	}
	
	private Browsable m_category_hierarchy;

}
