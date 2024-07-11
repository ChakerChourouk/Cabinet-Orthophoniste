package com.cabinet.Model;

import java.util.List;

public class Anamnese {
    private String nomAnamnese ;
    private String  Enfant ;

    private List<String> questionsListView; // Ajout de l'attribut

    private String QuestionLibre ;
    private String   Categorie;


    /* public Anamnese(String nomAnamnese, String Enfant, String QuestionLibre , String Categorie) {
         this.nomAnamnese = nomAnamnese;
         this.Enfant = Enfant;
         //this.questions = questions;
         this.QuestionLibre = QuestionLibre ;
         this.Categorie = Categorie ;
     }*/
    public Anamnese(String nomAnamnese, String enfant, String questionLibre, String categorie, List<String> questionsListView) {
        this.nomAnamnese = nomAnamnese;
        this.Enfant = Enfant;
        //this.questions = questions;
        this.QuestionLibre = QuestionLibre ;
        this.Categorie = Categorie ;
        this.questionsListView = questionsListView; // Initialisation de l'attribut
    }

    public String getNomAnamnese() {
        return nomAnamnese;
    }
    public void setNomAnamnese(String nomAnamnese) {
        this.nomAnamnese = nomAnamnese;
    }
    public String getEnfant() {
        return Enfant;
    }
    public String getCategorie() {
        return Categorie;
    }
    public void setCategorie(String categorie) {
        Categorie = categorie;
    }
    public String getIsEnfant() {
        return Enfant;
    }
    public void setEnfant(String enfant) { Enfant = enfant; }

    public String getQuestionLibre() {
        return QuestionLibre;
    }



    /*public List<Question> getQuestions() { return questions; }
    public void setQuestions(List<Question> questions) { this.questions = questions; }*/
}
