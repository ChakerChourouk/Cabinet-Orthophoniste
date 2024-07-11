package com.cabinet.Model;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.util.List;

public class GestionCabinetOrthophoniste {
  public List <Orthophoniste> listeOrthophonistes = new ArrayList<Orthophoniste>();
  public Set<RendezVous> listeRendezVous = new TreeSet<RendezVous>();
  public List<Patient> listePatients = new ArrayList<Patient>();
  public Set<Dossier> listeDossiers = new TreeSet<Dossier>();
    public List <Anamnese> listeAnamneses = new ArrayList<Anamnese>();
  public  Stage stageb;
  private int nombreComptesOrthophonistes;
  private int nombreAnamneses;
  // attr statiques
  public static Patient patient;
  public static Dossier dossier;
   public Bo bo=new Bo();
   public BoPremier premierbo=new BoPremier();
  public void ajouterOrthophoniste(Orthophoniste orthophoniste){
    this.listeOrthophonistes.add(orthophoniste);
    nombreComptesOrthophonistes ++;
}
public void ajouterPatient(Patient patient){
  this.listePatients.add(patient);
  System.out.println("check");

}

    public void ajouterAnamneses(Anamnese anamnese){
        this.listeAnamneses.add(anamnese);
        nombreAnamneses ++;
    }

    public int getNombreAnamneses() {
        return nombreAnamneses;
    }
public int getNombreComptesOrthophonistes() {
    return nombreComptesOrthophonistes;
}

public void ajouterRendezVous(RendezVous rd){
  this.listeRendezVous.add(rd);
}
public void ajouterDossier(Dossier d){
  this.listeDossiers.add(d);
}
public int genererNumeroDossier(){
  if(listePatients.size()==0){
 return 1;
  }else{
    return (listePatients.get(listePatients.size()-1).getNumeroDossier()+1);
  }
}
}
