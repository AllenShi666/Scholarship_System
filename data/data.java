package data;

import java.util.List;
import Role.Student;
import Role.Professor;

public class data {
	LoadToSys data = new LoadToSys();
	private final List<Student> studentList = data.LoadStudent("student.csv");
	private final List<Professor> professorList = data.LoadProfessor("professor.csv");
	public LoadToSys getData() {
		return data;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public List<Professor> getProfessorList() {
		return professorList;
	}
	
	
}
