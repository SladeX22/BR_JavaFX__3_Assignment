module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment_3 to javafx.fxml;
    exports com.example.assignment_3;
}