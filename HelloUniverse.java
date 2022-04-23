import java.util.Scanner;

public class HelloUniverse {
    public static void main(String... args) {
        PlaneteTellurique mercure = new PlaneteTellurique("Mercure",1);
        mercure.matiere = "Tellurique";

        PlaneteTellurique venus = new PlaneteTellurique("Venus",2);
        venus.diametre = 12100;

        PlaneteTellurique terre = new PlaneteTellurique("Terre",10);
        terre.diametre = 12756;

        PlaneteTellurique mars = new PlaneteTellurique("Mars",3);
        mars.diametre = 6792;

        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;

        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;

        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxHydrogene = 83f;
        atmosphereUranus.tauxHelium = 15f;
        atmosphereUranus.tauxMethane = 2.5f;
        atmosphereUranus.tauxAzote = 0.0f;

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


        Vaisseau chasseur2 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur2.nbPassager=2;
        chasseur2.blindage=156;
        chasseur2.resistanceDuBouclier=2;
        Vaisseau chasseur3 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur2.nbPassager=5;
        chasseur2.blindage=156;
        chasseur2.resistanceDuBouclier=2;
        Vaisseau cargo2 = new VaisseauCivil(TypeVaisseau.CARGO);
        cargo2.nbPassager = 1001;
        cargo2.blindage = 1250;
        cargo2.resistanceDuBouclier=20;

        terre.accueillirVaisseaux(chasseur2, chasseur3, cargo2);

        Vaisseau fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);

        Vaisseau croisseur = new VaisseauDeGuerre(TypeVaisseau.CROISEUR);

        Vaisseau chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);

        Vaisseau vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE);

        Vaisseau cargo = new VaisseauCivil(TypeVaisseau.CARGO);

            Scanner sc = new Scanner(System.in);
            String recommencer;

        do {
            System.out.println("Quel vaisseau souhaitez-vous selectionner");
            String vaisseauSelectionner = sc.nextLine();
            System.out.println("Sur quelle planete souhaitez-vous poser");
            String planeteSelectionnee = sc.nextLine();
            System.out.println("Quelle tonnage souhaitez-vous embarquee ?");
            int tonnage = sc.nextInt();
            sc.nextLine();

            TypeVaisseau typeVaisseau = TypeVaisseau.valueOf(vaisseauSelectionner);
            Vaisseau vaisseau = null;

            switch (typeVaisseau) {
                case CHASSEUR:
                    vaisseau = chasseur;
                    break;
                case FREGATE:
                    vaisseau = fregate;
                    break;
                case CROISEUR:
                    vaisseau = croisseur;
                    break;
                case CARGO:
                    vaisseau = cargo;
                    break;
                case VAISSEAUMONDE:
                    vaisseau = vaisseauMonde;
                    break;
            }

            PlaneteTellurique planete = null;
            switch (planeteSelectionnee) {
                case "Mercure":
                    planete = mercure;
                    break;
                case "Venus":
                    planete = venus;
                    break;
                case "Terre":
                    planete = terre;
                    break;
                case "Mars":
                    planete = mars;
                    break;
            }
            if (!planete.restePlaceDisponible()) {
                System.out.println("Le vaisseau ne peut pas se poser sur la planete par manque de place dans la baie");
            } else {
                planete.accueillirVaisseaux(vaisseau);

                planete.accueillirVaisseaux(vaisseau);
                int rejet = vaisseau.emporterCargaison(tonnage);
                System.out.println("Le rejet est de " + rejet);
            }
            System.out.println("Voulez-vous recommencer le processus?");
            recommencer = sc.nextLine();
        }
            while (recommencer.equalsIgnoreCase("oui"));

    }
}