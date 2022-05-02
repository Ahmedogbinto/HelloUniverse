public class PlaneteTellurique extends Planete implements Habitable
{
    Vaisseau[][] baieAccostage;

    public PlaneteTellurique(String nom,int tailleBaie) {
        super(nom);
        this.baieAccostage = new Vaisseau[tailleBaie][tailleBaie];
    }

     boolean restePlaceDisponible(Vaisseau vaisseau) {
        int indexZone=0;
        switch(vaisseau.type){
            case CARGO:
            case VAISSEAUMONDE:
                indexZone=1;
         }

         for (int index = 0; index < baieAccostage[indexZone].length; index++) {
             if (baieAccostage[indexZone][index] == null) {
                 return true;
             }
         }
         return false;
     }
    public void accueillirVaisseaux(Vaisseau... vaisseau) {
        for(int i=0; i<vaisseau.length; i++) {

            int indexZone=0;
            switch(vaisseau[1].type){
                case CARGO:
                case VAISSEAUMONDE:
                    indexZone=1;
            }

            for (int index = 0; index < baieAccostage.length; index++) {
                if (baieAccostage[index] == null){
                    baieAccostage[indexZone][index] = vaisseau[1];
                    break;
                }

            }


            if (vaisseau[i] instanceof VaisseauDeGuerre) {
                ((VaisseauDeGuerre) vaisseau[i]).desactiverArmes();
            }
                nbTotalHumain = nbTotalHumain + vaisseau[i].nbPassager;

        }

    }

    @Override
    public int compareTo(Object o) {
        Planete autrePlanete = (Planete)o;
        return ((Float)distaneEtoile).compareTo(autrePlanete.distaneEtoile);
    }
}
