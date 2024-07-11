package com.cabinet.Controller;
import static com.cabinet.Controller.FormTestController.nomTest;
import static com.cabinet.Controller.FormTestController.capacite;

import com.cabinet.Model.Test;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QCUController {

    @FXML private ListView<String> questionsListView;
    @FXML private TextField questionField;
    @FXML private TextField answersField;

    private Stage stage;

    // Map pour stocker les questions et leurs réponses
    private Map<String, List<String>> questionsWithAnswers;

    public void initialize() {
        // Initialiser les questions avec leurs réponses
        questionsWithAnswers = new HashMap<>();
        questionsWithAnswers.put("Combien de personnes composent votre famille nucléaire ?",
                List.of("1 personne", "2 personnes", "3 personnes", "4 personnes", "5 personnes ou plus"));
        questionsWithAnswers.put("Quels sont les âges et les professions des membres de votre famille ?",
                List.of("Enfants", "Adolescents", "Adultes", "Seniors"));
        questionsWithAnswers.put("Avez-vous des parents divorcés ou recomposés ?",
                List.of("Oui", "Non"));
        questionsWithAnswers.put("Où vivent les différents membres de votre famille élargie ?",
                List.of("Dans la même ville", "Dans une autre ville", "Dans un autre pays"));
        questionsWithAnswers.put("Quelles sont les traditions et les fêtes importantes pour votre famille ?",
                List.of("Noël", "Pâques", "Fête nationale", "Autre"));

        // Ajouter les questions à la ListView
        questionsListView.setItems(FXCollections.observableArrayList(questionsWithAnswers.keySet()));

        // Ajouter un listener pour afficher les réponses lors de la sélection d'une question
        questionsListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                displayAnswers(newValue);
            }
        });
    }

    private void displayAnswers(String question) {
        List<String> answers = questionsWithAnswers.get(question);
        if (answers != null) {
            // Créer et afficher une alerte avec les réponses
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Réponses possibles");
            alert.setHeaderText(question);
            alert.setContentText(String.join("\n", answers));
            alert.showAndWait();
        }
    }

    @FXML
    private void addNewQuestion(ActionEvent event) {
        String question = questionField.getText().trim();
        String answersText = answersField.getText().trim();

        if (!question.isEmpty() && !answersText.isEmpty()) {
            List<String> answers = List.of(answersText.split("\\s*,\\s*"));

            // Ajouter la nouvelle question et ses réponses à la Map
            questionsWithAnswers.put(question, answers);

            // Ajouter la nouvelle question à la ListView
            questionsListView.getItems().add(question);

            // Effacer les champs de texte
            questionField.clear();
            answersField.clear();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText("Entrée invalide");
            alert.setContentText("Veuillez entrer une question et au moins une réponse.");
            alert.showAndWait();
        }
    }

    public void switchToAjouterQCL(ActionEvent event) {

        Test test = new Test(nomTest.getText(), Integer.parseInt( capacite.getText()));

        // Code pour gérer l'ajout d'une nouvelle question à la ListView
    }

    public void switchBackToAnamnese(MouseEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Anamnese.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchBackToTestMain(MouseEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Tests_Main.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}


