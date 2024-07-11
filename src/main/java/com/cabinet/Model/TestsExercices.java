package com.cabinet.Model;

public class TestsExercices extends Test {
    private String consigne;// consignes por la serie ou consigne pour chaque exercices
    private boolean besoinMateriel;
    private String nomMateriel;


    // Constructor
    public TestsExercices(String nom,int capacite, String consigne, boolean besoinMateriel, String nomMateriel) {
        super(nom, capacite);
        this.consigne = consigne;
        this.besoinMateriel = besoinMateriel;
        this.nomMateriel = nomMateriel;
    }

    // Getter for consigne
    public String getConsigne() {
        return consigne;
    }

    // Setter for consigne
    public void setConsigne(String consigne) {
        this.consigne = consigne;
    }

    // Getter for besoinMateriel
    public boolean isBesoinMateriel() {
        return besoinMateriel;
    }

    // Setter for besoinMateriel
    public void setBesoinMateriel(boolean besoinMateriel) {
        this.besoinMateriel = besoinMateriel;
    }

    // Getter for nomMateriel
    public String getNomMateriel() {
        return nomMateriel;
    }

    // Setter for nomMateriel
    public void setNomMateriel(String nomMateriel) {
        this.nomMateriel = nomMateriel;
    }
}
