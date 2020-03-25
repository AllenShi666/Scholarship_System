package LoginPage;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.net.URL;

public class LoginPage extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(new URL("file:///C:/Users/PLDNg/eclipse-workspace/ScholarshipAppFXML/src/LoginPage.FXML"));
		AnchorPane ap = loader.<AnchorPane>load();
		
		Scene scene = new Scene(ap);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
