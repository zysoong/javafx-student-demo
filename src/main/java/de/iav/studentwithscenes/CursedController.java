package de.iav.studentwithscenes;

import de.iav.model.Student;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class CursedController {

    private List<Student> studentList = new ArrayList<>();

    @FXML
    private TextField firstName_TextField;

    @FXML
    private TextField lastName_TextField;

    @FXML
    private TextField course_TextField;

    @FXML
    private TextField email_TextField;

    @FXML
    protected void onHelloButtonClick() {

        Student studentToAdd = new Student(
                firstName_TextField.getText(),
                lastName_TextField.getText(),
                email_TextField.getText(),
                course_TextField.getText()
                );

        this.createStudent(studentToAdd);
        System.out.println(this.studentList);
    }


    @FXML
    protected void onResetButtonClick() {
        this.studentList.clear();
        System.out.println(this.studentList);
    }

    public void createStudent(Student studentToAdd){
        this.studentList.add(studentToAdd);
    }



}
