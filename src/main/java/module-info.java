
module com.cabinet.controller {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;
    
    opens com.cabinet.Controller to javafx.fxml;
    exports com.cabinet.Controller;
}
