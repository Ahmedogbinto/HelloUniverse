package com.expacex.decouverte.enginspaciaux;

public class VaisseauDeGuerre extends Vaisseau
{
    boolean armesDesactivees;

    public VaisseauDeGuerre (TypeVaisseau type)
    {
        this.type=type;
        if (type==TypeVaisseau.CHASSEUR) {
            tonnageMax = 0;
        }
        else if (type==TypeVaisseau.FREGATE) {
            tonnageMax=50;
        }
        else if (type==TypeVaisseau.CROISEUR) {
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
        void activerBouclier()
        {
            desactiverArmes();
            super.activerBouclier();
        }

    @Override
    public int emporterCargaison(int cargaison) {
        if(type.equals("CHASSEUR")){
            return cargaison;
        }
        else{
            if (nbPassager<12){
                return cargaison;
            }
            else{
                int tonnagePassagers = 2*nbPassager;
                int tonnageRestant=tonnageMax-tonnageActuel;
                int tonnageAConsiderer=(tonnagePassagers<tonnageRestant ? tonnagePassagers : tonnageRestant);
                if (cargaison>tonnageAConsiderer){
                    tonnageActuel=tonnageMax;
                    return cargaison-tonnageAConsiderer;
                }
                else{
                    tonnageActuel=tonnageActuel+cargaison;
                    return 0;
                }
            }
        }

    }
}
