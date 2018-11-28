import javafx.beans.value.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import java.net.URL;
import javafx.scene.control.Button;

//percent = ((fatGrams * 9 calories) / calories) *100.0;
public class PercentFat extends Application{
    @FXML
    private TextField firstField;

    @FXML
    private TextField secondField;

    @FXML
    private TextField thirdField;
                
public void handlecalculate(ActionEvent event)   {
    String newValue = firstField.getText();
    String newValueTwo = secondField.getText();
    try {
        double fatGrams = Double.valueOf(newValue);    //converts string to a double
        double calories = Double.valueOf(newValueTwo);
        double percent = ((fatGrams * 9) / calories) * 100d;    //doing some calculations
        thirdField.setText(String.valueOf(percent) + "%");  
    } catch (Exception e) {
         thirdField.setText("Invalid Input");   //if there is an invalid input, such as letters
    }
}
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = PercentFat.class.getResource("Main.fxml");

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