import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class FourButtons extends Application{
    @FXML   //lets java know to look for "root" variable
    private FlowPane root;
    
    
 
    

    public void handleRed(ActionEvent event)   {   //calls on FXML button with identifier handleRed
        root.setStyle("-fx-background-color:rgb(255, 0, 0)"); //changes background colour to Red
        
    }
    public void handleBlue(ActionEvent event)   {   //calls on FXML button with identifier handleBlue
        root.setStyle("-fx-background-color:rgb(0, 0, 255);"); //changes background colour to Green
        
    }
    public void handlePrint(ActionEvent event)   {   //calls on FXML button with identifier handlePrint
        System.out.println("Consol Print");    //prints "Consol Print" to consol
        
    }
    public void handleExit(ActionEvent event)   {
        System.exit(0);     //exits program
    }

    @Override
    public void start(Stage primaryStage) throws Exception { 
        URL fxmlURL = FourButtons.class.getResource("Main.fxml");    //creates variable for calling on design.fxml
        FXMLLoader loader = new FXMLLoader();   //creates fxml loader
        loader.setLocation(fxmlURL);            //loads fxml url
        FlowPane flowpane = loader.load();
        primaryStage.setTitle("Test Frame");
        
        
        

        Scene scene = new Scene(flowpane, 500 ,400); //set to 500px by 400 px
        
        primaryStage.setScene(scene);   //
        primaryStage.show();    //makes visable
    }
      public static void main(String[] args) {
        launch(args);
    }
}