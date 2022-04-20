public class HelloUniverse
{
    public static void main(String... args)
    {
        Planete mercure=new Planete();
        mercure.nom="Mercure";
        mercure.matiere="Tellurique";
        mercure.diametre=4880;

        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "Tellurique";

        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.diametre = 12756;
        terre.matiere = "Tellurique";

        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.diametre = 6792;
        mars.matiere = "Tellurique";

        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";

        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";

        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";
        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxHydrogene=83f;
        atmosphereUranus.tauxHelium=15f;
        atmosphereUranus.tauxMethane=2.5f;
        uranus.atmosphere = atmosphereUranus;

        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        Vaisseau nouveauVaisseau = new Vaisseau();
        nouveauVaisseau.type="FRAGATE";
        nouveauVaisseau.nbPassager=9;
        mars.accueillirVaisseau(nouveauVaisseau);

        Vaisseau autreVaisseau = new Vaisseau();
        autreVaisseau.type="CROISSEUR";
        autreVaisseau.nbPassager=42;
        mars.accueillirVaisseau(autreVaisseau);

        /*System.out.println("Le nombre d'humain ayant déja séjourné sur Mars est actuellement de "+mars.nbTotalHumain);

        System.out.println("l'atmosphère uranus est composée de:");
        System.out.println("A "+uranus.atmosphere.tauxHydrogene+"% d'hydrogène ");
        System.out.println("A "+uranus.atmosphere.tauxArgon+"% d'argon ");
        System.out.println("A "+uranus.atmosphere.tauxDioxydeDeCarbone+"% de dioxyde de carbone");
        System.out.println("A "+uranus.atmosphere.tauxHelium+"% d'helium");
        System.out.println("A "+uranus.atmosphere.tauxMethane+"% de methane");
        System.out.println("A "+uranus.atmosphere.tauxSodium+"% de sodium");*/

        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.6));





    }


}
