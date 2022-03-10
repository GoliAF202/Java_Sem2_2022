package models;

public class Grade {
	//1. mainigie
	private int id;
	private int value;
	private Student student;
	private Course course;

	private static int idCounter = 100000;

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
	
	// 2.2. set funkcija
	public void setId() {
		this.id = idCounter++;
	}
	public void setValue(int value) {
		if (value > 0 && value <= 10) {
			this.value = value;
		}
		else {
			this.value = 0;
		}
	}	
	public void setStudent(Student student) {
		if (student != null) {
			this.student = student;
		}
		else {
			this.student = new Student();
		}
	}
	public void setCourse(Course course) {
		if (course != null) {
			this.course = course;
		}
		else {
			this.course = new Course();
		}
	}
	
	//3. konstruktori
	public Grade() {
		setId();
		setValue(0);
		setStudent(new Student());
		setCourse(new Course());
	}
	public Grade(int value, Student student, Course course) {
		setId();
		setValue(value);
		setStudent(student);
		setCourse(course);
	}
	
	// 4. toString funkcija
	@Override
	public String toString() {
		return "Grade [id=" + id + ", value=" + value + ", student=" + student.getSurname() + ", course=" + course.getTitle() + "]";
	}
	
}
