package com.cabinet.Controller;

import com.cabinet.Model.Objectif;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class HomePageController {


   // private Label currentTimeLabel;


   // private ListView<String> agendaListView;

    @FXML
    private PieChart patientsPieChart;

    @FXML
    private LineChart<String, Number> patientsLineChart;

    @FXML
    private BarChart<String, Number> objectivesBarChart;

    private Stage stage;

    @FXML
    private void initialize() {
        // Mise à jour de l'heure locale toutes les secondes
        /*Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            currentTimeLabel.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Timeline.INDEFINITE);
        clock.play();

        // Données d'exemple pour l'agenda
        agendaListView.setItems(FXCollections.observableArrayList(
                "09:00 - Réunion avec le patient A",
                "10:30 - Séance avec le patient B",
                "14:00 - Consultation avec le patient C"
        ));*/

        // Données d'exemple pour le PieChart
        patientsPieChart.setData(FXCollections.observableArrayList(
                new PieChart.Data("Trouble neuro-développentaux",  DiagnosticController.nbr1),
                new PieChart.Data("Trouble de la déglutition",  DiagnosticController.nbr2),
                new PieChart.Data("Trouble cognitif",  DiagnosticController.nbr3)
                //new PieChart.Data("Autre", 10)
        ));

        // Données d'exemple pour le LineChart
        /*XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("Trouble neuro-développentaux");
        series1.getData().add(new XYChart.Data<>("Jan", 10));
        series1.getData().add(new XYChart.Data<>("Feb", 15));
        series1.getData().add(new XYChart.Data<>("Mar", 20));
        series1.getData().add(new XYChart.Data<>("Apr", 25));

        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName("Trouble de la déglutition");
        series2.getData().add(new XYChart.Data<>("Jan", 8));
        series2.getData().add(new XYChart.Data<>("Feb", 12));
        series2.getData().add(new XYChart.Data<>("Mar", 18));
        series2.getData().add(new XYChart.Data<>("Apr", 22));

        XYChart.Series<String, Number> series3 = new XYChart.Series<>();
        series3.setName("Trouble cognitif");
        series3.getData().add(new XYChart.Data<>("Jan", 12));
        series3.getData().add(new XYChart.Data<>("Feb", 13));
        series3.getData().add(new XYChart.Data<>("Mar", 20));
        series3.getData().add(new XYChart.Data<>("Apr", 25));

        patientsLineChart.getData().addAll(series1, series2 ,series3);*/


        // Initialize BarChart
        objectivesBarChart.setTitle("Objectives and Notes");
        CategoryAxis xAxis = (CategoryAxis) objectivesBarChart.getXAxis();
        xAxis.setLabel("Objectives");
        NumberAxis yAxis = (NumberAxis) objectivesBarChart.getYAxis();
        yAxis.setLabel("Notes");

        populateBarChart();

    }

    private void populateBarChart() {
        // Example data fetching from FSuiviController
        FsuiviController fsuiviController = new FsuiviController();
        List<Objectif> objectifs = fsuiviController.getObjectives();

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Notes per Objective");

        for (Objectif obj : objectifs) {
            series.getData().add(new XYChart.Data<>(obj.getNom(), obj.getNote()));
        }

        objectivesBarChart.getData().add(series);
    }


    public void switchToScenehome(MouseEvent event) throws Exception {
        //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Form_Anamnese.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("Profils_Main.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
