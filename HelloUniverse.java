import java.util.Scanner;

public class HelloUniverse {
    public static void main(String... args) {

        Galaxie systemeSolaire = new Galaxie();
        systemeSolaire.nom = "Systeme solaire";

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure",1);
        mercure.matiere = "Tellurique";
        systemeSolaire.planeteList.add(mercure);

        PlaneteTellurique venus = new PlaneteTellurique("Venus",2);
        venus.diametre = 12100;
        systemeSolaire.planeteList.add(venus);

        PlaneteTellurique terre = new PlaneteTellurique("Terre",10);
        terre.diametre = 12756;
        systemeSolaire.planeteList.add(terre);

        PlaneteTellurique mars = new PlaneteTellurique("Mars",3);
        mars.diametre = 6792;
        systemeSolaire.planeteList.add(mars);

        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        systemeSolaire.planeteList.add(jupiter);

        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        systemeSolaire.planeteList.add(saturne);

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        systemeSolaire.planeteList.add(uranus);

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
           boolean recommencer = true;

        while (recommencer){
            System.out.println("Quel vaisseau souhaitez-vous selectionner");
            String vaisseauSelectionner = sc.nextLine();
            System.out.println("Sur quelle planete tellurique en partant du systeme solaire  souhaitez-vous poser: 1, 2, 3, 4, 5, 6, ou 7");
            int planeteSelectionnee = sc.nextInt();
            sc.nextLine();
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
            Planete p = systemeSolaire.planeteList.get(planeteSelectionnee);
            if (p instanceof PlaneteGazeuse){
                System.out.println("La planete selectionnee nest pas une planete tellurique, recommencer");
                continue;
            }

            PlaneteTellurique planete = (PlaneteTellurique) p;
            if (!planete.restePlaceDisponible(vaisseau)) {
                System.out.println("Le vaisseau ne peut pas se poser sur la planete par manque de place dans la baie");
            } else {
                planete.accueillirVaisseaux(vaisseau);

                planete.accueillirVaisseaux(vaisseau);
                int rejet = vaisseau.emporterCargaison(tonnage);
                System.out.println("Le rejet est de " + rejet);
            }
            System.out.println("Voulez-vous recommencer le processus?");
            recommencer = sc.nextLine() .equalsIgnoreCase("oui");
        }


    }
}