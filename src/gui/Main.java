//-----------------------------------------------------------------------------------------------------------------------------------------	
	package gui;
//-----------------------------------------------------------------------------------------------------------------------------------------
	import javafx.application.Application;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.scene.image.Image;
	import javafx.stage.Stage;
//-----------------------------------------------------------------------------------------------------------------------------------------	
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordo�ez Ordo�ez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to create spaceships
	 */
	public class Main extends Application {
		
//----------------------------------------------------METHODS FOR THIS CLASS---------------------------------------------------------------
		@Override
		/**
		 * This method starts the application for this project by launching its found FXML file.
		 * @param stage the current stage presented for this program in the system
		 * @throws exception in the case that the fxml file with the gui can't be found.
		 */
		public void start(Stage stage) throws Exception{
			
			Parent root = FXMLLoader.load(getClass().getResource("minecraftblocksmanagement.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setResizable(true);			
			Image icon = new Image("gui/imgs/icon.png");
			stage.getIcons().addAll(icon);
			stage.setTitle("MineCraft!!");
			stage.centerOnScreen();
			stage.show();
			
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method allows the launching of the start method by linking all modeling classes with its respective gui
		 * @param args
		 */
		public static void main (String args[]) {
			launch(args);
		}
		
//-----------------------------------------------------------------------------------------------------------------------------------------	
}
