module com.example.interpreterdesignpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interpreterdesignpattern to javafx.fxml;
    exports com.example.interpreterdesignpattern;
}