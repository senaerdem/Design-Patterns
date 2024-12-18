module com.example.builderdesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.builderdesignpattern to javafx.fxml;
    exports com.example.builderdesignpattern;
}