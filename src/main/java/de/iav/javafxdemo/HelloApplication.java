package de.iav.javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // We get stage from parameter --> passt

        // We need a Scene, who accepts root node as a parameter of its constructor
         // Root node "Baseplate Lego"
        // The root node will be binded to the main scene
        Group rootNode = new Group();
        Scene mainScene = new Scene(rootNode, 450, 450, Color.OLIVE);

        // main scene and root node are binded. We need childern nodes now
        Text helloText = new Text();
        helloText.setScaleX(3);
        helloText.setScaleY(3);
        helloText.setX(120);
        helloText.setY(120);
        helloText.setText("Hello JavaFx");
        helloText.setUnderline(true);

        // Create another node, such as a button
        Button b = new Button();
        b.setText("Button");
        b.autosize();

        Integer i = 0;


        // Now bind the Nodes to the root node
        rootNode.getChildren().add(helloText);
        rootNode.getChildren().add(b);


        // Now bind the main scene to the stage
        stage.setScene(mainScene);

        // Show the stage
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}