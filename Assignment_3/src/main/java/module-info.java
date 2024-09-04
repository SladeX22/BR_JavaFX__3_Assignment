module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    //Use this for the first assignment
    /*opens com.example.assignment_3 to javafx.fxml;
    exports com.example.assignment_3;*/

    //Use this for the second assignment
    /*opens com.example.user_registration to javafx.fxml;
    exports com.example.user_registration;*/

    //Use this for the third assignment
    /*opens com.example.calculator to javafx.fxml;
    exports com.example.calculator;*/

    //Use this for the fourth assignment
    opens com.example.word_count_analyzer to javafx.fxml;
    exports com.example.word_count_analyzer;
}