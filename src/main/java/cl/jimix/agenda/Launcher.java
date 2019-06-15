package cl.jimix.agenda;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Launcher extends Application {

	
	private Stage 		primaryStage;
	private BorderPane 	rootLayout; 

	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Agenda");
	
		initRootLayout();
		showPersonLayout();
	}
	
	/**
	 * Inicializa el root layout.
	 */
	public void initRootLayout() {
		
		try {
			//FXMLLoader loader = FXMLLoader.load(this.getClass().getClassLoader().getResource("RootLayout.fxml"));
			//this.rootLayout = (BorderPane) loader.load();
			Parent root = FXMLLoader.load(this.getClass().getClassLoader().getResource("RootLayout.fxml"));
			Scene mainScene = new Scene(root);
			this.rootLayout = (BorderPane) mainScene.lookup("#rootBorderPane");
			
			// Muesta la Escena que contiene al rootLayout.
			this.primaryStage.setScene(mainScene);
			this.primaryStage.show();
			
		}catch (IOException e) {
			System.err.println("Error initRootLayout: \n" + e.getMessage());
		}
	}
	
	/**
	 * Muestra el PersonOverview dentro del root layout. (ventana madre)
	 */
	public void showPersonLayout() {
		try {
			// Cargando el PersonOverview.
			Parent personOverview = FXMLLoader.load(this.getClass().getClassLoader().getResource("PersonOverview.fxml"));
			//Scene  personOverviewScene = new Scene(personOverview);
			//AnchorPane personOverviewLayout = (AnchorPane) personOverviewScene.lookup("#personOverviewAnchorPaneID");
			
			this.rootLayout.setCenter(personOverview);
			
		}catch (IOException e) {
			System.err.println("Error en showPersonOverview : " + e.getMessage());
		}
	}
	
	public Stage getPrimaryStage() {
		return this.primaryStage;
}
	
	
	
	public static void main(String[] args) {
		
		/**
		 * TODO: Cargar json con nombres apellidos etc.
		 */
		
		launch(args);
	}
}
