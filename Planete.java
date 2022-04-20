public class Planete
{
    String nom;
    String matiere;
    int diametre;
    int nbTotalHumain;
    Atmosphere atmosphere;


    void accueillirVaisseau(int nbHumain)
    {
        nbTotalHumain = nbTotalHumain+nbHumain;
    }
    void accueillirVaisseau( String typeVaisseau)
    {
        if (typeVaisseau.equals("CHASSEUR"))
        {
            nbTotalHumain=nbTotalHumain+3;
        }
        else if (typeVaisseau.equals("FREGATE"))
        {
            nbTotalHumain=nbTotalHumain+12;
        }
        else if(typeVaisseau.equals("CROISEUR"))
        {
            nbTotalHumain=nbTotalHumain+50;
        }
    }
}
