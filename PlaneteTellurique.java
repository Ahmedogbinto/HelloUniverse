public class PlaneteTellurique extends Planete implements Habitable
{
    PlaneteTellurique(String nom) {
        super(nom);
    }
    public Vaisseau accueillirVaisseau( Vaisseau nouveauVaisseau)
    {
        totalVisiteurs+= nouveauVaisseau.nbPassager;
        Vaisseau vaisseauPrecedant = vaisseauActuellemnentAccoste;
       vaisseauActuellemnentAccoste = nouveauVaisseau;
       return vaisseauPrecedant;
    }

}
