public abstract class Planete
{
    String nom;
    String matiere;
    int diametre;
    int totalVisiteurs;
    int nbTotalHumain;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuellemnentAccoste;
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

