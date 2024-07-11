package com.cabinet.Model;


import java.util.HashSet;
import java.util.Set;

public class Atelier extends RendezVous {
    // Champ thematique de type String
    private String thematique;

    // Champ numDossier de type HashSet
    private Set<Integer> numDossier;
    

    /**
     * Constructeur de la classe Atelier.
     * 
     * @param thematique La thématique de l'atelier.
     * @param numDossier L'ensemble des numéros de dossier de l'atelier.
     */

    public Atelier(String thematique , String date,String heure,String infos) {
        super(date,heure,infos);
        this.thematique = thematique;
        this.numDossier = new HashSet<Integer>();
    }


    /**
     * Méthode pour ajouter un numéro de dossier à l'atelier.
     * 
     * @param numero Le numéro de dossier à ajouter.
     */
    public void ajouterNumDossier(int numero) {
        numDossier.add(numero);
    }


    /**
     * Méthode pour supprimer un numéro de dossier de l'atelier.
     * 
     * @param numero Le numéro de dossier à supprimer.
     */    
    public void supprimerNumDossier(int numero) {
        numDossier.remove(numero);
    }
    
    
    /**
     * Méthode pour vérifier si un numéro de dossier existe dans l'atelier.
     * 
     * @param numero Le numéro de dossier à vérifier.
     * @return true si le numéro de dossier existe, sinon false.
     */



     public boolean existeNumDossier(int numero) {
        return numDossier.contains(numero);
    }

     /**
     * Méthode pour obtenir le nombre total de dossiers dans l'atelier.
     * 
     * @return Le nombre total de dossiers dans l'atelier.
     */


    public int nombreTotalDossiers() {
        return numDossier.size();
    }

    /**
     * Méthode pour obtenir tous les numéros de dossier de l'atelier.
     * 
     * @return L'ensemble des numéros de dossier de l'atelier.
     */

    public Set<Integer> getNumDossiers() {
        return numDossier;
    }


    /**
     * Méthode pour obtenir la thématique de l'atelier.
     * 
     * @return La thématique de l'atelier.
     */

    public String getThematique() {
        return thematique;
    }

    /**
     * Méthode pour modifier la thématique de l'atelier.
     * 
     * @param thematique La nouvelle thématique de l'atelier.
     */
    public void setThematique(String thematique) {
        this.thematique = thematique;
    }
}
