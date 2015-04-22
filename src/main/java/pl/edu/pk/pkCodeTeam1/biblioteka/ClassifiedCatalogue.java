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
	
	public void add_book(String category, int ID){
		Browsable temp = m_category_hierarchy.search(category);
		
		if (temp.is_book())
			return;	//moznaby tez rzucac wyjatek ?
		
		((Category)temp).add_book(ID);
	}
	
	public void print(String category){
		if (find(category).is_book())
			System.out.println(((BookWrapper)find(category)).title());
		else
			System.out.println(((Category)find(category)).contents_string());
	}
	
	public Browsable find(String category){
		return m_category_hierarchy.search(category);
	}
	
	private Category m_category_hierarchy;

}
