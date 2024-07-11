package com.cabinet.Model;

import java.util.ArrayList;
import java.util.List;

public class Suivi extends RendezVous {
// Champ numDossier de type List<Integer>
    private int  numDossier;

    private boolean presentiel;
   

    // Constructeur sans paramètre
    public Suivi(int numDossier,  boolean presentiel,String date,String heure,String infos) {
        super(date, heure,infos);
        this.numDossier = numDossier;
        this.presentiel = presentiel;
    }

    // Getter pour numDossier
    public int  getNumDossier() {
        return numDossier;
    }

    // Setter pour numDossier
    public void setNumDossier(int  numDossier) {
        this.numDossier = numDossier;
    }

    // Ajouter un numéro de dossier à la liste
   

    // Supprimer un numéro de dossier de la liste
  

    // Vérifier si un numéro de dossier existe dans la liste


    // Getter pour presentiel
    public boolean isPresentiel() {
        return presentiel;
    }

    // Setter pour presentiel
    public void setPresentiel(boolean presentiel) {
        this.presentiel = presentiel;
    }
}
