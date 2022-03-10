package models;

public class Student {
	//1. mainigie
	private int id;
	private String name;
	private String surname;

	private static int idCounter = 10000;

	//2.1 get funkcijas
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	
	//2.2. set funkcijas
	public void setId() {
		this.id = idCounter++;
	}
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
	public Student () {
		setName("Test");
		setSurname("Student");
		setId();
	}
	public Student (String name, String surname){
		setName(name);
		setSurname(surname);
		setId();
	}
	
	// 4. toString funkcijas
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
	
}
