package com.expacex.decouverte.enginspaciaux;
import static com.expacex.decouverte.enginspaciaux.TypeVaisseau.CHASSEUR;
import static com.expacex.decouverte.enginspaciaux.TypeVaisseau.VAISSEAUMONDE;

public class VaisseauCivil extends Vaisseau
{
    public VaisseauCivil (TypeVaisseau type) {
        super(type);
        if (type==CHASSEUR) {
            tonnageMax = 500;
        }
        else if (type==VAISSEAUMONDE) {
            tonnageMax=2000;
        }
    }

    @Override
    public void emporterCargaison(int cargaison) throws DepassementTonnageException{
        int tonnageRestant=tonnageMax-tonnageActuel;
        if (cargaison>tonnageRestant){
            int tonnageEnExces = cargaison-tonnageRestant;
            throw new DepassementTonnageException(tonnageEnExces);
        }
        else{
            tonnageActuel=tonnageActuel+cargaison;

        }

    }
}
