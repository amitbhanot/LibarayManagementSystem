package application;
	
import javafx.application.Application;
<<<<<<< HEAD
=======
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
>>>>>>> 8deaad9062ac2966fa3e97b6b2eae265b20d2b8e
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
<<<<<<< HEAD
			Parent root = FXMLLoader.load(getClass().getResource("LibraryManagement.fxml"));
			Scene scene = new Scene(root,600,600);
=======
			Parent root= FXMLLoader.load(getClass().getResource("LibraryManagement.fxml"));
			Scene scene = new Scene(root,600,400);
>>>>>>> 8deaad9062ac2966fa3e97b6b2eae265b20d2b8e
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setResizable(false);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@FXML
	public void addMember(ActionEvent event){
		String fname1, lname, street, city, state, zip, phone;
		
		
		
		
	}
	
}
