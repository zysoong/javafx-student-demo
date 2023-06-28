package de.iav.javafxwithfxml;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private TextField firstName_TextField;

    @FXML
    private TextField course_TextField;

    @FXML
    protected void onHelloButtonClick() {
        System.out.println(firstName_TextField.getText());
        System.out.println(course_TextField.getText());
    }

}
