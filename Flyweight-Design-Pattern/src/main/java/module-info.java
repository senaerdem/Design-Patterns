module com.example.flyweightdesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flyweightdesignpattern to javafx.fxml;
    exports com.example.flyweightdesignpattern;
}