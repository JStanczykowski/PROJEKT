package com.example.projekt;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUPController implements Initializable {

    @FXML
    private TextField dawid;
    @FXML
    private PasswordField drej;
    @FXML
    private PasswordField drej1;
    @FXML
    private Button button_registration;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button_registration.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String haslo1 = drej.getText().trim();
                String haslo2 = drej1.getText().trim();
                if(!dawid.getText().trim().isEmpty() && !drej.getText().trim().isEmpty() && !drej1.getText().trim().isEmpty() && haslo1.equals(haslo2)) {
                    DBUtils.signUpUser(event, dawid.getText(), drej.getText());
                    DBUtils.changeScene(event,"login.fxml", "Logowanie", null, 600, 400);
                } else if(!haslo1.equals(haslo2)) {
                    Alert er = new Alert(Alert.AlertType.NONE);
                    er.setAlertType(Alert.AlertType.ERROR);
                    er.setContentText("HASLA MUSZA BYC ROWNE");
                    er.showAndWait();
                }
                else {
                    Alert er = new Alert(Alert.AlertType.NONE);
                    er.setAlertType(Alert.AlertType.ERROR);
                    er.setContentText("PROSZĘ WPROWADZIC DANE");
                    er.showAndWait();
                }
            }
        });
    }
}
