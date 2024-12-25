module com.example.strategydesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.strategydesignpattern to javafx.fxml;
    exports com.example.strategydesignpattern;
}