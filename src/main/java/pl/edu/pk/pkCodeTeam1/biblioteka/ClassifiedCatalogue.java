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
		if (m_category_hierarchy == null)
			return;
		
		Browsable temp = m_category_hierarchy.search(category);
		
		if (temp.is_book())
			return;	//moznaby tez rzucac wyjatek ?
		
		((Category)temp).add_book(ID);
	}
	
	public void add_category(String category, String name){
		if (m_category_hierarchy == null){
			m_category_hierarchy = new Category(name);
			return;
		}
		
		Browsable temp = m_category_hierarchy.search(category);
		
		if (temp.is_book())
			return;
		
		((Category)temp).add_subcategory(name);
		
	}
	
	public void print(String category){
		if (find(category).is_book())
			System.out.println(((BookWrapper)find(category)).getTitle());
		else
			System.out.println(((Category)find(category)).contents_string());
	}
	
	public Browsable find(String category){
		return m_category_hierarchy.search(category);
	}
	
	private Category m_category_hierarchy;

}
