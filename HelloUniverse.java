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


        Vaisseau nouveauVaisseau = new Vaisseau();
        nouveauVaisseau.type="FRAGATE";
        nouveauVaisseau.nbPassager=9;
        mars.accueillirVaisseau(nouveauVaisseau);

        Vaisseau autreVaisseau = new Vaisseau();
        autreVaisseau.type="CROISSEUR";
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

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;
        chasseur.type="CHASSEUR";

        VaisseauCivil vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;
        vaisseauMonde.type="VAISSEAU-MONDE";

        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();
        chasseur.attaquer(vaisseauMonde, "lazer photonique", 3);
        vaisseauMonde.DesactiverBouclier();

        System.out.println("la resistance du bouclier Vaisseau-monde est de "+vaisseauMonde.resistanceDuBouclier);
        System.out.println("Le blindage du vaisseau-monde est de "+vaisseauMonde.blindage);

        mars.accueillirVaisseau(vaisseauMonde);

        mars.accueillirVaisseau(chasseur);





    }


}
