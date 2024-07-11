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
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;
public class VoirProfilsController implements Initializable {
private Stage stage;
@FXML private ScrollPane scrollpane;
@Override
public void initialize(URL url, ResourceBundle resourceBundle) {
     // Create a GridPane to hold the elements
     VBox vbox = new VBox();
     //ajout de la 1ere ligne
    
     StackPane stack = new StackPane();
     stack.setPrefSize(751, 50);
     stack.setStyle("-fx-background-color: lightyellow;");
     Text text = new Text("Nom                 Prenom                  Adresse               Email                Telephone");
     text.getStyleClass().add("scroll_text");
     stack.getChildren().add(text);
     // ajout au scrollpane
     vbox.getChildren().add(stack);
      scrollpane.setContent(vbox);
      // infos des ortho
      Iterator <Orthophoniste> it  = Main2Controller.gestion.listeOrthophonistes.iterator();
      while(it.hasNext()){
     Orthophoniste o = it.next();
     StackPane stack2 = new StackPane();
     stack2.setPrefSize(751, 100);
     stack2.setStyle("-fx-background-color: lightblue; ");
     Text text2 = new Text(o.getNom()+"                "+o.getPrenom()+"                 "+o.getAdresse()+"               "+o.getAddresseMail()+"               "+o.getNumTel());
     text2.getStyleClass().add("scroll_text");
     stack2.getChildren().add(text2);
     vbox.getChildren().add(stack2);
      }

    System.out.println("Controller initialized");
}
public void switchBackToMain2(MouseEvent event)throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("Profils_Main.fxml"));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
}