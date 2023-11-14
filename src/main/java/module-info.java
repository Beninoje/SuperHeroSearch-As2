module com.example.superherofinder {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;

    opens com.example.superherofinder to javafx.fxml, com.google.gson;
    exports com.example.superherofinder;
}