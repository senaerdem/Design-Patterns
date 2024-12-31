module com.example.chainofresponsibilitydesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chainofresponsibilitydesignpattern to javafx.fxml;
    exports com.example.chainofresponsibilitydesignpattern;
}