package com.expacex.decouverte.objetastraux;

import com.expacex.decouverte.enginspaciaux.Vaisseau;

public class PlaneteGazeuse extends Planete implements Habitable
{

    public PlaneteGazeuse(String nom) {
        super(nom);
    }


    @Override
    public void accueillirVaisseaux(Vaisseau... nouveauvaisseau) {

    }

    @Override
    public int compareTo(Object o) {
        Planete autrePlanete = (Planete)o;
        return ((Float)distaneEtoile).compareTo(autrePlanete.distaneEtoile);
    }
}
