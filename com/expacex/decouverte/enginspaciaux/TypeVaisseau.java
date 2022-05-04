package com.expacex.decouverte.enginspaciaux;

public enum TypeVaisseau {
    CHASSEUR ("Chasseur"), FREGATE("Fregate"), CROISEUR("Croiseur"), VAISSEAUMONDE("com.expacex.decouverte.enginspaciaux.Vaisseau-Monde"),
    CARGO ("CARGO");
    public String nom;
    TypeVaisseau(String nom){
           this.nom = nom;
    }

}
