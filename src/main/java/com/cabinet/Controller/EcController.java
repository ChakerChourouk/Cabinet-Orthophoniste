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
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.PasswordField;
import javafx.fxml.FXML;

public class EcController {
    private Stage stage;

 @FXML TextField note;
 @FXML ScrollPane scroll;
 List<Integer> lint = new ArrayList<Integer>();
 VBox vbox = new VBox();
    public void initialize() {
        
        StackPane stack =new StackPane();
        Text text = new Text("                              Notes                          ");
        stack.getChildren().add(text);
        vbox.getChildren().add(stack);
      scroll.setContent(vbox);

    }
    public void  suivantEc(ActionEvent event) throws Exception{
        //calcul de moyenne
        Iterator<Integer> it = lint.iterator();
        int moy=0;
        while(it.hasNext()){
            moy= moy+it.next();
        }
        moy=(Integer)moy/lint.size();
        Main2Controller.gestion.premierbo.setMoy(moy);
        Main2Controller.gestion.bo.setMoy(moy);

         Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Diagnostic.fxml")));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show(); 
    }

public void switchBackToMain(MouseEvent event ) throws Exception{
Parent root = FXMLLoader.load(getClass().getResource("Profils_Main.fxml"));
    Scene scene = new Scene(root);
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}



    public void switchBackToBO(MouseEvent event ) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Bo.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
public void ajouterNote(ActionEvent event){
lint.add(Integer.parseInt(note.getText()));
Text text = new Text(note.getText()+"/10");
StackPane stack = new StackPane();
stack.getChildren().add(text);
vbox.getChildren().add(stack);
}
}