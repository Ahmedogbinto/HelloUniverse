package com.expacex.decouverte.objetastraux;

public abstract class Planete implements Comparable
{
    public String nom;
    public String matiere;
    public int diametre;
    int nbTotalHumain;
    public Atmosphere atmosphere;

    public float distaneEtoile;
    static String forme="spherique";
    static int nbplaneteDecouverte;

    Planete(String nom)
    {
        this.nom= nom;
        nbplaneteDecouverte++;
    }

    static String expansion(double distance)
    {
        if (distance<14)
        {
            return "Oh la la c<est super rapide";
        }
        else
        {
            return "Je reve ou cest plus rapide que la lumiere";
        }

    }





}

