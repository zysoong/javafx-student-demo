package de.iav.studentwithscenes;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;


public class StudentScene2Controller {

    @FXML
    private Button switchToSceneOneButton;


    @FXML
    public void onSSButton_switchToScene1(ActionEvent event) throws IOException {

        // load layout of scene 1
        FXMLLoader loaderScene1 = new FXMLLoader(getClass().getResource("/de/iav/javafxdemo/student_scene1.fxml"));

        // set scene object which should display the content in scene1
        Scene scene1 = new Scene(loaderScene1.load());

        // set stage which should be shown (newly) on click
        Stage stage = (Stage) (((Node) event.getSource()).getScene().getWindow());

        // set scene2 to stage and show it
        stage.setScene(scene1);
        stage.show();

    }



}
