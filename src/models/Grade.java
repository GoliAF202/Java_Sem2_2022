package models;

public class Grade {
	//1. mainigie
	private int id;
	private int value;
	private Student student;
	private Course course;

	private static int idCounter = 20000;

	//2.1 get funkcijas
	public int getId() {
		return id;
	}

	public int getValue() {
		return value;
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}
	
	
	
	

}
