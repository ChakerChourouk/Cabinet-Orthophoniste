package com.cabinet.Controller;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.cabinet.Model.*;
import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;
import javafx.scene.text.Text;
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
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.PasswordField;
import javafx.fxml.FXML;

public class DiagnosticController {
private Stage stage;
@FXML TextArea prj;
@FXML ComboBox catComboBox;

 @FXML ScrollPane scroll;
 
 List<Integer> lint = new ArrayList<Integer>();

    public static int nbr1 = 0;
    public static int nbr2 = 0;
    public static int nbr3 = 0;
 VBox vbox = new VBox();
    public void initialize() {
        StackPane stack =new StackPane();
        Text text = new Text("                            Troubles                          ");
        stack.getChildren().add(text);
        vbox.getChildren().add(stack);
      scroll.setContent(vbox);

    }
    public void  finBo(ActionEvent event) throws Exception{
       

     Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Profils_Main.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show(); 
    }

public void switchBackToEC(MouseEvent event ) throws Exception{
Parent root = FXMLLoader.load(getClass().getResource("Ec.fxml"));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
@FXML TextField tr;
public void ajouterTrouble(ActionEvent event){

Text text = new Text(tr.getText());
Trouble trouble = new Trouble(tr.getText(), null);
Main2Controller.gestion.premierbo.ajouterTrouble(trouble);
Main2Controller.gestion.bo.ajouterTrouble(trouble);
StackPane stack = new StackPane();
stack.getChildren().add(text);
vbox.getChildren().add(stack);
    if (tr.getText().equals("Trouble neuro-développentaux")) {
        nbr1++;
    } else if (tr.getText().equals("Trouble de la déglutition")) {
        nbr2++;
    } else if (tr.getText().equals("Trouble cognitif")) {
        nbr3++;
    }
}

    public void switchToEc(ActionEvent event)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Ec.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    public static int getNbr1() {
        return nbr1;
    }

    public static int getNbr2() {
        return nbr2;
    }

    public static int getNbr3() {
        return nbr3;
    }
}