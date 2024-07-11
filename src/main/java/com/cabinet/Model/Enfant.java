package com.cabinet.Model;

public class Enfant extends Patient {
    private String classeEtude ; 
    private long numTelParents; 

    
    public Enfant(String nom, String prenom, String date, String lieuNaissance ,String addresse, String classeEtude, long numTelParents) {
        super(nom, prenom, date, lieuNaissance, addresse);
        this.classeEtude = classeEtude;
        this.numTelParents = numTelParents;
    }

    
    public String getClasseEtude() {
        return classeEtude;
    }

    
    public void setClasseEtude(String classeEtude) {
        this.classeEtude = classeEtude;
    }

    
    public long getNumTelParents() {
        return numTelParents;
    }

    
    public void setNumTelParents(long numTelParents) {
        this.numTelParents = numTelParents;
    }
    

}