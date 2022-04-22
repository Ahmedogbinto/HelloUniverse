public class PlaneteTellurique extends Planete implements Habitable
{
    PlaneteTellurique(String nom)
    {
        super(nom);
    }
    public void accueillirVaisseau(Vaisseau vaisseau)
    {
        if (vaisseau instanceof VaisseauDeGuerre)
        {

        }
        nbTotalHumain = nbTotalHumain + vaisseau.nbPassager;
        if(vaisseauActuellemnentAccoste == null)
        {
            System.out.println("Aucun vaiseau ne sen va");
        }
        else
        {
            System.out.println("Un vaisseau de type"+vaisseauActuellemnentAccoste.type+" doit sen aller");
        }
        Vaisseau vaisseauActuellemnentAccoste= vaisseau;

       
    }

}
