package com.company;

public class Vip extends Spectateur {
    private final String[] types={"presse" ,"abonné","politique","invité"};
    private String theType = "NS";
    private int numeroBadge;
    public Vip(String nom, String gendre, int age, int cin,int numeroBadge,String theType) {
        super(nom, gendre, age, cin);
        this.numeroBadge=numeroBadge;
         if (this.isTypeCorrect(theType)){
             this.theType=theType;
         }
    }
    public String[] getTypes() {
        return types;
    }

    public String getTheType() {
        return theType;
    }

    public void setTheType(String theType) {
        this.theType = theType;
    }

    public int getNumeroBadge() {
        return numeroBadge;
    }

    public void setNumeroBadge(int numeroBadge) {
        this.numeroBadge = numeroBadge;
    }
    public boolean isTypeCorrect(String theType){
         boolean test=false;
         for(String s:types){
             if (s.equals(theType)) {
                 test=true;
             }
         }
         return test;
    }
public String toString(){
        return "VIP : {"+this.getNom()+"}";
}
}
