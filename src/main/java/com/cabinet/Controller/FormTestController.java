package com.cabinet.Controller;

import com.cabinet.Model.Test;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class FormTestController {
    @FXML public static TextField nomTest;
    @FXML public static TextField capacite;
    //@FXML private ComboBox<String> TypeTestComboBox;

    private Stage stage;

   /* public void initialize() {
        TypeTestComboBox.setItems(FXCollections.observableArrayList("Simples questionnaires", "série d'exercices"));
    }*/

    public void switchToAjouterTest(ActionEvent event) {



            Test test = new Test(nomTest.getText(), Integer.parseInt(capacite.getText()));
            new Main2Controller().showAlert(Alert.AlertType.INFORMATION, "Confirmation", "Le test a été ajouté avec succès");
            // Charge la scène appropriée en fonction de la sélection
            /*String selectedType = TypeTestComboBox.getValue();
            String fxmlFile = "";

            if ("Simples questionnaires".equals(selectedType)) {
                fxmlFile = "Simples_questionnaires.fxml";
            } else if ("série d'exercices".equals(selectedType)) {
                fxmlFile = "Serie_Exercice.fxml";
            }

            if (!fxmlFile.isEmpty()) {
                Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }

        } catch (NumberFormatException e) {
            // Handle the case where capacite.getText() is not a valid integer
            new Main2Controller().showAlert(Alert.AlertType.ERROR, "Erreur", "La capacité doit être un entier valide.");
        }catch (Exception e) {
            e.printStackTrace();
            new Main2Controller().showAlert(Alert.AlertType.ERROR, "Erreur", "Une erreur est survenue lors du chargement de la scène.");
        }*/
    }

    public void switchToSceneTest(MouseEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Tests.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }



    /*public void switchToScenecontinuer(MouseEvent event) throws Exception {
        //String selectedType = TypeTestComboBox.getValue();

        String fxmlFile = TypeTestComboBox.getValue().equals("Simples questionnaires") ? "Simples_questionnaires.fxml" : "Serie_Exercice.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
        Scene scene = null;

        try {

            scene = new Scene(fxmlLoader.load());
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("cfgsjhjs qshsqghjqsdjsdq");
        }

    }*/
    public void switchToSceneSimplesquestionnaires(MouseEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Simples_questionnaires.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScenesérieexercices(MouseEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Serie_Exercice.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}


/*
package com.cabinet.Controller;
import com.cabinet.Model.Test;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;

import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FormTestController {
    @FXML private TextField nomTest;
    @FXML private TextField  capacite;
    @FXML private ComboBox<String> TypeTestComboBox;

    //@FXML private ComboBox<String>  TypeTestComboBox ;



    private Stage stage;


   public void initialize() {
       TypeTestComboBox.setItems(FXCollections.observableArrayList("Enfant", "Adulte"));
        //TypeTest.setItems(FXCollections.observableArrayList("Simples questionnaires", "série d'exercices"));

    }

    public void switchToAjouterTest(ActionEvent event){


        //Anamnese anamnese = new Anamnese(nomAnamnese.getText(), enfantComboBox.getValue() , QuestionLibre.getText() , categorieComboBox.getValue());
        Test test = new Test(nomTest.getText(), TypeTestComboBox.getValue() , Integer.parseInt( capacite.getText()));
        new Main2Controller().showAlert(Alert.AlertType.INFORMATION, "Cofirmation", "l'anamnese a été ajouté avec succés");

    }



    public void switchToSceneTest(MouseEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Tests.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSceneSimplesquestionnaires(MouseEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Simples_questionnaires.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScenesérieexercices(MouseEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Serie_Exercice.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


}*/
