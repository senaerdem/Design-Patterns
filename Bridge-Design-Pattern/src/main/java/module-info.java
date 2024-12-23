module com.example.bridgedesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bridgedesignpattern to javafx.fxml;
    exports com.example.bridgedesignpattern;
}