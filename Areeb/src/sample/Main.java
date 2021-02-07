package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.text.CharacterIterator;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        primaryStage.setTitle("Welcome to Brunch and Munch");
        primaryStage.setScene(new Scene(root, 1080, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }


}