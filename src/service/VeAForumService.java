package service;

import models.ProfDegree;
import models.Professor;
import models.Student;

import java.awt.GraphicsDevice;
import java.util.ArrayList;

import models.Course;
import models.Grade;
import models.Person;

public class VeAForumService {

	//private static ArrayList<Professor> allProfessors = new ArrayList<>();
	//private static ArrayList<Student> allStudents = new ArrayList<>();
	private static ArrayList<Person> allPersons = new ArrayList<>();
	private static ArrayList<Course> allCourses = new ArrayList<>();
	private static ArrayList<Grade> allGrades = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Professor prof1 = new Professor("Karian", "Šķirmante", ProfDegree.master);
		Professor prof2 = new Professor("Estere", "Vītola", ProfDegree.master);
		Professor prof3 = new Professor("Vairis", "Caune", ProfDegree.doctor);
		allPersons.add(prof1);
		allPersons.add(prof2);
		allPersons.add(prof3);
		/*for(Professor temp : allProfessors) {
			System.out.println(temp);
		}*/
		/*
		System.out.println(prof1);
		System.out.println(prof2);
		System.out.println(prof3);*/
		
		Course c1 = new Course("Programmešana tīmeklī JAVA", (byte)4, prof1);
		Course c2 = new Course("Objektorientēta programmešana", (byte)4, prof2);
		Course c3 = new Course("Matemātika", (byte)6, prof3);
		allCourses.add(c1);
		allCourses.add(c2);
		allCourses.add(c3);
		for(Course temp : allCourses) {
			System.out.println(temp);
		}
		/*System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);*/
		
		Student stud1 = new Student("Jānis", "Bērziņš");
		Student stud2 = new Student("Līga", "Jauka");
		Student stud3 = new Student("Baiba", "Nejauka");
		allPersons.add(stud1);
		allPersons.add(stud2);
		allPersons.add(stud3);
		/*for(Student temp : allStudents) {
			System.out.println(temp);
		}*/
		/*System.out.println(stud1);
		System.out.println(stud2);
		System.out.println(stud3);*/
		
		Grade g1 = new Grade(10, stud1, c1);
		Grade g2 = new Grade(3, stud1, c2);
		Grade g3 = new Grade(5, stud1, c3);
		Grade g4 = new Grade(7, stud2, c1);
		Grade g5 = new Grade(2, stud2, c3);
		Grade g6 = new Grade(9, stud3, c2);
		Grade g7 = new Grade(10, stud3, c3);
		allGrades.add(g1);
		allGrades.add(g2);
		allGrades.add(g3);
		allGrades.add(g4);
		allGrades.add(g5);
		allGrades.add(g6);
		allGrades.add(g7);
		for(Grade temp : allGrades) {
			System.out.println(temp);
		}
		/*System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(g4);
		System.out.println(g5);
		System.out.println(g6);
		System.out.println(g7);*/
		
		allPersons.add(new Person("Peteris", "Kalns"));
		
		for(Person temp : allPersons) {
			System.out.println(temp.toString());
		}
		System.out.println("-------------------------");
		
		for(Person temp : allPersons) {
			// tikai professori
			if(temp instanceof Professor) {
				Professor prof = (Professor)temp;
				System.out.println(prof.getDegree());
			}

		}
		
		/*System.out.println("Jāņa vid. atz." + calculateAVGGrade(10000));
		System.out.println("Līga vid. atz." + calculateAVGGrade(10001));*/
		for (Person temp : allPersons) {
			if(temp instanceof Student) {
				Student stud = (Student)temp;
				System.out.println(stud.getName() + " vid. atz." + calculateAVGGrade(stud.getId()));
			}
		}
		
		for (Course temp : allCourses) {
			System.out.println(temp.getTitle() + " vid. atz." + calculateAVGGradeInCourse(temp.getId()));
		}
		
	}
	// https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html
	private static float calculateAVGGrade(int studentId) {
		float sum = 0;
		int gradeCounter = 0;
		for (Grade gr : allGrades) {
			if(gr.getStudent().getId() == studentId) {
				sum += gr.getValue();
				gradeCounter++;
			}
		}
		return sum/gradeCounter;
	}
	
	//noskaidrot vidējo atzīmi konkrēta kursā
	public static float calculateAVGGradeInCourse(int courseId) {
		float sum = 0;
		int gradeCounter = 0;
		for (Grade gr : allGrades) {
			if(gr.getCourse().getId() == courseId) {
				sum += gr.getValue();
				gradeCounter++;
			}
		}
		return sum/gradeCounter;
	}
	
	//CRUD Course
	//C - Create
	private static boolean createNewCourse(String title, byte creditPoints, Professor professor) {
		Course course = new Course(title, creditPoints, professor);
		if(allCourses.contains(course)) {
			return false;
		}
		else {
			allCourses.add(course);
			return true;
		}
	}
	//R - Read -all
	private static ArrayList<Course> getAllCourses() {
		return allCourses;
	}
	//R - read by ID
	private static Course getCourseById(int courseId) {
		if(courseId >= 1000 && courseId < 10000){
			for (Course course : allCourses) {
				if(course.getId() == courseId) {
					return course;
				}
			}
		}
		return new Course();
	}
	//U - update
	private static boolean updateCourseById(int courseId, String updateTitle, byte updateCP, Professor updateProfessor) {
		if(courseId >= 1000 && courseId < 10000){
			for (Course course : allCourses) {
				if(course.getId() == courseId) {
					course.setTitle(updateTitle);
					course.setCreditPoints(updateCP);
					course.setProfessor(updateProfessor);
					return true;
				}
			}
		}
		return false;
	}
	

}
