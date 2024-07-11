package com.cabinet.Model;

public class Trouble {
    private String nom;
    private CategorieTrouble categorie;

    // Constructor
    public Trouble(String nom, CategorieTrouble categorie) {
        this.nom = nom;
        this.categorie = categorie;
    }

    // Getter for nom
    public String getNom() {
        return nom;
    }

    // Setter for nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter for categorie
    public CategorieTrouble getCategorie() {
        return categorie;
    }

    // Setter for categorie
    public void setCategorie(CategorieTrouble categorie) {
        this.categorie = categorie;
    }
}
