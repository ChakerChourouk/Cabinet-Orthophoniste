package com.cabinet.Model;

    public class Patient extends Personne {
        private String date; 
        private String lieuNaissance;
        private int numeroDossier;       
    
        
        public Patient(String nom, String prenom, String date, String lieuNaissance ,String addresse) {
            super(nom, prenom,addresse);
            this.date = date;
            this.lieuNaissance = lieuNaissance;
            
        }
    
        
        public String getDate() {
            return date;
        }
    
        
        public void setDate(String date) {
            this.date = date;
        }
    
        
        public String getLieuNaissance() {
            return lieuNaissance;
        }
    
        
        public void setLieuNaissance(String lieuNaissance) {
            this.lieuNaissance = lieuNaissance;
        }
    
   public int getNumeroDossier() {
       return numeroDossier;
   }
   public void setNumeroDossier(int numeroDossier) {
       this.numeroDossier = numeroDossier;
   }     
    
    
    
    }
    

