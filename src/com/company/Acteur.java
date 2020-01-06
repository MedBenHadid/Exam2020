package com.company;

public class Acteur {
    private String nom;
    private String gender;
    private String nationalite;
    private  int age;
    private int anneCarriere;

    public Acteur(String nom, String gender, String nationalite, int age, int anneCarriere) {
        this.nom = nom;
        this.gender = gender;
        this.nationalite = nationalite;
        this.age = age;
        this.anneCarriere = anneCarriere;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAnneCarriere() {
        return anneCarriere;
    }

    public void setAnneCarriere(int anneCarriere) {
        this.anneCarriere = anneCarriere;
    }

    @Override
    public String toString() {
        return "Acteur{" +
                "nom='" + nom + '\'' +
                ", gender='" + gender + '\'' +
                ", nationalite='" + nationalite + '\'' +
                ", age=" + age +
                ", anneCarriere=" + anneCarriere +
                '}';
    }
}

