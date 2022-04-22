import java.util.Scanner;

public class HelloUniverse {
    public static void main(String... args) {
        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.matiere = "Tellurique";

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
        atmosphereUranus.tauxHydrogene = new Float(83f);
        atmosphereUranus.tauxHelium = new Float(15f);
        atmosphereUranus.tauxMethane = new Float(2.5f);
        atmosphereUranus.tauxAzote = new Float(0.0f);

        System.out.println("l'atmosphère uranus est composée de :");
        if (uranus.atmosphere.tauxHydrogene !=null) {
            System.out.println("A " + uranus.atmosphere.tauxHydrogene + "% d'hydrogène ");
        }
        if (uranus.atmosphere.tauxArgon !=null) {
            System.out.println("A " + uranus.atmosphere.tauxArgon + "% d'argon ");
        }
        if (uranus.atmosphere.tauxDioxydeDeCarbone !=null) {
            System.out.println("A " + uranus.atmosphere.tauxDioxydeDeCarbone + "% de dioxyde de carbone");
        }
        if (uranus.atmosphere.tauxHelium !=null) {
            System.out.println("A " + uranus.atmosphere.tauxHelium + "% d'helium");
        }
        if (uranus.atmosphere.tauxMethane!=null) {
            System.out.println("A " + uranus.atmosphere.tauxMethane + "% de methane");
        }
        if (uranus.atmosphere.tauxSodium !=null) {
            System.out.println("A " + uranus.atmosphere.tauxSodium + "% de sodium");
        }

        uranus.atmosphere = atmosphereUranus;

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;


        Vaisseau fregate = new VaisseauDeGuerre("FRAGATE");

        Vaisseau croisseur = new VaisseauDeGuerre("CROISSEUR");

        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");

        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");

        Vaisseau cargo = new VaisseauCivil("CARGO");

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel vaisseau souhaitez-vous selectionner");
        String vaisseauSelectionner = sc.nextLine();
        System.out.println("Sur quelle planete souhaitez-vous poser");
        String planeteSelectionnee = sc.nextLine();
        System.out.println("Quelle tonnage souhaitez-vous embarquee ?");
        int tonnage = sc.nextInt();

        Vaisseau vaisseau = null;
        switch (vaisseauSelectionner) {
            case "CHASSEUR":
                vaisseau = chasseur;
                break;
            case "FREGATE":
                vaisseau = fregate;
                break;
            case "CROISEUR":
                vaisseau = croisseur;
                break;
            case "CARGO":
                vaisseau = cargo;
                break;
            case "VAISSEAU-MONDE":
                vaisseau = vaisseauMonde;
                break;
        }

        PlaneteTellurique planete = null;
        switch(planeteSelectionnee) {
            case "Mercure":
                planete=mercure;
                break;
            case "Venus":
                planete=venus;
                break;
            case "Terre":
                planete=terre;
                break;
            case "Mars":
                planete=mars;
                break;

        }
            planete.accueillirVaisseau(vaisseau);
            int rejet = vaisseau.emporterCargaison(tonnage);
            System.out.println("Le rejet est de "+rejet);

    }
}