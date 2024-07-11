package com.cabinet.Controller;
import com.cabinet.Model.*;

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
import java.util.ArrayList;
import java.util.List;
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
public class FsuiviController implements Initializable {
private Stage stage;
private Patient p;
@FXML private TextField obj;
@FXML private TextField note;
@FXML private TextField num;
@FXML private ScrollPane scrollpane;



        // Existing code

        public List<Objectif> getObjectives() {
            List<Objectif> objectifs = new ArrayList<>();
            Iterator<Objectif> it = Main2Controller.gestion.dossier.objectifsCourants.iterator();
            while (it.hasNext()) {
                objectifs.add(it.next());
            }
            return objectifs;

        }

@Override
public void initialize(URL url, ResourceBundle resourceBundle) {

p=Main2Controller.gestion.patient; 
GridPane grid = new GridPane();
scrollpane.setContent(grid);
  grid.setHgap(10); 
grid.setVgap(10); 
int i=1;
// first row
Text text01 = new Text("Numero de l'objectif");
grid.add(text01,0,0);
Text text02 = new Text("Objectif");
grid.add(text02,1,0);
Text text03 = new Text("Type");
grid.add(text03,2,0);
Text text04 = new Text("Note");
grid.add(text04,3,0);
Iterator<Objectif> it = Main2Controller.gestion.dossier.objectifsCourants.iterator();
while(it.hasNext()){
Objectif obj = it.next();
Text text11 = new Text(""+i);
grid.add(text11,0,i);
Text text12 = new Text(obj.getNom());
grid.add(text12,1,i);

Text text13 = new Text(obj.getType().toString());
grid.add(text13,2,i);

Text text14 = new Text(Float.toString(obj.getNote()));
grid.add(text14,3,i);
i++;
}
}
public void switchBackToMain2(MouseEvent event)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Profils_Main.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchBackToChoixSuivi(MouseEvent event)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ChoixSuivi.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
@FXML private TextField type;
public void ajouterrObjectif(ActionEvent event){
    TypeObjectif t=null ;
    if(type.getText().equals("LongTerme")){
        t= TypeObjectif.LONG_TERME;
    }else if(type.getText().equals("MoyenTerme")){
        t= TypeObjectif.MOYEN_TERME;
    }else if(type.getText().equals("CourtTerme")){
        t= TypeObjectif.COURT_TERME;
    }
Objectif objectif = new Objectif(obj.getText(), t);
Main2Controller.gestion.dossier.ajouterrObjectif(objectif);
}
public void attribuerNote(ActionEvent event ){
int s = Integer.parseInt(num.getText());
int i=0;
Iterator <Objectif> it = Main2Controller.gestion.dossier.objectifsCourants.iterator();
while(it.hasNext()){
    if(i==s-1){
        it.next().setNote(Integer.parseInt(note.getText()));
    }else{
        it.next();
        i++;
    }
}
}
public void actualiser(ActionEvent event){
    initialize(null, null);
}
}

