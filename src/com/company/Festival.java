package com.company;

import java.util.*;

public class Festival {
    private String nom;
    private int numeroEdition;

    private Map<String, List<Spectacle>> programme;

    public Festival(String nom,int numeroEdition){
        this.nom=nom;
        this.numeroEdition=numeroEdition;
        this.programme = new HashMap<String, List<Spectacle>>() ;
    }

    public void ajouterProgramme(String date,Spectateur s){
        this.programme.computeIfAbsent( date, k -> new HashMap<>() ).add(s);


    }

    public List<Acteur> getAllFestivalActeurs(){

    }

    public void afficherProgresse(){

    }

}
