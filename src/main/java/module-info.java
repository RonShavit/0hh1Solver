module com.example.ohh1solver {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.ohh1solver to javafx.fxml;
    exports com.example.ohh1solver;
}