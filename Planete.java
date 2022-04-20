public class Planete
{
    String nom;
    String matiere;
    int diametre;
    int nbTotalHumain;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuellemnentAccoste;
    static String forme="spherique";


    void accueillirVaisseau( Vaisseau vaisseau)
    {
        nbTotalHumain = nbTotalHumain+ vaisseau.nbPassager;
        if(vaisseauActuellemnentAccoste == null)
        {
            System.out.println("Aucun vaisseau ne s'en va");
        }
        else
        {
            System.out.println("Un vaisseau de type "+vaisseauActuellemnentAccoste.type+" doit partir.");
        }
        vaisseauActuellemnentAccoste = vaisseau;

    }

}

