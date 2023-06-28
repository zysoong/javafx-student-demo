package de.iav.javafxwithfxml;

import de.iav.javafxdemo.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplicationWithFXML extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // We get stage from parameter --> passt

        // We need a Scene, who accepts root node as a parameter of its constructor
         // Root node "Baseplate Lego"
        // The root node will be binded to the main scene
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/de/iav/javafxdemo/studentDB.fxml"));
        Scene mainScene = new Scene(fxmlLoader.load(), 450, 450);

        // Now bind the main scene to the stage
        stage.setScene(mainScene);

        // Show the stage
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}