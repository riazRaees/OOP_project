module com.riaz.oop_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.riaz.oop_project to javafx.fxml;
    exports com.riaz.oop_project;
}