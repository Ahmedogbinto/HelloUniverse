public class VaisseauDeGuerre extends Vaisseau
{
    boolean armesDesactivees;
    void attaquer(Vaisseau vaisseauAttaque, String armeUtilisee, int dureeDeLattaque)
    {
        if(armesDesactivees)
        {
            System.out.println("Attaque impossible, armement desactivee");
        }
        else
        {
            System.out.println("Un vaisseau de type "+type+" attaque un autre vaisseayu de type "+type+" en utilisant une arme de type "+armeUtilisee+" pendant "+dureeDeLattaque+" minutes");
            vaisseauAttaque.resistanceDuBouclier=0;
            vaisseauAttaque.blindage=vaisseauAttaque.blindage/2;
        }
        void desactiverArmes()
        {
            System.out.println("Desactivation dun vaisseau de type"+type);
            armesDesactivees = true;
        }
    }

}
