package com.cabinet.Controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;

import java.util.Arrays;
import java.util.List;

public class FormSerieExercicesController {
    @FXML private TextField nom;  // Champ pour la consigne
    @FXML private TextField nom1; // Champ pour le matériel
    @FXML private ListView<String> questionsListView;  // ListView pour afficher les exercices

    @FXML
    private void initialize() {
        // Ajouter quelques exemples d'exercices et de matériels utilisés en orthophonie
        questionsListView.setItems(FXCollections.observableArrayList(
                "Répéter les phrases suivantes .Matériel : 'Le chat mange', 'Le chien aboie'. Matériel : Images d'animaux",
                "Lire le texte suivant à haute voix. Matériel : Livre de contes",
                "Associer chaque mot à son image correspondante. Matériel : Cartes de mots et d'images",
                "Nommer les objets dans l'image. Matériel : Image de la maison",
                "Décrire ce que fait le personnage dans l'image. Matériel : Bande dessinée"
        ));
    }

    @FXML
    private void ajouterQuestions(ActionEvent event) {
        String consigneText = nom.getText();
        String materielText = nom1.getText();

        if (consigneText != null && !consigneText.trim().isEmpty()) {
            String exercice = consigneText + (materielText != null && !materielText.trim().isEmpty() ? " . Matériel : " + materielText : " (sans matériel)");
            questionsListView.getItems().add(exercice);
            nom.clear();
            nom1.clear();
        } else {
            showAlert(Alert.AlertType.WARNING, "Attention", "La consigne ne peut pas être vide.");
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void switchBackToAnamnese(MouseEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cabinet/View/Anamnese.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchBackToTestMain(MouseEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Tests_Main.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Ajoutez les autres méthodes nécessaires pour votre contrôleur
}


/*
package com.cabinet.Controller;
import com.cabinet.Model.Anamnese;
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


public class FormSerieExercicesController {
    @FXML private TextArea Consigne;
     @FXML private TextField nomMateriel;

    @FXML private ListView<String> questionsListView;

    private Stage stage;

    // Map pour stocker les questions par catégorie




    private void updateQuestionsListView() {
            questionsListView.setItems(FXCollections.observableArrayList(questions));

    }

    @FXML
    private void ajouterQuestions(ActionEvent event) {
        String questionsText = QuestionLibre.getText();
        if (questionsText != null && !questionsText.trim().isEmpty()) {
            List<String> newQuestions = Arrays.asList(questionsText.split("\\R")); // Split the text into lines
            questionsListView.getItems().addAll(newQuestions);
            QuestionLibre.clear(); // Clear the TextArea after adding questions
        }
    }

    public void switchToAjouterAnamnese(ActionEvent event){
        List<String> questions = questionsListView.getItems();

        new Main2Controller().showAlert(Alert.AlertType.INFORMATION, "Cofirmation", "l'anamnese a été ajouté avec succés");
    }

    public void switchBackToAnamnese(MouseEvent event ) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Anamnese.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchBackToMain5(MouseEvent event ) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Tests_Main.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


}*/
