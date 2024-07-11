package com.cabinet.Model;

import java.util.HashSet;
import java.util.Set;

public class TestsQuestionnaires extends Test {
    private Set<String> serieQuestions;

    // Constructor
    public TestsQuestionnaires(String nom,int capacite) {
        super(nom,capacite);
        serieQuestions = new HashSet<>();
    }

    // Méthode pour ajouter un type de question à l'ensemble
    public void ajouterQuestion(String Question) {
        serieQuestions.add(Question);
    }

    // Méthode pour supprimer un type de question de l'ensemble
    public void supprimerQuestion(String question) {
        serieQuestions.remove(question);
    }


    // Méthode pour modifier un type de question dans l'ensemble
    public void modifierQuestion(String ancienneQuestion, String nouvelleQuestion) {
        if (serieQuestions.contains(ancienneQuestion)) {
            serieQuestions.remove(ancienneQuestion);
            serieQuestions.add(nouvelleQuestion);
        } else {
            System.out.println("La question à modifier n'existe pas dans la série de questions.");
        }
    }



    // Méthode pour obtenir l'ensemble des types de questions
    public Set<String> getSerieQuestions() {
        return serieQuestions;
    }

    // Méthode pour définir l'ensemble des types de questions
    public void setSerieQuestions(Set<String> setSerieQuestions) {
        this.serieQuestions = setSerieQuestions;
    }
}
