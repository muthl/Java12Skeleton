import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.net.URL;

public class TestTextField extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = TestTextField.class.getResource("Main.fxml");

        primaryStage.setTitle("Text Test Field");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(fxmlURL);    //loads fxml url
        FlowPane flowPane = loader.load(); //uses flowPane, causes bodies inside window to change orientation with resizing of window

        Scene scene = new Scene(flowPane);  
        primaryStage.setScene(scene);
        primaryStage.show();    //shows window
    }
    public static void main(String[] args){
        launch(args);
    }

}