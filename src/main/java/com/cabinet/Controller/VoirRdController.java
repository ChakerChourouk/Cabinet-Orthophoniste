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
import com.cabinet.Model.*;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;
public class VoirRdController implements Initializable {
    private Stage stage;
    @FXML private ScrollPane scrollpane;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Create a GridPane to hold the elements
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        //ajout de la 1ere ligne
        // infos des ortho
        Iterator <RendezVous> it  = Main2Controller.gestion.listeRendezVous.iterator();
        while(it.hasNext()){
            String type="";
            String duree="";
            StackPane stack = new StackPane();
            RendezVous obj = it.next();
            if(obj instanceof Consultation){
                type="Consultation";
                if(((Consultation)(obj)).getAdult()){
                    duree="1H 30min";
                }else{
                    duree="2H ";
                }
            } else if(obj instanceof Suivi){
                type="Rendez Vous de Suivi";
                duree="1H";
            } else if(obj instanceof Atelier){
                type ="Atelier";
                duree="1H";
            }
            VBox textContainer = new VBox();
            Text text1 = new Text("type : "+type);
            Text text3 = new Text("Date : "+obj.getDate());
            Text text2 = new Text("Temps de Début : "+obj.getHeure());
            Text text4 = new Text("Durée : "+duree);
            textContainer.getChildren().add(text1);
            textContainer.getChildren().add(text3);
            textContainer.getChildren().add(text2);
            textContainer.getChildren().add(text4);
            stack.getChildren().add(textContainer);
            vbox.getChildren().add(stack);
        }
        scrollpane.setContent(vbox);
    }



    public void switchBackToRD(MouseEvent event)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Rendez_vous.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}