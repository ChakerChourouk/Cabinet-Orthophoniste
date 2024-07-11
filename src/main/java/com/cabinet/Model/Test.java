/*package com.cabinet.Model;

public class Test {
    private String nom;
    private String typeTest;// not sure to add it
    private int capacite;

    // Constructor
    public Test(String nom, int capacite) {
        this.nom = nom;
        this.capacite = capacite;
    }

    // Getter for nom
    public String getNom() {
        return nom;
    }

    // Setter for nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter for capacite
    public int getCapacite() {
        return capacite;
    }

    // Setter for capacite
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
*/

package com.cabinet.Model;

public class Test {
    private String nom;
    //private String typeTest;
    private int capacite;

    // Constructor with all three parameters
    public Test(String nom,  int capacite) {
        this.nom = nom;
        //this.typeTest = typeTest;
        this.capacite = capacite;
    }

    // Getter for nom
    public String getNom() {
        return nom;
    }

    // Setter for nom
    public void setNom(String nom) {
        this.nom = nom;
    }


    // Getter for capacite
    public int getCapacite() {
        return capacite;
    }

    // Setter for capacite
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
