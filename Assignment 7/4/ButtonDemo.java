import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;

public class ButtonDemo extends Application{



    @Override
    public void start(Stage primaryStage) throws Exception { 
        URL fxmlURL = ButtonDemo.class.getResource("Main.fxml");    //creates variable for calling on design.fxml
        FXMLLoader loader = new FXMLLoader();   //creates fxml loader
        loader.setLocation(fxmlURL);            //loads fxml url
        primaryStage.setTitle("Test Frame 1");
        
        VBox vbox = loader.load();

        Scene scene = new Scene(vbox, 500 ,400); //set to 500px by 400 px
        primaryStage.setScene(scene);   //
        primaryStage.show();    //makes visable
    }
    public static void main(String[] args) {
        launch(args);
    }
}