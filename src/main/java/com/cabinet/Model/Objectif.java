package com.cabinet.Model;
public class Objectif {
    private String nom ; 
    private TypeObjectif type ; 
    private int note;

    
    public Objectif(String nom, TypeObjectif type) {
        this.nom = nom;
        this.type = type;
    }

   
    public String getNom() {
        return nom;
    }

    
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    public TypeObjectif getType() {
        return type;
    }

    
    public void setType(TypeObjectif type) {
        this.type = type;
    }
    public void setNote(int note) {
        this.note = note;
    }
    public int getNote() {
        return note;
    }

}
