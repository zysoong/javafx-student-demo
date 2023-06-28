module de.iav.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens de.iav.javafxdemo to javafx.fxml;
    opens de.iav.javafxwithfxml to javafx.fxml;
    exports de.iav.javafxdemo;
    exports de.iav.javafxwithfxml;
}