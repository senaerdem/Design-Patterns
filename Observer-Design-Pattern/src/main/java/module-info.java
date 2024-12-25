module com.example.observerdesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.observerdesignpattern to javafx.fxml;
    exports com.example.observerdesignpattern;
}