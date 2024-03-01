module mx.arturogil.tableviewtest {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens mx.arturogil.tableviewtest to javafx.fxml;
    exports mx.arturogil.tableviewtest;
}