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
	
	public String to_string(){
		return m_name;
	}
	
	public String contents_string(){
		StringBuilder temp = new StringBuilder();
				
		for(int i = 0 ; i < m_subcategories.size() ; ++i){
			temp.append(i);
			temp.append(". ");
			temp.append(m_subcategories.get(i).to_string());
			temp.append("\n");
		}
		
		return temp.toString();
	}
	
	public Category(String name){
		m_name = name;
		
		m_subcategories = new ArrayList<Browsable>();
	}
	
	public Browsable search(String category){
		String[] split_string = category.split(".");
		String subcategory_name = split_string[0];
		Integer subcategory_number = Integer.parseInt(subcategory_name);
		String subcategory_string = category.replaceFirst(subcategory_name + ".", ""); //chyba...

		return m_subcategories.get(subcategory_number).search(subcategory_string);
	}
	
	public void add_subcategory(String subcategory){
		Category temp = new Category(subcategory);
		
		m_subcategories.add(temp);
	}
	
	public void add_book(int ID){
		//go to bookshelf and get reference of book with id == ID
		//m_subcategories.add() the book reference

		System.out.println("Adding book");
		
	}
	
	public void remove(String subcategory){
		m_subcategories.remove(subcategory);		
	}
	
	private List<Browsable> m_subcategories;
	private String m_name;

}
