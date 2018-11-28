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
public class MyCalc extends Application{
    @FXML
    private TextField firstField;  //Weight Kilos

    @FXML
    private TextField secondField;  //height meters

    @FXML
    private TextField outputField;

    @FXML
    public void initialize() {
        outputField.setEditable(false);
    }

    
public void Calculate(ActionEvent eventc)   {
    String firstInput = firstField.getText(); 
    String secondInput = secondField.getText();  
    try {
        double firstValue = Double.valueOf(firstInput);    //converts string to a double
        double secondValue = Double.valueOf(secondInput);
        double output = (Math.sqrt((firstValue*firstValue) + (secondValue*secondValue))); //math for hypotenuse
        outputField.setText(String.valueOf(output)); //sets outputfield to value of variable output
    } catch (Exception e) {
         outputField.setText("Invalid Input");   //if there is an invalid input, such as letters
    }
}


public void handleclear(ActionEvent eventclear) {   //clear both fields
    firstField.setText(null);   //sets field value to null
    secondField.setText(null);  //sets field value to null
    outputField.setText(null);  //sets field value to null
}


    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = MyCalc.class.getResource("Main.fxml");

        primaryStage.setTitle("Hypotenuse Calculator");
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