package com.cabinet.Model;

public class Question {
    private String enonce;
    private String categorie;

    public Question(String enonce, String categorie) {
        this.enonce = enonce;
        this.categorie = categorie;
    }

    // Getters et Setters
    public String getEnonce() { return enonce; }
    public void setEnonce(String enonce) { this.enonce = enonce; }

    public String getCategorie() { return categorie; }
    public void setCategorie(String categorie) { this.categorie = categorie; }
}
