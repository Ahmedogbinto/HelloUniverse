public class VaisseauDeGuerre extends Vaisseau
{
    void attaquer( Vaisseau vaisseauAttaque, String armeUtilisee, int dureeDeLattaque)
    {
        System.out.println("Un vaisseau de type "+type+" attaque un autre vaisseayu de type "+type+" en utilisant une arme de type "+armeUtilisee+" pendant "+dureeDeLattaque+" minutes");
        vaisseauAttaque.resistanceDuBouclier=0;
        vaisseauAttaque.blindage=vaisseauAttaque.blindage/2;
    }
}
