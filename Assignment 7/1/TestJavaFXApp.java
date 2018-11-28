import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TestJavaFXApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Test Frame 1");  //sets the title to test frame 1

        Label label = new Label("");    //
        Scene scene = new Scene(label, 200, 100);   //the size of the window is 200px by 100 px
        primaryStage.setScene(scene);

        primaryStage.show();    //makes window visable
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}