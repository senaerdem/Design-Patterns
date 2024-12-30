module com.example.commanddesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.commanddesignpattern to javafx.fxml;
    exports com.example.commanddesignpattern;
}