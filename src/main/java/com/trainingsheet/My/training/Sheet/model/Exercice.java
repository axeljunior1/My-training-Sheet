package com.trainingsheet.My.training.Sheet.model;


import jakarta.persistence.*;
import lombok.Data;
//
//@Data
//@Entity
//@Table(name = "exercices")
public class Exercice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    private String nom ;
    private String discipline_exercice;
    private String description;
    private String Outils;
    private String Nombre_de_serie;
    private int Masse ;
    private int num_km;
    private int vitesse_moyenne;
    private int duree;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDiscipline_exercice() {
        return discipline_exercice;
    }

    public void setDiscipline_exercice(String discipline_exercice) {
        this.discipline_exercice = discipline_exercice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOutils() {
        return Outils;
    }

    public void setOutils(String outils) {
        Outils = outils;
    }

    public String getNombre_de_serie() {
        return Nombre_de_serie;
    }

    public void setNombre_de_serie(String nombre_de_serie) {
        Nombre_de_serie = nombre_de_serie;
    }

    public int getMasse() {
        return Masse;
    }

    public void setMasse(int masse) {
        Masse = masse;
    }

    public int getNum_km() {
        return num_km;
    }

    public void setNum_km(int num_km) {
        this.num_km = num_km;
    }

    public int getVitesse_moyenne() {
        return vitesse_moyenne;
    }

    public void setVitesse_moyenne(int vitesse_moyenne) {
        this.vitesse_moyenne = vitesse_moyenne;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
}
