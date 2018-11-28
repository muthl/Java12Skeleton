import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import java.net.URL;

public class ExtendedButton extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception { 
        URL fxmlURL = ExtendedButton.class.getResource("Main.fxml");    //creats variable for calling on design.fxml
        FXMLLoader loader = new FXMLLoader();   //creates fxml loader
        loader.setLocation(fxmlURL);            //loads fxml url
        primaryStage.setTitle("Test Frame 1");
        
        FlowPane flowpane = loader.load();

        Scene scene = new Scene(flowpane, 500 ,400); //set to 500px by 400 px
        primaryStage.setScene(scene);   //
        primaryStage.show();    //makes visable
    }
}