module com.example.tooltips {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tooltips to javafx.fxml;
    exports com.example.tooltips;
}