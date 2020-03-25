

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;


import java.net.URL;

public class StudentPage extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			TabPane root = (TabPane)FXMLLoader.load(getClass().getResource("StudentPage.fxml"));					
			Scene scene = new Scene(root, 600, 400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
