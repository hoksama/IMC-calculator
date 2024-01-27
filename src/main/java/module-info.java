module com.example.imc_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.imc_calculator to javafx.fxml;
    exports com.example.imc_calculator;
}