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
public class TempConversion extends Application{
    @FXML
    private TextField firstField;

    @FXML
    private TextField secondField;




public void handlectof(ActionEvent eventc)   { //Celsius to Fahrenheit conversion
    String newValue = firstField.getText();
    try {
        double celsius = Double.valueOf(newValue);    //converts string to a double
        double fahrenheit =  (celsius * (9d/5d)) + 32d;
        secondField.setText(String.valueOf(fahrenheit)); //sets secondfield to value of variable fahrenheit
    } catch (Exception e) {
         secondField.setText("Invalid Input");   //if there is an invalid input, such as letters
    }
}


public void handleftoc(ActionEvent eventf)   {  //Fahrenheit to celsius Conversion
    String newValueTwo = secondField.getText();
    try {
            
        double fahrenheit = Double.valueOf(newValueTwo);
        double celsius = (fahrenheit - 32) * (5d/9d);  //conversion of fahrenheit to celsius
        firstField.setText(String.valueOf(celsius));
    } catch (Exception e) {
         firstField.setText("Invalid Input");   //if there is an invalid input, such as letters
    }
}


public void handleclear(ActionEvent eventclear) {   //clear both fields
    firstField.setText(null);   //sets field value to null
    secondField.setText(null);  //sets field value to null
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