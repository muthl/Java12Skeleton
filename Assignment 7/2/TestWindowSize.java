import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TestWindowSize extends Application {  

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Test Frame 2");  //title of window
        
        
        int x=200;
        int y=100;
        
        for (int i = 0; i < 200; i++) { //loop for 200 times
            Label label = new Label(""); 
                Scene scene = new Scene(label, x, y);
                primaryStage.setScene(scene);
                primaryStage.show();    //displays window


            x++; //add to x value
            y++; //add to y value   
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}