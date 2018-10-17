import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class BigFrame extends Application { 
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World!");
        Label helloWorldLabel = new Label("Hello World!");
        Scene scene = new Scene(helloWorldLabel, 400, 400); //sets window size to 400px by 400px
        
        primaryStage.setResizable(false);   //stops window from being resizable
        primaryStage.setScene(scene);   
        primaryStage.show();    //sets visability to true

    }
    public static void main(String[] args) {
        Application.launch(args);

    }
    
}
