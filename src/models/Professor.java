package models;

public class Professor extends Person{
	//1. mainigie
	private int id;
	private ProfDegree degree;
	
	private static int idCounter = 0;
	
	// 2.1. get funkcijas	
	public ProfDegree getDegree() {
		return degree;
	}
	public int getId() {
		return id;
	}
	
	// 2.2. set funkcijas
	public void setDegree(ProfDegree degree) {
		if (degree != null) {
			this.degree = degree;
		}
		else {
			this.degree = ProfDegree.master;
		}
	}		
	public void setId() {
		this.id = idCounter++;
	}
	
	// 3. konstruktori
	public Professor () {
		super();		//Person() klases bezargumentas konstruktors
		setId();
		setDegree(ProfDegree.doctor);
	}
	public Professor (String name, String surname, ProfDegree degree){
		super(name, surname);
		setId();
		setDegree(degree);
	}
	
	// 4. toString funkcijas
	@Override
	public String toString() {
		return id + " " + super.toString() + " " + degree;
	}
}
