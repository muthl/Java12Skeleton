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


public class BackgroundChange extends Application{
    @FXML   //lets java know to look for "root" variable
    private FlowPane root;
    
    
 
    

    public void handleButtonAction(ActionEvent event)   {   //calls on FXML button with identifier handleButtonAction
        root.setStyle("-fx-background-color:#38ee00;"); //changes background colour
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception { 
        URL fxmlURL = BackgroundChange.class.getResource("Main.fxml");    //creates variable for calling on design.fxml
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