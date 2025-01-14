module com.example.visitordesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.visitordesignpattern to javafx.fxml;
    exports com.example.visitordesignpattern;
}