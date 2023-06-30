package de.iav.studentwithscenes;

import de.iav.javafxdemo.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CursedApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // We get stage from parameter --> passt

        // We need a Scene, who accepts root node as a parameter of its constructor
         // Root node "Baseplate Lego"
        // The root node will be binded to the main scene
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/de/iav/javafxdemo/student_scene1.fxml"));
        Scene mainScene = new Scene(fxmlLoader.load(), 640, 550);

        // Now bind the main scene to the stage
        stage.setScene(mainScene);

        // Show the stage
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}