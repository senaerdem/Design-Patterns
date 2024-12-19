module com.example.prototypedesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prototypedesignpattern to javafx.fxml;
    exports com.example.prototypedesignpattern;
}