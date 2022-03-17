package service;

import models.ProfDegree;
import models.Professor;
import models.Student;
import models.Course;
import models.Grade;

public class VeAForumService {

	
	
	public static void main(String[] args) {
		
		Professor prof1 = new Professor("Karian", "Šķirmante", ProfDegree.master);
		Professor prof2 = new Professor("Estere", "Vītola", ProfDegree.master);
		Professor prof3 = new Professor("Vairis", "Caune", ProfDegree.doctor);
		System.out.println(prof1);
		System.out.println(prof2);
		System.out.println(prof3);
		
		Course c1 = new Course("Programmešana tīmeklī JAVA", (byte)4, prof1);
		Course c2 = new Course("Objektorientēta programmešana", (byte)4, prof2);
		Course c3 = new Course("Matemātika", (byte)6, prof3);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		Student stud1 = new Student("Jānis", "Bērziņš");
		Student stud2 = new Student("Līga", "Jauka");
		Student stud3 = new Student("Baiba", "Nejauka");
		System.out.println(stud1);
		System.out.println(stud2);
		System.out.println(stud3);
		
		Grade g1 = new Grade(10, stud1, c1);
		Grade g2 = new Grade(3, stud1, c2);
		Grade g3 = new Grade(5, stud1, c3);
		Grade g4 = new Grade(7, stud2, c1);
		Grade g5 = new Grade(2, stud2, c3);
		Grade g6 = new Grade(9, stud3, c2);
		Grade g7 = new Grade(10, stud3, c3);
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(g4);
		System.out.println(g5);
		System.out.println(g6);
		System.out.println(g7);

	}

}
