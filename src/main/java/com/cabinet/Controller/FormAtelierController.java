package com.cabinet.Controller;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;

import com.cabinet.Model.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
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
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.PasswordField;
import javafx.fxml.FXML;
import java.util.HashSet;
import java.util.Set;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;
public class FormAtelierController {
    @FXML private TextField numero;
    @FXML private TextField theme;
    @FXML private DatePicker date;
    @FXML private TextField Heure;

    @FXML private ScrollPane scroll;
    Set<Integer> dossiers = new HashSet<Integer>();
    @FXML private TextField obs;
    private VBox dossierBox ;
    private Stage stage;
    @FXML
    public void initialize(){
        dossierBox = new VBox();
        dossierBox .setSpacing(10);
        dossierBox .setPadding(new Insets(10));

        // Create a ScrollPane and add the VBox to it
        scroll.setContent(dossierBox);
        scroll.setFitToWidth(true);

    }
    public void ajouterDossier(ActionEvent event ) {
        StackPane stack = new StackPane();
        Text text = new Text(numero.getText());
        stack.getChildren().add(text);
        dossierBox.getChildren().add(stack);
        dossiers.add(Integer.parseInt(numero.getText()));
    }
    public void switchToAjouterAtelier(ActionEvent event){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.getValue().format(formatter);
        Atelier atelier  = new Atelier(theme.getText(),formattedDate,Heure.getText(),obs.getText());
        for(int i : dossiers){
            atelier.ajouterNumDossier(i);
        }
        Alert confirmation = new Alert(AlertType.CONFIRMATION);
        confirmation.setTitle("Confirmation");
        confirmation.setHeaderText("Voulez vous vraiment plannifier cet Atelier?");
        confirmation.setContentText("Date "+atelier.getDate()+"\n"+"Heure : "+atelier.getHeure());
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
                Main2Controller.gestion.ajouterRendezVous(atelier);
                new Main2Controller().showAlert(Alert.AlertType.INFORMATION, "Cofirmation", "Atelier plannifié avec succés");
                System.out.println("Atelier ajoutée avec succés");
            }});
        System.out.println(Main2Controller.gestion.listeOrthophonistes.get(0).getNom());
    }

    public void switchBackToTypeRD(MouseEvent event ) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Types_Rendez_vous.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


}
