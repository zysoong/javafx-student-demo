package de.iav.javafxwithfxml;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class HelloController {

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

        //System.out.println(firstName_TextField.getText());
        //System.out.println(lastName_TextField.getText());
        //System.out.println(course_TextField.getText());
        //System.out.println(email_TextField.getText());
    }

    public void createStudent(Student studentToAdd){
        this.studentList.add(studentToAdd);
    }

}
