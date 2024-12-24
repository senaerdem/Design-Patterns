module com.example.decoratordesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.decoratordesignpattern to javafx.fxml;
    exports com.example.decoratordesignpattern;
}