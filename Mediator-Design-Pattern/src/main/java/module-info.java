module com.example.mediatordesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mediatordesignpattern to javafx.fxml;
    exports com.example.mediatordesignpattern;
}