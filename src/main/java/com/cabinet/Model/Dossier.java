package com.cabinet.Model;
import java.util.ArrayList;
import java.util.List;
import java.lang.Comparable;

public class Dossier implements Comparable<Dossier> {
private int numeroDossier;
 public List <Objectif> objectifsCourants = new ArrayList<Objectif>()   ;
 FSuivi fSuivi = new FSuivi(); // moyenne des objectifs passés
 public List<Bo> listeBo = new ArrayList<Bo>();
public int getNumeroDossier() {
    return numeroDossier;
}
public void setNumeroDossier(int numeroDossier) {
    this.numeroDossier = numeroDossier;
}
@Override
public int compareTo(Dossier d) {
   return ((Integer)this.numeroDossier).compareTo(((Integer)d.getNumeroDossier()));
}
public void ajouterrObjectif(Objectif obj){
this.objectifsCourants.add(obj);
}
public void ajouterBo(Bo bo){
    this.listeBo.add(bo);
}

}
