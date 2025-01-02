module com.example.templatedesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.templatedesignpattern to javafx.fxml;
    exports com.example.templatedesignpattern;
}