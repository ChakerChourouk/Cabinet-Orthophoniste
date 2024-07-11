package com.cabinet.Controller;
import com.cabinet.Model.*;
import com.cabinet.Model.Orthophoniste;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

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


public class FormOrthoController {
@FXML private TextField nom;
@FXML private TextField prenom;
@FXML private TextField tel;
@FXML private TextField adresse;
@FXML private TextField email;
@FXML private PasswordField password;
private Stage stage;
public void switchToAjouterOrtho(ActionEvent event){
Orthophoniste orthophoniste = new Orthophoniste(nom.getText(), prenom.getText(), Long.parseLong(tel.getText()), email.getText(), password.getText(),adresse.getText());

Alert confirmation = new Alert(AlertType.CONFIRMATION);
   confirmation.setTitle("Confirmation");
   confirmation.setHeaderText("Voulez vous vraiment ajouter ce compte?");
   confirmation.setContentText("Nom : "+nom.getText()+"\n"+"Prénom : "+prenom.getText());
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
        Main2Controller.gestion.ajouterOrthophoniste(orthophoniste);
        new Main2Controller().showAlert(Alert.AlertType.INFORMATION, "Cofirmation", "le compte a été ajouté avec succés"); 
        System.out.println("Compte ajouté avec succés"); 
    }});
System.out.println(Main2Controller.gestion.listeOrthophonistes.get(0).getNom());
}
public void switchBackToMain(MouseEvent event ) throws Exception{
Parent root = FXMLLoader.load(getClass().getResource("Profils_Main.fxml"));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}


}
