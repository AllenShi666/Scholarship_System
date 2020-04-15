package Controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CoordinatorController {
	
	@FXML
	public void logout(ActionEvent event) throws IOException {
		System.out.println("logged out");
		SplitPane root = (SplitPane)FXMLLoader.load(getClass().getResource("LoginPage.fxml"));	
		Scene scene = new Scene(root, 600, 400);
		Stage secondaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		secondaryStage.setScene(scene);
		secondaryStage.show();
		
	}
	
//	@FXML
//	public void update(ActionEvent event) {
//		System.out.println("password updating" + textbox.getText());
//		updateButton.setText("updated");
//		
//	}
}
