//Mathew Harrison Project 3

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TipCaclulator extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		
		// Reference FXML
	      Parent root = 
	         FXMLLoader.load(getClass().getResource("TipCalculator.fxml"));

	      // Set graph to scene, display Tip Calculator in title bar, Set scene to stage + Display
	      Scene scene = new Scene(root); 
	      scene.setTitle("Tip Calculator"); 
	      scene.setScene(scene); 
	      scene.show(); 
	}
	
	// Tip Calculator Object 
	   public static void main(String[] args) 
	   {
	      // create a TipCalculator object and call its start method
	      launch(args); 
	   }
}

