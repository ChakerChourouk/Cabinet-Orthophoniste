package com.cabinet.Model;

/**
 * Classe représentant un adulte, héritant de la classe Patient.
 */

 public class Adulte extends Patient {
    private String diplome ; 
    private String profession ; 
    private long numPersonel ; 


    /**
     * Constructeur de la classe Adulte.
     * 
     * @param nom           Le nom de l'adulte.
     * @param prenom        Le prénom de l'adulte.
     * @param date          La date de naissance de l'adulte.
     * @param lieuNaissance Le lieu de naissance de l'adulte.
     * @param addresse      L'adresse de l'adulte.
     * @param diplome       Le diplôme de l'adulte.
     * @param profession    La profession de l'adulte.
     * @param numPersonel   Le numéro personnel de l'adulte.
     */
     
     public Adulte(String nom, String prenom, String date, String lieuNaissance ,String addresse, String diplome, String profession, long numPersonel) {
        super(nom, prenom, date, lieuNaissance ,addresse);
        this.diplome = diplome;
        this.profession = profession;
        this.numPersonel = numPersonel;
    }

    
    /**
     * Getter pour le diplôme de l'adulte.
     * 
     * @return Le diplôme de l'adulte.
     */

    public String getDiplome() {
        return diplome;
    }



    /**
     * Setter pour le diplôme de l'adulte.
     * 
     * @param diplome Le diplôme à définir pour l'adulte.
     */
    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }
   
   
   
    /**
     * Getter pour la profession de l'adulte.
     * 
     * @return La profession de l'adulte.
     */
    
    public String getProfession() {
        return profession;
    }
    
    
    
    /**
     * Setter pour la profession de l'adulte.
     * 
     * @param profession La profession à définir pour l'adulte.
     */

    public void setProfession(String profession) {
        this.profession = profession;
    }

    
    /**
     * Getter pour le numéro personnel de l'adulte.
     * 
     * @return Le numéro personnel de l'adulte.
     */

    public long getNumPersonel() {
        return numPersonel;
    }



    /**
     * Setter pour le numéro personnel de l'adulte.
     * 
     * @param numPersonel Le numéro personnel à définir pour l'adulte.
     */
    public void setNumPersonel(long numPersonel) {
        this.numPersonel = numPersonel;
    }
}
