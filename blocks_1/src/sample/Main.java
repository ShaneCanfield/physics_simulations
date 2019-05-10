package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
import java.util.Date;

class Main {
     public static void main(String[]args){
         Block blockA = new Block(5, 5, 10);
         boolean quit = false;
         Date time = new Date();
         double lastTimeStamp = time.getTime();
         while (!quit){
             double elapsedTime = time.getTime() - lastTimeStamp;
             lastTimeStamp = time.getTime();
             blockA.update(elapsedTime);

             System.out.println(lastTimeStamp);

             if (blockA.getLocation() > 100){
                 quit = true;
             }
         }
    }
}
*/
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
