module de.azubiag.mavenFXtest {
    requires javafx.controls;
    requires javafx.fxml;

    opens de.azubiag.mavenFXtest to javafx.fxml;
    exports de.azubiag.mavenFXtest;
}