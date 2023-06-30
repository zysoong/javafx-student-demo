package de.iav.studentwithscenes;

import de.iav.model.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentScene1Controller {

    @FXML
    private List<Student> studentList = new ArrayList<Student>();

    @FXML
    private TextField firstName_TextField;

    @FXML
    private TextField lastName_TextField;

    @FXML
    private TextField course_TextField;

    @FXML
    private TextField email_TextField;


    @FXML
    protected void onHelloButtonClick() throws IOException {

        Student studentToAdd = new Student(
                firstName_TextField.getText(),
                lastName_TextField.getText(),
                email_TextField.getText(),
                course_TextField.getText()
                );

        //this.createStudent(studentToAdd);
        //System.out.println(this.studentList);

        FXMLLoader loaderScene3 = new FXMLLoader(getClass().getResource("/de/iav/javafxdemo/student_scene3.fxml"));
        loaderScene3.load();
        ((StudentScene3Controller)(loaderScene3.getController())).addStudent(studentToAdd);

    }


    @FXML
    protected void onResetButtonClick() {
        this.studentList.clear();
        System.out.println(this.studentList);
    }

    @FXML
    public void onSSButton_switchToScene2(ActionEvent event) throws IOException {

        // load layout of scene 2
        FXMLLoader loaderScene2 = new FXMLLoader(getClass().getResource("/de/iav/javafxdemo/student_scene2.fxml"));

        // set scene object which should display the content in scene2
        Scene scene2 = new Scene(loaderScene2.load());

        // set stage which should be shown (newly) on click
        Stage stage = (Stage) (((Node) event.getSource()).getScene().getWindow());

        // set scene2 to stage and show it
        stage.setScene(scene2);
        stage.show();

    }


    @FXML
    public void onSSButton_switchToScene3(ActionEvent event) throws IOException {

        FXMLLoader loaderScene3 = new FXMLLoader(getClass().getResource("/de/iav/javafxdemo/student_scene3.fxml"));

        Scene scene3 = new Scene(loaderScene3.load());
        Stage stage = (Stage) (((Node) event.getSource()).getScene().getWindow());

        ((StudentScene3Controller)(loaderScene3.getController())).initialize();

        stage.setScene(scene3);
        stage.show();

    }

    public void createStudent(Student studentToAdd){
        this.studentList.add(studentToAdd);
    }



}
