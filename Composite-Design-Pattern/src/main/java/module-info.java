module com.example.compositedesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.compositedesignpattern to javafx.fxml;
    exports com.example.compositedesignpattern;
}