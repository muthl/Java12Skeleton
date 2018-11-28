import javafx.beans.value.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.net.URL;

public class Repeater extends Application{
    @FXML
    private TextField firstField;

    @FXML
    private TextField secondField;

    @FXML
    public void initialize() {
        firstField.textProperty().addListener(new ChangeListener<String>() { //checks when observable vlaue changes
            @Override
             public void changed(ObservableValue<? extends String> observable,  //observablevalue is value in the field
                String oldValue, String newValue) {
                
                secondField.setText(newValue);  //sets secondfield to value of first field
                
            }
        });
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = Repeater.class.getResource("Main.fxml");

        primaryStage.setTitle("Text Test Field");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(fxmlURL);
        FlowPane flowPane = loader.load();

        Scene scene = new Scene(flowPane);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    public static void main(String[] args){
        launch(args);
    }

}