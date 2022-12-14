package com.trainingsheet.My.training.Sheet.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
@Entity
@Table(name = "seances")
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Lob
    private String date = (new Date()).toString();

    @Lob
    private String discipline;

    @Lob
    private String image = "https://contents.mediadecathlon.com/s820187/k$2bae6afc58f7b29aee0eb4756bd40f31/800x0/3293pt2194/4388xcr4388/je-debute-la-musculation-par-quoi-commencer.jpg?format=auto&quality=80";

    @Lob
    private String exercices;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getExercices() {
        return exercices;
    }

    public void setExercices(String exercices) {
        this.exercices = exercices;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}