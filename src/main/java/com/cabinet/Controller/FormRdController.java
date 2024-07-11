package com.cabinet.Controller;
import java.time.format.DateTimeFormatter;

import com.cabinet.Model.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.PasswordField;
import javafx.fxml.FXML;


public class FormRdController {
    @FXML private TextField numero;
    @FXML private DatePicker date;
    @FXML private TextField Heure;
    @FXML private TextField age;
    @FXML private ComboBox choix;
    @FXML private TextField obs;
    private Stage stage;
    private boolean presentiel=true;
    @FXML
    public void initialize() {
        // Initialize ComboBox with items
        choix.getItems().addAll("Présentiel", "En ligne");

        // Add a listener to handle user selection
        choix.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            // Handle the selected item
            System.out.println("Selected: " + newValue);
        });
    }
    public void switchToAjouterRd(ActionEvent event){
        if(choix.getSelectionModel().getSelectedItem()=="En ligne")
            presentiel=false;
        if (choix.getSelectionModel().getSelectedItem()== null) {
            // Show an alert if no option is selected
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("PAS DE SELECTION");
            alert.setHeaderText(null);
            alert.setContentText("Veuillez choisir lale type de la séance (présentiel/en ligne)");
            alert.showAndWait();
            return;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.getValue().format(formatter);
        Suivi suivi = new Suivi(Integer.parseInt(numero.getText()),presentiel,formattedDate,Heure.getText(),obs.getText());
        Alert confirmation = new Alert(AlertType.CONFIRMATION);
        confirmation.setTitle("Confirmation");
        confirmation.setHeaderText("Voulez vous vraiment plannifier ce RD de suivi?");
        confirmation.setContentText("Date : "+suivi.getDate()+"\n"+"Heure : "+suivi.getHeure());
        // Charger l'icône
        Image icon = new Image(getClass().getResourceAsStream("pics/Confirmation.png"));
        ImageView imageView = new ImageView(icon);
        imageView.setFitWidth(48);
        imageView.setFitHeight(48);
        confirmation.setGraphic(imageView);

        // Appliquer du style CSS
        DialogPane dialogPane = confirmation.getDialogPane();
        dialogPane.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        dialogPane.getStyleClass().add("my-alert");
        confirmation.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                Main2Controller.gestion.ajouterRendezVous(suivi);
                new Main2Controller().showAlert(Alert.AlertType.INFORMATION, "Cofirmation", "RD de Suivi plannifié avec succés");
                System.out.println("RD ajoutée avec succés");
            }});
        System.out.println(Main2Controller.gestion.listeOrthophonistes.get(0).getNom());
    }


    public void switchBackToTypeRD(MouseEvent event ) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Types_Rendez_vous.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}
