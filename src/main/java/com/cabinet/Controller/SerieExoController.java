
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


public class SerieExoController {
    @FXML private TextField consigne;

    @FXML private TextArea nomMateriel;
    //@FXML private ListView<String> questionsListView;

    private Stage stage;

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
