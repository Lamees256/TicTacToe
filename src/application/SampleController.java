package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SampleController {
	@FXML
	Button easy, hard, multiplayer;
	
	
	@FXML
	private void easyMode() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("EasyMode.fxml"));
		Parent root = loader.load();
		EasyModeController easyModeController = loader.getController();
		Stage stage = new Stage();
		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Easy Mode");
		stage.show();
	}
	
	@FXML
	private void multiplayer() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Multiplayer.fxml"));
		Parent root = loader.load();
		MultiplayerController multiplayerController = loader.getController();
		Stage stage = new Stage();
		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Multiplayer");
		stage.show();
	}
}
