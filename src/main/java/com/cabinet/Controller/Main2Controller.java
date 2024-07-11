package com.cabinet.Controller;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import java.io.File;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;
import javafx.scene.control.PasswordField;
import javafx.fxml.FXML;
import javafx.scene.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.cabinet.Model.*;

public class Main2Controller{


public static GestionCabinetOrthophoniste gestion = new GestionCabinetOrthophoniste();
private Stage stage;
@FXML
public void switchToSceneAnamnese(MouseEvent event) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("Tests_Main.fxml"));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
    Main2Controller.gestion.stageb = stage;
}
public void switchToSceneProfile(MouseEvent event) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("Profils_Main.fxml"));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
    Main2Controller.gestion.stageb = stage;
}
public void switchToSceneChoiceAnamnese(MouseEvent event) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("Anamnese.fxml"));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
    Main2Controller.gestion.stageb = stage;
}
public void switchToSceneAjoutereAnamnese(MouseEvent event) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("Form_Anamnese.fxml"));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
@FXML
public void switchToSceneAjouterCompte(MouseEvent event) throws Exception{
   
   Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("form1.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}

    public void SwitchToVoirTests(MouseEvent event)throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Voir_Tests.fxml")));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


    public void switchToSceneQCU(MouseEvent event) throws Exception {
        //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Form_Anamnese.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("QCU.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSceneQCM(MouseEvent event) throws Exception {
        //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Form_Anamnese.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("QCM.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSceneQCL(MouseEvent event) throws Exception {
        //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Form_Anamnese.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("QCL.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSceneAjoutereTest(MouseEvent event) throws Exception {
        //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Form_Anamnese.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("Form_Test.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
public void SwitchToVoirProfils(MouseEvent event)throws Exception {
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Voir_Profils.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show(); 
}
public void switchToRd(MouseEvent event) throws Exception {
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Rendez_vous.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show(); 
}
public void switchToTypesrd(MouseEvent event)throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Types_Rendez_vous.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show(); 
}
public void switchToFormCons(MouseEvent event) throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Form_Consultation.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show(); 
}
public void switchToFormRd(MouseEvent event) throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Form_RdSuivi.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show(); 
}
public void switchToFormAtelier(MouseEvent event) throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Form_Atelier.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show(); 
}
public void switchToVoirRd(MouseEvent event) throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("VoirRendezVous.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show(); 
}
public void switchToMainPatient(MouseEvent event)throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("patients_Main.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show(); 
}
public void switchToTypePatient(MouseEvent event) throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Enfant_Adulte_patient.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show(); 
}
public void switchToAjouterAdulte(MouseEvent event) throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Form_Adulte.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show(); 
}
public void switchToAjouterEnfant(MouseEvent event) throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Form_Enfant.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show(); 
}
public void switchToVoirPatient(MouseEvent event) throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Voir_Patients.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
   Main2Controller.gestion.stageb = stage;
    stage.setScene(scene);
    stage.show(); 
}
public void switchToRemplirSuivi(MouseEvent event) throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fsuivi.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show(); 
}
public void switchToPremierBo(MouseEvent event)throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AnamneseBo.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}

    public void switchToSceneTest(MouseEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Tests.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }



    public void switchBackToRD(MouseEvent event)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Rendez_vous.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchBackToDossier(MouseEvent event)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Dossier.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void SwitchToVoirAnamneses(MouseEvent event)throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Voir_Anamneses.fxml")));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void switchBackToHomePage(MouseEvent event)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("PageAcceuil.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
public void switchToBo(MouseEvent event)throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Ec.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
public void switchToVoirPatientsBo(MouseEvent event)throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("PatientBo.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}

    public void   switchToAnamnaBO (MouseEvent event)throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AnamneseBo.fxml")));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
// Alertes
public void showAlert(Alert.AlertType type, String title, String message) {

    Alert alert = new Alert(type);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(message);

    
    File imageFile = null;
    
    ImageView imageView = new ImageView();
    // Charger l'icône en dehors des conditions
    if (type == Alert.AlertType.ERROR) {
         imageFile = new File("src\\main\\resources\\com\\cabinet\\Controller\\pics\\Erreur.png");
    } else if (type == Alert.AlertType.CONFIRMATION) {
         imageFile = new File("src\\main\\resources\\com\\cabinet\\Controller\\pics\\Confirmation.png");
     }else if (type == Alert.AlertType.INFORMATION) {
            imageFile = new File("src\\main\\resources\\com\\cabinet\\Controller\\pics\\information.png");
    }

    if (imageFile != null) {
        Image image = new Image(imageFile.toURI().toString());
        imageView.setImage(image);
        imageView.setFitWidth(48); // Définissez la largeur de l'icône
        imageView.setFitHeight(48); // Définissez la hauteur de l'icône
        alert.setGraphic(imageView);
    }

    DialogPane dialogPane = alert.getDialogPane();
Object obj =new Object();
    dialogPane.getStylesheets().add( getClass().getResource("style.css").toExternalForm());
    
    dialogPane.getStyleClass().add("my-alert");
    alert.showAndWait();
}
}