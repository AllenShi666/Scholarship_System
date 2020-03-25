

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

import java.net.URL;

public class ProfessorPage extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			TabPane root = (TabPane)FXMLLoader.load(getClass().getResource("ProfessorPage.fxml"));					
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
