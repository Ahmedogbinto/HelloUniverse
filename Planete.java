public abstract class Planete implements Comparable
{
    String nom;
    String matiere;
    int diametre;
    int nbTotalHumain;
    Atmosphere atmosphere;

    float distaneEtoile;
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

