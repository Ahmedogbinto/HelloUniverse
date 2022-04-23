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
    public void accueillirVaisseaux(Vaisseau... vaisseau) {
        for(int i=0; i<vaisseau.length; i++) {

            for (int index = 0; index < baieAccostage.length; index++) {
                if (baieAccostage[index] == null){
                    baieAccostage[index] = vaisseau[i];
                    break;
                }

            }


            if (vaisseau[i] instanceof VaisseauDeGuerre) {
                ((VaisseauDeGuerre) vaisseau[i]).desactiverArmes();
            }
                nbTotalHumain = nbTotalHumain + vaisseau[i].nbPassager;

        }

    }

}
