module org.imie.projetbts {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.imie.projetbts to javafx.fxml;
    exports org.imie.projetbts;
}