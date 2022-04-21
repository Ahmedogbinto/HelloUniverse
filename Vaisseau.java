public class Vaisseau
{
    String type;
    int nbPassager;
    int blindage;
    int resistanceDuBouclier;

    void activerBouclier()
    {
        System.out.println("Activation du bouclier de vaisseau de type "+type);
    }

    void DesactiverBouclier()
    {
        System.out.println("Desactivation du bouclier de vaisseau de type "+type);
    }
}
