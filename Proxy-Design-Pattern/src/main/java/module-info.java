module com.example.proxydesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proxydesignpattern to javafx.fxml;
    exports com.example.proxydesignpattern;
}