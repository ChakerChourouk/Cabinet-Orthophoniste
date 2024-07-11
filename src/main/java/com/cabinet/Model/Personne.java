package com.cabinet.Model;

public class Personne {
    private String nom ; 
    private String prenom ; 
    private String adresse;
    // Constructor
    public Personne(String nom, String prenom,String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse =adresse;
    }

    // Getter for nom
    public String getNom() {
        return nom;
    }

    // Setter for nom
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresse() {
        return adresse;
    }

    // Getter for prenom
    public String getPrenom() {
        return prenom;
    }

    // Setter for prenom
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
