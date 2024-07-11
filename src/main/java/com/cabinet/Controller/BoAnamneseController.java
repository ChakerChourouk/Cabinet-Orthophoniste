package com.cabinet.Controller;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

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


public class BoAnamneseController {

private Stage stage;

 @FXML TextField nom;
    public void initialize() {
      
    }
    public void  suivantAnamnese(ActionEvent event) throws Exception{
        Main2Controller.gestion.premierbo.setNomAnamnese(nom.getText());
         Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Ec.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show(); 
    }

public void switchBackToBo(MouseEvent event ) throws Exception{
Parent root = FXMLLoader.load(getClass().getResource("BO.fxml"));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
}
