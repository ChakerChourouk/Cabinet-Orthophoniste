package com.cabinet.Model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RendezVous implements Comparable<RendezVous> {
    private String date ; 
    private String heure ; 
    
    private String infos ; 

    // Constructor
    public RendezVous(String date, String heure ,String infos)  {
        this.date = date;
        this.heure = heure;
        this.infos = infos; 
    }

    // Getter for date
    public String getDate() {
        return date;
    }

    // Setter for date
    public void setDate(String date) {
        this.date = date;
    }

    // Getter for heure
    public String getHeure() {
        return heure;
    }

    // Setter for heure
    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getInfos() {
        return infos;
    }

    // Setter for heure
    public void setInfo(String info) {
        this.infos = info;
    }

    @Override
    public int compareTo(RendezVous rd){
    // formattage
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    LocalDate localDate1 = LocalDate.parse(this.date, dateFormatter);
    LocalTime localTime1 = LocalTime.parse(this.heure, timeFormatter);
    LocalDateTime datetime1 = LocalDateTime.of(localDate1, localTime1);
     // conversion de la date et heure du rendez vous à comparer
     LocalDate localDate2 = LocalDate.parse(rd.getDate(), dateFormatter);
     LocalTime localTime2 = LocalTime.parse(rd.getHeure(), timeFormatter);
     LocalDateTime datetime2 = LocalDateTime.of(localDate2, localTime2);
return datetime1.compareTo(datetime2);

    }

}
