module com.example.petla_for {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.petla_for to javafx.fxml;
    exports com.example.petla_for;
}