module com.example.primerparcialpdd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primerparcialpdd to javafx.fxml;
    exports com.example.primerparcialpdd;
}