package com.expacex.decouverte.enginspaciaux;

public abstract class Vaisseau
{
    public TypeVaisseau type;
    public int nbPassager;
    public int blindage;
    public int resistanceDuBouclier;
    public int tonnageMax;
    protected int tonnageActuel;


    void activerBouclier()
    {
        System.out.println("Activation du bouclier de vaisseau de type "+type);
    }

    void DesactiverBouclier()
    {
        System.out.println("Desactivation du bouclier de vaisseau de type "+type);
    }

    public abstract int emporterCargaison(int cargaison);



}
