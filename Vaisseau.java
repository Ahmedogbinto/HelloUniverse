public abstract class Vaisseau
{
    TypeVaisseau type;
    int nbPassager;
    int blindage;
    int resistanceDuBouclier;
    int tonnageMax;
    int tonnageActuel;


    void activerBouclier()
    {
        System.out.println("Activation du bouclier de vaisseau de type "+type);
    }

    void DesactiverBouclier()
    {
        System.out.println("Desactivation du bouclier de vaisseau de type "+type);
    }

    abstract int emporterCargaison(int cargaison);



}
