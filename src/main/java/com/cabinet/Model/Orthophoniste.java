package com.cabinet.Model;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;

public class Orthophoniste extends Personne{
   private long numTel ; 
   private String addresseMail ; 
   private String motDePasse ;

   // Constructor
   public Orthophoniste(String nom, String prenom, long numTel, String addresseMail, String motDePasse,String adresse) {
    super(nom, prenom,adresse);
    this.numTel = numTel;
    this.addresseMail = addresseMail;
    this.motDePasse = motDePasse;
}


// Getter for numTel
public long getNumTel() {
    return numTel;
}

// Setter for numTel
public void setNumTel(long numTel) {
    this.numTel = numTel;
}

// Getter for adresseMail
public String getAddresseMail() {
    return addresseMail;
}
@Override
public String getAdresse() {
    
    return super.getAdresse();
}

@Override
public void setAdresse(String adresse) {
    super.setAdresse(adresse);
}
// Setter for adresseMail
public void setAddresseMail(String addresseMail) {
    this.addresseMail = addresseMail;
}

// Getter for motDePasse
public String getMotDePasse() {
    return motDePasse;
}

// Setter for motDePasse
public void setMotDePasse(String motDePasse) {
    this.motDePasse = motDePasse;
}

/* 
public RendezVous programmerRendezVous(String date, String heure, String infos) {
   
    return new RendezVous(date, heure, infos); // zidi type , durée 
}

public Consultation programmerConsultation() {
    return new Consultation(); 
}
*/
    /* 
    public static Suivi programmerSuivi(int numDossier, boolean presentiel) {
        List<Integer> dossier = new ArrayList<>();
        dossier.add(numDossier);
       return new Suivi(dossier, presentiel);
    }*/

     
    /* 
    public Atelier programmerAtelier(String thematique, Set<Integer> numDossiers) {
        Atelier atelier = new  Atelier(thematique, numDossiers);
        return atelier;
    }*/
    
    public String redigerConclusion(String conclusion) {
        return conclusion; 
    }

    public String redigerObservation(String observation) {
        return observation; 
    }
      




}
