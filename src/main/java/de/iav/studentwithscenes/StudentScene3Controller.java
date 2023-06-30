package de.iav.studentwithscenes;


import de.iav.model.Student;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class StudentScene3Controller {

    @FXML
    private Button addStudentButton;

    @FXML
    private TextField studentFirstNameTF;

    @FXML
    private TextField studentSurnameTF;

    @FXML
    private TextField studentEmailTF;

    @FXML
    private TextField studentCourseTF;

    @FXML
    private ListView<Student> students;


    public void initialize(){
        // Fügt ein Event-Handler hinzu, der den Button deaktiviert, wenn das Textfeld leer ist
        studentFirstNameTF.addEventHandler(EventType.ROOT, event -> {
            addStudentButton.setDisable(studentFirstNameTF.getText().isEmpty());
        });

        studentSurnameTF.addEventHandler(EventType.ROOT, event -> {
            addStudentButton.setDisable(studentSurnameTF.getText().isEmpty());
        });

        studentEmailTF.addEventHandler(EventType.ROOT, event -> {
            addStudentButton.setDisable(studentEmailTF.getText().isEmpty());
        });

        studentCourseTF.addEventHandler(EventType.ROOT, event -> {
            addStudentButton.setDisable(studentCourseTF.getText().isEmpty());
        });

        // Fügt ein Event-Handler hinzu, der den Text des ausgewählten Elements in die Textansicht schreibt
        /*
        students.getSelectionModel().selectedItemProperty().addListener(
                //(observableValue, s, t1) -> text.setText(listView.getSelectionModel().getSelectedItem())
                (observableValue, s, t1) -> {}
        );*/
    }


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


    @FXML
    public void onAddButton(ActionEvent event) throws IOException {

        String fn = studentFirstNameTF.getText();
        String sn = studentSurnameTF.getText();
        String em = studentEmailTF.getText();
        String sc = studentCourseTF.getText();
        this.students.getItems().add(new Student(fn, sn, em, sc));

    }

    public void setStudents(ListView<Student> students){
        this.students = students;
    }

    public void addStudent(Student student){
        this.students.getItems().add(student);
    }




}
