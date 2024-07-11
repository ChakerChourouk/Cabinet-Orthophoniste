package com.cabinet.Controller;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.PasswordField;
import javafx.fxml.FXML;
import java.util.ArrayList;
import javafx.scene.Node;

import java.util.List;
import com.cabinet.Model.*;
import java.util.Objects;

public class MainController extends Application {
  

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Profils_Main.fxml")));

       stage.setTitle("Cabinet d'orthophoniste");
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
        stage.show();
        

    }


    public static void main(String[] args) {
        launch(args);
    }
}
