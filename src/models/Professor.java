package models;

public class Professor {
	//1. mainigie
	private String name;
	private String surname;
	private ProfDegree degree;
	
	// 2.1. get funkcijas	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public ProfDegree getDegree() {
		return degree;
	}

	// 2.2. set funkcijas
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
	public void setDegree(ProfDegree degree) {
		if (degree != null) {
			this.degree = degree;
		}
		else {
			this.degree = ProfDegree.master;
		}
	}		
	
	// 3. konstruktori
	public Professor () {
		setName("Test");
		setSurname("Professor");
		setDegree(ProfDegree.doctor);
	}
	public Professor (String name, String surname, ProfDegree degree){
		setName(name);
		setSurname(surname);
		setDegree(degree);
	}
	
	// 4. toString funkcijas
	public String toString() {
		return name + " " + surname + " " + degree;
	}
	
}
