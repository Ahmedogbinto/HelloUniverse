package com.expacex.decouverte.enginspaciaux;
import static com.expacex.decouverte.enginspaciaux.TypeVaisseau.CHASSEUR;
import static com.expacex.decouverte.enginspaciaux.TypeVaisseau.FREGATE;
import static com.expacex.decouverte.enginspaciaux.TypeVaisseau.CROISEUR;

public class VaisseauDeGuerre extends Vaisseau
{
    private boolean armesDesactivees;

    public VaisseauDeGuerre (TypeVaisseau type) {
        super (type);
        if (type==CHASSEUR) {
            tonnageMax = 0;
        }
        else if (type==FREGATE) {
            tonnageMax=50;
        }
        else if (type==CROISEUR) {
            tonnageMax=100;
        }
    }
    void attaquer(Vaisseau vaisseauAttaque, String armeUtilisee, int dureeDeLattaque) {
        if (armesDesactivees) {
            System.out.println("Attaque impossible, armement desactivee");
        } else {
            System.out.println("Un vaisseau de type " + type + " attaque un autre vaisseayu de type " + type + " en utilisant une arme de type " + armeUtilisee + " pendant " + dureeDeLattaque + " minutes");
            vaisseauAttaque.resistanceDuBouclier = 0;
            vaisseauAttaque.blindage = vaisseauAttaque.blindage / 2;
        }
    }
        public void desactiverArmes()
        {
            System.out.println("Desactivation dun vaisseau de type "+type);
            armesDesactivees = true;
        }

        public void armesDesactivees(){
        armesDesactivees = false;
        }
        void activerBouclier()
        {
            desactiverArmes();
            super.activerBouclier();
        }

    @Override
    public void emporterCargaison(int cargaison) throws DepassementTonnageException{
        if(type.equals("CHASSEUR")){
            return;
        }
        else{
            if (nbPassager<12){
                return;
            }
            else{
                int tonnagePassagers = 2*nbPassager;
                int tonnageRestant=tonnageMax-tonnageActuel;
                int tonnageAConsiderer=(tonnagePassagers<tonnageRestant ? tonnagePassagers : tonnageRestant);
                if (cargaison>tonnageAConsiderer){
                    int tonnageEnExces = cargaison-tonnageAConsiderer;
                    throw new DepassementTonnageException(tonnageEnExces);
                }
                else{
                    tonnageActuel=tonnageActuel+cargaison;
                }
            }
        }

    }
}
