package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import Role.Student;
import Role.Scholarship;

public class StudentController {
	

	@FXML
	private Text Name;
	
	@FXML
	private Text email;
	
	@FXML 
	private Text gpa;
	
	@FXML
	private Text faculty;
	
	@FXML
	private Text department;
	
	@FXML
	private Text year;
	
	@FXML 
	private TableView<Scholarship> Stable;
	
	@FXML
	private TableColumn<Scholarship, String> sname;
	
	@FXML
	private TableColumn<Scholarship, Double> sgpa;
	
	@FXML
	private TableColumn<Scholarship, Integer> sno;
	
	@FXML 
	private TableColumn<Scholarship, Integer> samount;
	
	@FXML
	private TableColumn<Scholarship, Integer> sapplied;
	
	 
	public void setStudentInfo(Student student) {	
		Name.setText(student.getFaculty());
		email.setText(student.getUsername());
		faculty.setText(student.getFaculty());
		department.setText(student.getDepartment());
		year.setText(Integer.toString(student.getYear()));
		gpa.setText(Double.toString(student.getGpa()));		
	}
	

	public void displayScolarship(List<Scholarship> scholarship) {
		ObservableList<Scholarship> data = FXCollections.observableArrayList();
//		for (Scholarship sch: scholarship) {
//			//System.out.println(sch.getName()+ sch.getGpa()+sch.getNumberAvailable()+sch.getAmount()+sch.getNumberApplied());
//			data.add(new Scholarship(sch.getName(),sch.getGpa(),sch.getNumberAvailable(),sch.getAmount(),sch.getNumberApplied()));
//			System.out.println(data.toString());
//		}
		
		sname.setCellValueFactory(new PropertyValueFactory<Scholarship, String>("Scholarship name"));
		sgpa.setCellValueFactory(new PropertyValueFactory<Scholarship, Double>("GPA requirement"));
		sno.setCellValueFactory(new PropertyValueFactory<Scholarship, Integer>("No. Available"));
		samount.setCellValueFactory(new PropertyValueFactory<Scholarship, Integer>("Amount ($)"));
		sapplied.setCellValueFactory(new PropertyValueFactory<Scholarship, Integer>("No. Applied"));
		
		
		for (Scholarship sch: scholarship) {
			//System.out.println(sch.getName()+ sch.getGpa()+sch.getNumberAvailable()+sch.getAmount()+sch.getNumberApplied());
			data.add(new Scholarship(sch.getName(),sch.getGpa(),sch.getNumberAvailable(),sch.getAmount(),sch.getNumberApplied()));
			System.out.println(data.toString());
//			Stable.setItems(data);
//			.add(new Scholarship(sch.getName(),sch.getGpa(),sch.getNumberAvailable(),sch.getAmount(),sch.getNumberApplied()));
		}
		Stable.setItems(data);
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
	
//	@Override
//	public void initialize(URL url, ResourceBundle rb) {
//		sname.setCellValueFactory(new PropertyValueFactory<Scholarship, String>("Scholarship name"));
//		sgpa.setCellValueFactory(new PropertyValueFactory<Scholarship, Double>("GPA requirement"));
//		sno.setCellValueFactory(new PropertyValueFactory<Scholarship, Integer>("No. Available"));
//		samount.setCellValueFactory(new PropertyValueFactory<Scholarship, Integer>("Amount ($)"));
//		sapplied.setCellValueFactory(new PropertyValueFactory<Scholarship, Integer>("No. Applied"));
//		
//		Stable.setItems(getData());
//	}
//	

	
}
