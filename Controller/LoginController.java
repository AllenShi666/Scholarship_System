package Controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import data.Authenticator_demo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import Role.Professor;
import Role.Scholarship;
import Role.Student;
import data.LoadToSys;
import Controller.StudentController;
import Controller.ProfessorController;

public class LoginController {
	
	private StudentPage studentScreen;
	private ProfessorPage professorScreen;
	
	@FXML
	private TextField usernameBox;
	
	@FXML
	private TextField passwordBox;
	
	@FXML
	private MenuItem studentMenuItem;
	
	@FXML 
	private MenuItem professorMenuItem;
	
	@FXML
	private MenuItem coordinatorMenuItem;
	
	public StudentPage getStudentScreen() {
		return studentScreen;
	}
	
	public ProfessorPage getProfessorScreen() {
		return professorScreen;
	}
	
	@FXML
	private SplitMenuButton dropDown;
	
	@FXML
	public String getUsernameBox() {
		return usernameBox.getText();
	}

	@FXML
	public String getPasswordBox() {
		return passwordBox.getText();
	}
	
	@FXML
	public void studentText() {
		dropDown.setText("Student");
	}
	
	@FXML
	public void professorText() {
		dropDown.setText("Professor");
		
	}
	
	@FXML
	public void coordinatorText() {
		dropDown.setText("Coordinator");
		
	}
	
	@FXML
	public String getDropDownText() {
		return dropDown.getText();
	}
	
	@FXML
	public void login(ActionEvent event) throws IOException {
		Authenticator_demo authentication = new Authenticator_demo();
		authentication.Load();
		//String b = a.Authenticate(getUsernameBox(), getPasswordBox());
		System.out.println(authentication.Authenticate(getUsernameBox(), getPasswordBox()));
		String usernamebox = getUsernameBox();
		String passwordbox = getPasswordBox();
		
		if(authentication.Authenticate(getUsernameBox(), getPasswordBox()) == "Account matched!") {
			if(getDropDownText() == "Coordinator") {
				System.out.println("coordinator page loaded");
				
				FXMLLoader loader = new FXMLLoader(getClass().getResource("CoordinatorPage.fxml"));
				Parent root = loader.load();
				
				CoordinatorController cc = loader.getController();
				
				Scene scene = new Scene(root, 600, 400);
				Stage secondaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
				secondaryStage.setScene(scene);
				secondaryStage.show();
				
				//cc.setCoordinatorInfo(currentCoordinator);
				
			}else if(getDropDownText() == "Professor") {
				System.out.println("professor page loaded");
				Professor currentProfessor = findProfessor(usernamebox,passwordbox);
				
				FXMLLoader loader = new FXMLLoader(getClass().getResource("ProfessorPage.fxml"));
				Parent root = loader.load();
				
				ProfessorController pc = loader.getController();
				
				Scene scene = new Scene(root, 600, 400);
				Stage secondaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
				secondaryStage.setScene(scene);
				secondaryStage.show();
				
				pc.setProfessorInfo(currentProfessor);
				
			}else {
				System.out.println("student page loaded");
				Student currentStudent = findStudent(usernamebox, passwordbox);
				List<Scholarship> availableScholarship = findScholarship(usernamebox, passwordbox);
				//System.out.println(currentStudent.getGpa());
				
				FXMLLoader loader = new FXMLLoader(getClass().getResource("StudentPage.fxml"));
				Parent root = loader.load();
				
				StudentController sc = loader.getController();

				Scene scene = new Scene(root, 600, 400);
				Stage secondaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
				secondaryStage.setScene(scene);
				secondaryStage.show();
				
				sc.setStudentInfo(currentStudent);
				sc.displayScolarship(availableScholarship);		
				
			}
		}	
	}
	
	public Student findStudent(String username, String password) {
		LoadToSys data = new LoadToSys();
		List<Student> studentList = data.LoadStudent("student.csv");
		Student currentStudent = new Student(username, password);
		for (Student student: studentList) {
			if (student.getUsername().equals(username)){
				currentStudent = student;
				int index = studentList.indexOf(student);
				System.out.println("Student Found!" + index);
				break;
			}
		}
		return currentStudent;
	}

	public Professor findProfessor(String username, String password) {
		LoadToSys data = new LoadToSys();
		List<Professor> professorList = data.LoadProfessor("professor.csv");
		Professor currentProfessor = new Professor(username, password);
		for (Professor professor: professorList) {
			if (professor.getUsername().equals(username)){
				currentProfessor = professor;
				int index = professorList.indexOf(professor);
				System.out.println("Professor Found!" + index);
				break;
			}
		}
		return currentProfessor;
	}
	
	public List<Scholarship> findScholarship(String username, String password) {
		LoadToSys data = new LoadToSys();
		Student currentStudent = findStudent(username, password);
		List<Scholarship> allScholarship = data.LoadScholarship("scholarship.csv");
		List<Scholarship> availableScholarship = new ArrayList<>();
		for (Scholarship scholarship: allScholarship) {
			if(currentStudent.getFaculty().equals(scholarship.getFaculty())) {
				if(currentStudent.getDepartment().equals(scholarship.getDepartment())) {
					if(Integer.toString(currentStudent.getYear()).equals(Integer.toString(scholarship.getYear()))) {
						System.out.println("Scholarship Found!");
						availableScholarship.add(scholarship);
					}
				}
			}
		}
		
		return availableScholarship;
	}
	
}
