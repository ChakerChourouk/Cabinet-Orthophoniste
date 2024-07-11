package com.cabinet.Controller;
import com.cabinet.Model.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;



import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.Scene;
import com.cabinet.Model.*;
import javafx.scene.image.*;
import java.util.Iterator;

import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;

public class DossierController {
@FXML Text nom;
@FXML Text prenom;
@FXML Text tel;
@FXML Text adr;
@FXML Text cat;
//buttons
@FXML Button rv;
@FXML Button fsuivi;
@FXML Button bo;
private Stage stage;
private Patient patient;

public void setPatient(Patient patient) {
    this.patient = patient;
}
public Patient getPatient() {
    return patient;
}
@FXML
public void initialize(){
    patient = Main2Controller.gestion.patient;
String tell="";
String catt="";

if(patient instanceof Adulte){
        catt="Adulte";
        tell = Long.toString(((Adulte)patient).getNumPersonel());
     }else{
        catt="Enfant";
        tell = Long.toString(((Enfant)patient).getNumTelParents());
     }
nom.setText(patient.getNom());
prenom.setText(patient.getPrenom());
tel.setText(tell);
adr.setText(patient.getAdresse());
cat.setText(catt);
}
public void switchToSuivi(ActionEvent event)throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("ChoixSuivi.fxml"));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();

}

    public void switchToback(ActionEvent event)throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("patients_Main.fxml")));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
}