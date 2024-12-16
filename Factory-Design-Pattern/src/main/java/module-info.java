module com.example.factorydesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.factorydesignpattern to javafx.fxml;
    exports com.example.factorydesignpattern;
}