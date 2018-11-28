import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;

public class LoadFXML extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception { 
        URL fxmlURL = LoadFXML.class.getResource("design.fxml");    //creates variable for calling on design.fxml
        FXMLLoader loader = new FXMLLoader();   //creates fxml loader
        loader.setLocation(fxmlURL);            //loads fxml url
        primaryStage.setTitle("Test Frame 1");
        
        VBox vbox = loader.<VBox>load();

        Scene scene = new Scene(vbox, 200 ,100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}