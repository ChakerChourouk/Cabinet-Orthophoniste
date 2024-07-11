package com.cabinet.Model;

public class Consultation extends RendezVous  {
   
    private String nom ; 
    private String prenom ; 
    private int age ; 
    private boolean adult;    

     // Constructeur
     public Consultation(String infos,String heure,String date,String nom, String prenom, int age,boolean adult) {
       super(date,heure, infos);
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adult=adult;
    }
   

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Setter pour le nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }
    public boolean getAdult(){
return this.adult;
    }
    // Getter pour le prénom
    public String getPrenom() {
        return prenom;
    }

    // Setter pour le prénom
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Getter pour l'âge
    public int getAge() {
        return age;
    }

    // Setter pour l'âge
    public void setAge(int age) {
        this.age = age;
    }
}
