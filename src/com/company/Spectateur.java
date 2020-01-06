package com.company;

import java.util.Objects;

public class Spectateur {
    private String nom,gendre;
    private int age,cin;

    public Spectateur(String nom, String gendre, int age, int cin) {
        this.nom = nom;
        this.gendre = gendre;
        this.age = age;
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGendre() {
        return gendre;
    }

    public void setGendre(String gendre) {
        this.gendre = gendre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spectateur that = (Spectateur) o;
        return cin == that.cin;
    }



    public String toString(){

        return super.toString()+" Spectateur = Nom : "+getNom()+" gender :"+getGendre()+" CIN : "+getCin()+" Age : "+getAge();
}
}
