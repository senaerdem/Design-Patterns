module com.example.adapterdesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.adapterdesignpattern to javafx.fxml;
    exports com.example.adapterdesignpattern;
}