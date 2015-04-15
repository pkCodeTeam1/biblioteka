package pl.edu.pk.pkCodeTeam1.biblioteka;

public class ReaderCard {
	private String number;
	private String name; 
	private String surname;
	private CardType state;
	
	ReaderCard(String number, String name, String surname) {
		this.number = number;
		this.name = name;
		this.surname = surname;
		this.state = new StandardCard();
	}
	
	public void show_fee(){
		state.annual_fee();
	}
	
	public void show_penalty(){
		state.penalty();
	}
	
	public void type_standard(){
		this.state = new StandardCard();
	}
	
	public void type_junior(){
		this.state = new JuniorCard();
	}
	
	public void type_senior(){
		this.state = new SeniorCard();
	}

	public String toString(){
		return name + " " + surname + "\tid " +  number + "\ttyp karty " + state; 
	}
}
