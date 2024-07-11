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


public class FormConsultController {
    @FXML private TextField nom;
    @FXML private TextField prenom;
    @FXML private TextField obs;
    @FXML private DatePicker date;
    @FXML private TextField Heure;
    @FXML private TextField age;
    @FXML private ComboBox choix;
    private Stage stage;
    private boolean Adult=true;
    @FXML
    public void initialize() {
        // Initialize ComboBox with items
        choix.getItems().addAll("Adult", "Enfant");

        // Add a listener to handle user selection
        choix.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            // Handle the selected item
            System.out.println("Selected: " + newValue);
        });
    }

    public void switchToAjouterConsult(ActionEvent event){
        if(choix.getSelectionModel().getSelectedItem()=="Enfant")
            Adult=false;
        if (choix.getSelectionModel().getSelectedItem()== null) {
            // Show an alert if no option is selected
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("PAS DE SELECTION");
            alert.setHeaderText(null);
            alert.setContentText("Veuillez choisir la catégorie du patient");
            alert.showAndWait();
            return;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.getValue().format(formatter);
        Consultation cons = new Consultation(obs.getText(), Heure.getText(), formattedDate, nom.getText(), prenom.getText(), Integer.parseInt(age.getText()),Adult);
        Alert confirmation = new Alert(AlertType.CONFIRMATION);
        confirmation.setTitle("Confirmation");
        confirmation.setHeaderText("Voulez vous vraiment plannifier cette consultation?");
        confirmation.setContentText("Date : "+cons.getDate()+"\n"+"Heure : "+cons.getHeure());
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
                Main2Controller.gestion.ajouterRendezVous(cons);
                new Main2Controller().showAlert(Alert.AlertType.INFORMATION, "Cofirmation", "Consultation plannifiée avec succés");
                System.out.println("Cosultation ajoutée avec succés");
            }});
        int i=0;
        for (RendezVous rd: Main2Controller.gestion.listeRendezVous){
            System.out.println(rd.getDate());
        }
        System.out.println("check");
    }


    public void switchBackToTypeRD(MouseEvent event ) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Types_Rendez_vous.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
