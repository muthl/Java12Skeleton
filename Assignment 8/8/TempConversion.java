import javafx.beans.value.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.net.URL;

public class TempConversion extends Application{
    @FXML
    private TextField firstField;

    @FXML
    private TextField secondField;

    @FXML
    public void initialize() {
        secondField.setEditable(false); //sets ability to write in textfield to false
        
        firstField.textProperty().addListener(new ChangeListener<String>() { //checks when observable vlaue changes
            @Override
             public void changed(ObservableValue<? extends String> observable,  //observablevalue is value in the field

                String oldValue, String newValue) {
                
                
                try {
                    double celsius = Double.valueOf(newValue);   
                    double freedom_units =  (celsius * (9d/5d)) + 32d;
                    secondField.setText(String.valueOf(freedom_units));  //sets secondfield to value c valueOf converts the double to a string
                } catch (Exception e) {
                    secondField.setText("Invalid Input");
                }
                
            }
        });
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = TempConversion.class.getResource("Main.fxml");

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