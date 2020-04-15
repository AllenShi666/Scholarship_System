package Controller;

import java.io.IOException;

import Role.Professor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ProfessorController {
	
	@FXML
	private Text ucid;
	
	@FXML
	private Text email;
	
	@FXML
	private Text name;
	
	@FXML
	private Text faculty;
	
	@FXML
	private Text department;
	
	@FXML
	private Button logout;
	
	
	public void addScholarship() {
		System.out.println("Scholarship added");
	}

	public void setProfessorInfo(Professor professor) {	
		ucid.setText(Integer.toString(professor.getUcid()));
		email.setText(professor.getUsername());
		name.setText(professor.getName());
		faculty.setText(professor.getFaculty());
		department.setText(professor.getDepartment());	
	}
	
	@FXML
	public void logout(ActionEvent event) throws IOException {
		System.out.println("logged out");
		SplitPane root = (SplitPane)FXMLLoader.load(getClass().getResource("LoginPage.fxml"));	
		Scene scene = new Scene(root, 600, 400);
		Stage secondaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		secondaryStage.setScene(scene);
		secondaryStage.show();
		
	}
	
	public void nominateStudent() {
		
	}
	
	public void displayScholarship() {
		
	}
	
	
	public void displayStatistics() {
		
	}
}
