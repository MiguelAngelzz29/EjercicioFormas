module es.miguel.ejercicioformas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens es.miguel.ejercicioformas to javafx.fxml;
    exports es.miguel.ejercicioformas;
}
