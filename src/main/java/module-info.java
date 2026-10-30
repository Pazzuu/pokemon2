module com.mpaz.pokemon2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mpaz.pokemon2 to javafx.fxml;
    exports com.mpaz.pokemon2;
}