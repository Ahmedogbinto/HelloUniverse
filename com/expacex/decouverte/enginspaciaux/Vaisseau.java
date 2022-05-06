package com.expacex.decouverte.enginspaciaux;

public abstract class Vaisseau
{
    public final TypeVaisseau type;
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

    public abstract void emporterCargaison(int cargaison) throws DepassementTonnageException;


    public Vaisseau(TypeVaisseau type) {
        this.type = type;
    }


}
