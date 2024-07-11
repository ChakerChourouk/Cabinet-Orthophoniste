
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


public class FormAnamnesesEnfantController {
    @FXML private TextField nom;
    //@FXML private TextField Enfant;
    // @FXML private TextField Categorie;
    @FXML private ComboBox<String> enfantComboBox;
    @FXML private ComboBox<String> categorieComboBox;
    @FXML private TextArea QuestionLibre;
    @FXML private ListView<String> questionsListView;

    private Stage stage;

    // Map pour stocker les questions par catégorie
    private Map<String, List<String>> questionsByCategory;

    public void initialize() {
        enfantComboBox.setItems(FXCollections.observableArrayList("Enfant", "Adulte"));
        enfantComboBox.setOnAction(event -> updateCategoriesComboBox());

        // Initialiser les questions pour chaque catégorie
        questionsByCategory = new HashMap<>();
        questionsByCategory.put("Structure familiale", List.of(
                "1-Combien de personnes composent votre famille nucléaire ?",
                "2-Quels sont les âges et les professions des membres de votre famille ?",
                "3-Avez-vous des parents divorcés ou recomposés ?",
                "4-Où vivent les différents membres de votre famille élargie ?",
                "5-Quelles sont les traditions et les fêtes importantes pour votre famille ?"
        ));
        questionsByCategory.put("dynamique familiale", List.of(
                "1-Comment décririez-vous l'atmosphère générale au sein de votre famille ?",
                "2-Qui prend généralement les décisions importantes dans votre famille ?",
                "3-Quels sont les principaux centres d'intérêt partagés par votre famille ?",
                "4-Comment votre famille communique-t-elle et résout-elle les problèmes ?",
                "5-Quel est le rôle de chacun dans les tâches et les responsabilités domestiques ?"
        ));
        questionsByCategory.put("antécédents familiaux", List.of(
                "Y a-t-il des problèmes de santé mentale, de dépendance ou de criminalité dans votre famille ?",
                "Avez-vous connaissance d'événements marquants comme des migrations, des guerres ou des traumatismes familiaux ?",
                "Quelles sont les origines et les traditions culturelles de votre famille ?",
                "Votre famille a-t-elle un patrimoine ou des biens transmis de génération en génération ?",
                "Quel est le niveau d'éducation des différents membres de votre famille ?"
        ));
        questionsByCategory.put("conditions natales", List.of(
                "Avez-vous été un bébé prématuré ou de petit poids à la naissance ?",
                "Votre mère a-t-elle rencontré des complications durant sa grossesse ?",
                "Avez-vous été allaité et pendant combien de temps ?",
                "Quels ont été les principaux soins et vaccinations reçus pendant votre petite enfance ?",
                "Avez-vous été hospitalisé ou avez-vous subi des interventions médicales dans vos premières années ?"
        ));
        questionsByCategory.put("développement psychomoteur", List.of(
                "À quel âge avez-vous commencé à ramper, à vous tenir assis et à marcher ?",
                "Avez-vous développé des habiletés motrices fines comme tenir un crayon ou boutonner vos vêtements ?",
                "Avez-vous pratiqué des activités physiques ou sportives pendant votre enfance ?",
                "Avez-vous eu des problèmes de coordination, de maladresse ou de retard de développement moteur ?",
                "Comment décririez-vous votre niveau d'énergie et votre tonus musculaire pendant votre jeunesse ?"
        ));
        questionsByCategory.put("développement langagier", List.of(
                "À quel âge avez-vous prononcé vos premiers mots et vos premières phrases complètes ?",
                "Avez-vous bénéficié d'une stimulation précoce ou de séances de rééducation orthophonique ?",
                "Comment qualifieriez-vous l'évolution de votre vocabulaire et de votre capacité d'expression à l'oral ?",
                "Avez-vous rencontré des difficultés particulières dans l'apprentissage de la lecture et de l'écriture ?",
                "Quelles langues parliez-vous à la maison pendant votre enfance et comment les avez-vous acquises ?"
        ));
        questionsByCategory.put("caractère et comportement", List.of(
                "Comment décririez-vous votre tempérament d'enfant (calme, nerveux, enjoué, etc.) ?",
                "Étiez-vous un enfant facile à éduquer ou avez-vous eu des problèmes de discipline ?",
                "Avez-vous développé des phobies, des troubles du sommeil ou de l'alimentation pendant votre jeunesse ?",
                "Comment vos parents ou enseignants ont-ils qualifié votre comportement (solitaire, agité, attentif, etc.) ?",
                "Quelles sont les principales qualités ou défauts de caractère qui vous définissent encore aujourd'hui ?"
        ));
        questionsByCategory.put("histoire de maladie", List.of(
                "1-Quels problèmes de santé avez-vous rencontrés dans le passé ?",
                "2-Avez-vous des antécédents de maladies chroniques ?"
        ));
        questionsByCategory.put("suivie medicale", List.of(
                "1-À quelle fréquence consultez-vous un médecin ?",
                "2-Avez-vous des médicaments prescrits de façon régulière ?"
        ));

        // Mettre à jour les options de la catégorie au démarrage
        updateCategoriesComboBox();

        // Mettre à jour les questions lorsque la catégorie change
        categorieComboBox.setOnAction(event -> updateQuestionsListView());
    }

    private void updateCategoriesComboBox() {
        String selectedEnfant = enfantComboBox.getValue();
        if ("Enfant".equals(selectedEnfant)) {
            categorieComboBox.setItems(FXCollections.observableArrayList(
                    "Structure familiale", "dynamique familiale", "antécédents familiaux", "conditions natales",
                    "développement psychomoteur", "développement langagier", "caractère et comportement"
            ));
        } else if ("Adulte".equals(selectedEnfant)) {
            categorieComboBox.setItems(FXCollections.observableArrayList(
                    "histoire de maladie", "suivie medicale"
            ));
        }
        // Mettre à jour la liste des questions après mise à jour des catégories
        updateQuestionsListView();
    }

    private void updateQuestionsListView() {
        String selectedCategory = categorieComboBox.getValue();
        if (selectedCategory != null) {
            List<String> questions = questionsByCategory.getOrDefault(selectedCategory, List.of());
            questionsListView.setItems(FXCollections.observableArrayList(questions));
        }
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


        //Anamnese anamnese = new Anamnese(nomAnamnese.getText(), enfantComboBox.getValue() , QuestionLibre.getText() , categorieComboBox.getValue());
        Anamnese anamnese = new Anamnese(nom.getText(), enfantComboBox.getValue(), QuestionLibre.getText(), categorieComboBox.getValue(), questions);
        Alert confirmation = new Alert(AlertType.CONFIRMATION);
        confirmation.setTitle("Confirmation");
        confirmation.setHeaderText("Voulez vous vraiment ajouter cet Anamnése?");
        confirmation.setContentText("Nom : "+nom.getText());
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
                Main2Controller.gestion.ajouterAnamneses(anamnese);
                new Main2Controller().showAlert(Alert.AlertType.INFORMATION, "Cofirmation", "l'anamnese a été ajouté avec succés");
                System.out.println("anamnese ajouté avec succés");
            }});
        System.out.println(Main2Controller.gestion.listeAnamneses.get(0).getNomAnamnese());
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


}
