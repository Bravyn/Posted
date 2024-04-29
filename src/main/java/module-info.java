module com.example.posted {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.posted to javafx.fxml;
    exports com.example.posted;
}