module com.example.facadedesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.facadedesignpattern to javafx.fxml;
    exports com.example.facadedesignpattern;
}