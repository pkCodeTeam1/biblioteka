/**
 * 
 */
package pl.edu.pk.pkCodeTeam1.biblioteka;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MikeNovember
 *
 */
public class Category implements Browsable{
	
	public boolean is_book(){
		return false;
	}
	
	public String contents_string(){
		StringBuilder temp = new StringBuilder();
		
		temp.append(m_name + "\n");
		
		for(int i = 0 ; i < m_subcategories.size() ; ++i){
			temp.append(i);
			temp.append(". ");
			
			if (m_subcategories.get(i).is_book())
				temp.append("<Ksiazka> " + ((BookWrapper)m_subcategories.get(i)).getTitle());
			else
				temp.append(((Category)m_subcategories.get(i)).get_name());
			
			temp.append("\n");
		}
		
		return temp.toString();
	}
	
	String get_name(){
		return m_name;
	}
	
	public Category(String name){
		m_name = name;
		
		m_subcategories = new ArrayList<Browsable>();
	}
	
	public Browsable search(String category){
		
		if (category == "")
			return this;
		
		String[] split_string = category.split("\\.");
		String subcategory_name = split_string[0];
		Integer subcategory_number = Integer.parseInt(subcategory_name);
		String subcategory_string = category.replaceFirst(subcategory_name + "\\.", "");

		if (split_string.length > 1)
			return m_subcategories.get(subcategory_number).search(subcategory_string);
		else
			return m_subcategories.get(subcategory_number);
	}
	
	public void add_subcategory(String name){
		Category temp = new Category(name);
		
		m_subcategories.add(temp);
	}
	
	public void add_book(int ID){
		
		BookWrapper newBook = new BookWrapper();
		newBook.set_ID(ID);
		
		m_subcategories.add(newBook);
		
	}
	
	public void remove(int subcategory_number){
		m_subcategories.remove(subcategory_number);		
	}
	
	private List<Browsable> m_subcategories;
	private String m_name;

}
