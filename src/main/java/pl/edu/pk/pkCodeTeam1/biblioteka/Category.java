/**
 * 
 */
package pl.edu.pk.pkCodeTeam1.biblioteka;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MikeNovember
 *
 */
public class Category implements Browsable{
	
	public Category(String name){
		m_subcategories = new HashMap<String, Browsable>();
	}
	
	public Browsable search(String category){
		String[] split_string = category.split(" ");
		String subcategory_name = split_string[0];
		String subcategory_string = category.replaceFirst(subcategory_name + " ", ""); //chyba...

		return m_subcategories.get(subcategory_name).search(subcategory_string);
	}
	
	public void add(String subcategory){
		Category temp = new Category(subcategory);
		
		m_subcategories.put(subcategory, temp);
	}
	
	public void remove(String subcategory){
		m_subcategories.remove(subcategory);		
	}
	
	private Map<String, Browsable> m_subcategories;

}
