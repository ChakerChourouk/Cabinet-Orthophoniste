package com.cabinet.Controller;
import com.cabinet.Model.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.Scene;
import com.cabinet.Model.*;
import javafx.scene.image.*;
import java.util.Iterator;

import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
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
public class VoirPatientsController implements Initializable {
private Stage stage;
private Parent root;
@FXML private ScrollPane scrollpane;
@Override
public void initialize(URL url, ResourceBundle resourceBundle) {
     // Create a GridPane to hold the elements
     VBox vbox = new VBox();
     //ajout de la 1ere ligne

     StackPane stack = new StackPane();
     stack.setPrefSize(751, 50);
     stack.setStyle("-fx-background-color: lightyellow;");
     Text text = new Text("Nom                 Prenom                  Adresse                   Telephone                  Catégorie");
     text.getStyleClass().add("scroll_text");
     stack.getChildren().add(text);
     // ajout au scrollpane
     vbox.getChildren().add(stack);
      scrollpane.setContent(vbox);
      // infos des ortho
      Iterator <Patient> it  = Main2Controller.gestion.listePatients.iterator();
      while(it.hasNext()){
        Patient p  = it.next();
     StackPane stack2 = new StackPane();
     stack2.setPrefSize(751, 100);
     stack2.setStyle("-fx-background-color: lightblue; ");
     String cat="";
     Long tel;
     if(p instanceof Adulte){
        cat="Adulte";
        tel = ((Adulte)p).getNumPersonel();
     }else{
        cat="Enfant";
        tel = ((Enfant)p).getNumTelParents();
     }
     Text text2 = new Text(p.getNom()+"                "+p.getPrenom()+"                 "+p.getAdresse()+"               "+tel+"                 "+cat);
     text2.getStyleClass().add("scroll_text");
     stack2.getChildren().add(text2);
     Button accessFoldersButton = new Button("Dossier");
            accessFoldersButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    try {
                        ouvrirDossier(p);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            stack2.getChildren().add(accessFoldersButton);
     vbox.getChildren().add(stack2);
      }


    System.out.println("Controller initialized");
}
private void ouvrirDossier(Patient patient) throws Exception {
    // Load the FXML for the patient's folders view
    Main2Controller.gestion.patient = patient;
    //dossier
    Iterator<Dossier> it =(Main2Controller.gestion.listeDossiers).iterator();
    while(it.hasNext()){
        Dossier d = it.next();
        if(d.getNumeroDossier()==patient.getNumeroDossier()){
        Main2Controller.gestion.dossier =d;
        }
    }
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Dossier.fxml"));

    Parent root = loader.load();

    System.out.println(Main2Controller.gestion.patient.getNom());
    // Create a new stage for the folders view
    Stage foldersStage = Main2Controller.gestion.stageb;
    foldersStage.setScene(new Scene(root));
    foldersStage.show();
}
public void switchBackToMain2(MouseEvent event)throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("Profils_Main.fxml"));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
    public void switchToMainPatient(MouseEvent event)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("patients_Main.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}