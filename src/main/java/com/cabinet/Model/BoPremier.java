package com.cabinet.Model;

public class BoPremier extends Bo {
    private String nomAnamnese;
    public BoPremier(String nomAnamnese,float moy,String pt){
        super(moy,pt);
        this.nomAnamnese = nomAnamnese;
    }
    public String getNomAnamnese() {
        return nomAnamnese;
    }
    public void setNomAnamnese(String nomAnamnese) {
        this.nomAnamnese = nomAnamnese;
    }
    public BoPremier(){}
}
