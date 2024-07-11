package com.cabinet.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class FirstPageController {

    @FXML
    private void handlePatientManagement(ActionEvent event) {
        showAlert("Gestion des Patients", "Cette section permet de gérer les patients.");
    }

    @FXML
    private void handleAppointments(ActionEvent event) {
        showAlert("Prendre un Rendez-vous", "Cette section permet de prendre un rendez-vous.");
    }

    @FXML
    private void handleStatistics(ActionEvent event) {
        showAlert("Consulter les Statistiques", "Cette section permet de consulter les statistiques.");
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
