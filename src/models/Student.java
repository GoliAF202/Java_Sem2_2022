package models;

public class Student extends Person{
	//1. mainigie
	private int id;
	private static int idCounter = 10000;

	//2.1 get funkcijas
	public int getId() {
		return id;
	}
	
	//2.2. set funkcijas
	public void setId() {
		this.id = idCounter++;
	}

	// 3. konstruktori
	public Student () {
		super();
		setId();
	}
	public Student (String name, String surname){
		super(name, surname);
		setId();
	}
	
	// 4. toString funkcijas
	@Override
	public String toString() {
		return id + " " + super.toString();
	}
	
}
