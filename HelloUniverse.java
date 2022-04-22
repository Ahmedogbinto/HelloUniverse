public class HelloUniverse
{
    public static void main(String... args)
    {
        PlaneteTellurique mercure=new PlaneteTellurique("Mercure");
        mercure.matiere="Tellurique";

        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;

        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;

        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;

        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;

        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;

        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxHydrogene=83f;
        atmosphereUranus.tauxHelium=15f;
        atmosphereUranus.tauxMethane=2.5f;
        uranus.atmosphere = atmosphereUranus;

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;


        Vaisseau nouveauVaisseau = new VaisseauDeGuerre("FRAGATE");
        nouveauVaisseau.nbPassager=9;
        mars.accueillirVaisseau(nouveauVaisseau);

        Vaisseau autreVaisseau = new VaisseauDeGuerre("CROISSEUR");
        autreVaisseau.nbPassager=42;
        mars.accueillirVaisseau(autreVaisseau);

        System.out.println("Le nombre d'humain ayant déja séjourné sur Mars est actuellement de "+mars.totalVisiteurs);

        System.out.println("l'atmosphère uranus est composée de:");
        System.out.println("A "+uranus.atmosphere.tauxHydrogene+"% d'hydrogène ");
        System.out.println("A "+uranus.atmosphere.tauxArgon+"% d'argon ");
        System.out.println("A "+uranus.atmosphere.tauxDioxydeDeCarbone+"% de dioxyde de carbone");
        System.out.println("A "+uranus.atmosphere.tauxHelium+"% d'helium");
        System.out.println("A "+uranus.atmosphere.tauxMethane+"% de methane");
        System.out.println("A "+uranus.atmosphere.tauxSodium+"% de sodium");

     System.out.println("Le nombres total de planete decouverte jusque ici est de: "+Planete.nbplaneteDecouverte);

        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;


        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;

        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();
        ((VaisseauDeGuerre)chasseur).attaquer(vaisseauMonde, "lazer photonique", 3);
        vaisseauMonde.DesactiverBouclier();

        System.out.println("la resistance du bouclier Vaisseau-monde est de "+vaisseauMonde.resistanceDuBouclier);
        System.out.println("Le blindage du vaisseau-monde est de "+vaisseauMonde.blindage);

        mars.accueillirVaisseau(vaisseauMonde);

        mars.accueillirVaisseau(chasseur);

        Vaisseau chasseurSurTerre = new VaisseauDeGuerre("CHASSEUR");
        terre.accueillirVaisseau(chasseurSurTerre);

        System.out.println("Le chasseur a rejete "+ chasseur.emporterCargaison(20)+" tonnes");

        Vaisseau fregateSurterre = new VaisseauDeGuerre("FREGATE");
        fregateSurterre.nbPassager=100;
        terre.accueillirVaisseau(fregateSurterre);
        System.out.println("Le chasseur a rejete "+ fregateSurterre.emporterCargaison(45)+" tonnes");
        System.out.println("Le chasseur a rejete "+ fregateSurterre.emporterCargaison(12)+" tonnes");

        Vaisseau fregateSurterre2 = new VaisseauDeGuerre("FREGATE");
        fregateSurterre2.nbPassager=14;
        terre.accueillirVaisseau(fregateSurterre2);
        System.out.println("Le chasseur a rejete "+ fregateSurterre2.emporterCargaison(30)+" tonnes");

        Vaisseau vaisseauMondeSurTerre= new VaisseauCivil("VAISSEAU-MONDE");
        terre.accueillirVaisseau(vaisseauMondeSurTerre);
        System.out.println("Le Vaisseau monde a rejete "+ vaisseauMondeSurTerre.emporterCargaison(1360)+" tonnes");
        System.out.println("Le Vaisseau monde a rejete "+ vaisseauMondeSurTerre.emporterCargaison(600)+" tonnes");
    }


}
