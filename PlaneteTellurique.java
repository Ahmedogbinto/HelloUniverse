public class PlaneteTellurique extends Planete implements Habitable
{
    Vaisseau[] baieAccostage;

    public PlaneteTellurique(String nom,int tailleBaie) {
        super(nom);
        this.baieAccostage = new Vaisseau[tailleBaie];
    }

     boolean restePlaceDisponible() {
         for (int index = 0; index < baieAccostage.length; index++) {
             if (baieAccostage[index] == null) {
                 return true;
             }
         }
         return false;
     }
    PlaneteTellurique(String nom)
    {
        super(nom);
    }
    public void accueillirVaisseau(Vaisseau vaisseau)
    {
        if (vaisseau instanceof VaisseauDeGuerre) {
            ((VaisseauDeGuerre) vaisseau).desactiverArmes();

            nbTotalHumain = nbTotalHumain + vaisseau.nbPassager;
            for (int index = 0; index < baieAccostage.length; index++) {
                baieAccostage[index] = vaisseau;
                break;
            }

        }
    }

}
