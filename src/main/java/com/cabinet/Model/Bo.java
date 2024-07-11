package com.cabinet.Model;

import java.util.ArrayList;
import java.util.List;
public class Bo {
  
  private float moy;
    public  List<Trouble> listeTroubles = new ArrayList<Trouble>();
String projetTherapeutique;

public Bo(float moy,String pt){
this.moy=moy;
this.projetTherapeutique=pt;
}
public Bo(){

}



    public float getMoy() {
    return moy;
}
public void setMoy(float moy) {
    this.moy = moy;
}

public void setProjetTherapeutique(String projetTherapeutique) {
    this.projetTherapeutique = projetTherapeutique;
}
public String getProjetTherapeutique() {
    return projetTherapeutique;
}
public void ajouterTrouble(Trouble tr){
    this.listeTroubles.add(tr);
}
}
