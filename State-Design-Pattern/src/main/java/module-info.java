module com.example.statedesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.statedesignpattern to javafx.fxml;
    exports com.example.statedesignpattern;
}