package hu.nagy_gabor.filmdb;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Maincontroller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}