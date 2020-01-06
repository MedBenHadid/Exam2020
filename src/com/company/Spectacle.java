package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Spectacle {
    private String nom;
    private final int nbrPlace;
    private long duree;
    private List<Spectateur> spectateurs;
    private List<Acteur> acteurs;

    public Spectacle(String nom, int nbrPlace, long duree, List<Spectateur> spectateurs) {
        this.nom = nom;
        this.nbrPlace = nbrPlace;
        this.duree = duree;
        this.spectateurs = new ArrayList<Spectateur>();
        this.acteurs = new ArrayList<Acteur>();
    }

    public void ajouterSpectateur(Spectateur sp){
        if(this.spectateurs.size()<this.nbrPlace){
            this.spectateurs.add(sp);
        }else{
            System.out.println("Tab MAX NBR");
        }
    }

    public void ajouterActeur(Acteur ac) throws ActeurException{
        if(this.acteurs.contains(ac)){
            throw new ActeurException();
        }else{
            this.acteurs.add(ac)   ;
        }
    }

    public void trierSpectateurParCin(){
        this.spectateurs.stream().sorted((s1, s2) -> s1.getCin()-s2.getCin());

    }
    public void afficherSpectateurtrieeParNom(){
        this.spectateurs.stream().sorted(Comparator.comparing(Spectateur::getNom)).forEach(System.out::println);
    }

    public double getNombreVip(String typeVip){
        return this.spectateurs.stream().filter(s -> s.getClass().equals(Vip.class)).filter(spectateurVIP -> ((Vip) spectateurVIP).getTypes().equals(typeVip)).count();
    }

    public double getMoyenneAgeSpectateur(){
        return spectateurs.stream().mapToInt(s -> s.getAge()).average().getAsDouble();
    }
}

