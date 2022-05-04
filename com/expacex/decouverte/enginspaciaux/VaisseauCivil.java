package com.expacex.decouverte.enginspaciaux;

public class VaisseauCivil extends Vaisseau
{
    public VaisseauCivil (TypeVaisseau type)
    {
        this.type=type;
        if (type==TypeVaisseau.CHASSEUR) {
            tonnageMax = 500;
        }
        else if (type==TypeVaisseau.VAISSEAUMONDE) {
            tonnageMax=2000;
        }
    }

    @Override
    public int emporterCargaison(int cargaison) {
        int tonnageRestant=tonnageMax-tonnageActuel;
        if (cargaison>tonnageRestant){
            tonnageActuel=tonnageMax;
            return cargaison-tonnageRestant;
        }
        else{
            tonnageActuel=tonnageActuel+cargaison;
            return 0;
        }

    }
}
