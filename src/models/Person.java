package models;

public class Person {
	
	//1. mainigie
	private String name;
	private String surname;
	
	// 2.1. get funkcijas	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	
	//2.2. set funkcijas
	public void setName(String name) {
		if (name != null && name.matches("[A-ZĀĒŪĪĻĶĢŠŽČŅ]{1}[a-zēūīāšģķļņčž]+\s?([A-ZĀĒŪĪĻĶĢŠŽČŅ]{1}[a-zēūīāšģķļņčž]+)?")){				// https://regex101.com/
			this.name = name;
		}
		else {
			this.name = "notknown";
		}
	}	
	public void setSurname(String surname) {
		if (surname != null && surname.matches("[A-ZĀĒŪĪĻĶĢŠŽČŅ]{1}[a-zēūīāšģķļņčž]+\s?([A-ZĀĒŪĪĻĶĢŠŽČŅ]{1}[a-zēūīāšģķļņčž]+)?")){				// https://regex101.com/
			this.surname = surname;
		}
		else {
			this.surname = "notknown";
		}
	}
	
	// 3. konstruktori
	public Person() {
		setName("Test");
		setSurname("Person");
	}
	public Person(String name, String surname) {
		setName(name);
		setSurname(surname);
	}
	
	// 4. toString funkcijas
	public String toString() {
		return name + " " + surname;
	}
}
