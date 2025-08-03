module com.example.studentplanner {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.studentplanner to javafx.fxml;
    exports com.example.studentplanner;
}
