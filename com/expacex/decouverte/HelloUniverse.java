package com.expacex.decouverte;

import com.expacex.decouverte.enginspaciaux.TypeVaisseau;
import static com.expacex.decouverte.enginspaciaux.TypeVaisseau.CARGO;
import static com.expacex.decouverte.enginspaciaux.TypeVaisseau.CHASSEUR;
import static com.expacex.decouverte.enginspaciaux.TypeVaisseau.VAISSEAUMONDE;
import static com.expacex.decouverte.enginspaciaux.TypeVaisseau.FREGATE;
import static com.expacex.decouverte.enginspaciaux.TypeVaisseau.CROISEUR;

import com.expacex.decouverte.enginspaciaux.Vaisseau;
import com.expacex.decouverte.enginspaciaux.VaisseauCivil;
import com.expacex.decouverte.enginspaciaux.VaisseauDeGuerre;
import com.expacex.decouverte.objetastraux.*;
import com.expacex.decouverte.enginspaciaux.DepassementTonnageException;
import java.util.Map;
import java.util.Scanner;

public class HelloUniverse {
    public static void main(String... args) {

        Galaxie systemeSolaire = new Galaxie();
        systemeSolaire.nom = "Systeme solaire";

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure",1);
        mercure.diametre = 4880;
        mercure.distaneEtoile = 57.9f;
        systemeSolaire.planetes.add(mercure);

        PlaneteTellurique venus = new PlaneteTellurique("Venus",2);
        venus.diametre = 12100;
        venus.distaneEtoile = 108.2f;
        systemeSolaire.planetes.add(venus);

        PlaneteTellurique terre = new PlaneteTellurique("Terre",10);
        terre.diametre = 12756;
        terre.distaneEtoile = 149.6f;
        systemeSolaire.planetes.add(terre);

        PlaneteTellurique mars = new PlaneteTellurique("Mars",3);
        mars.diametre = 6792;
        terre.distaneEtoile = (float) 227.9;
        systemeSolaire.planetes.add(mars);

        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        jupiter.distaneEtoile = 778.3f;
        systemeSolaire.planetes.add(jupiter);

        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        saturne.distaneEtoile = 14.27f;
        systemeSolaire.planetes.add(saturne);

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        uranus.distaneEtoile = 2877.38f;
        systemeSolaire.planetes.add(uranus);

        Atmosphere atmosphereMars = new Atmosphere();
        atmosphereMars.constituants.put("CO2",95f);
        atmosphereMars.constituants.put("N2",3f);
        atmosphereMars.constituants.put("AR",1.5f);
        atmosphereMars.constituants.put("NO",0.013f);
        mars.atmosphere = atmosphereMars;

        System.out.println("l'atmosph??re Mars est compos??e de :");
        for(Map.Entry<String,Float> constituant : mars.atmosphere.constituants.entrySet()){
            System.out.println(constituant.getValue()+"% de "+ constituant.getKey());
        }

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        neptune.diametre = 49352;
        neptune.distaneEtoile = 4497.07f;
        systemeSolaire.planetes.add(neptune);
        systemeSolaire.planetes.add(jupiter);
        for (Planete nextPlanete: systemeSolaire.planetes){
            System.out.println("La planete suivante est "+nextPlanete.nom);
        }


        Vaisseau chasseur2 = new VaisseauDeGuerre(CHASSEUR);
        chasseur2.nbPassager=2;
        chasseur2.blindage=156;
        chasseur2.resistanceDuBouclier=2;

        Vaisseau chasseur3 = new VaisseauDeGuerre(CHASSEUR);
        chasseur3.nbPassager=5;
        chasseur3.blindage=156;
        chasseur3.resistanceDuBouclier=2;

        Vaisseau cargo2 = new VaisseauCivil(CARGO);
        cargo2.nbPassager = 1001;
        cargo2.blindage = 1250;
        cargo2.resistanceDuBouclier=20;

        terre.accueillirVaisseaux(chasseur2, chasseur3, cargo2);

        Vaisseau fregate = new VaisseauDeGuerre(FREGATE);

        Vaisseau croisseur = new VaisseauDeGuerre(CROISEUR);

        Vaisseau chasseur = new VaisseauDeGuerre(CHASSEUR);

        Vaisseau vaisseauMonde = new VaisseauCivil(VAISSEAUMONDE);

        Vaisseau cargo = new VaisseauCivil(CARGO);

            Scanner sc = new Scanner(System.in);
           boolean recommencer = true;

        while (recommencer) {
            System.out.println("Quel vaisseau souhaitez-vous selectionner:");
            String vaisseauSelectionner = sc.nextLine();
            System.out.println("Sur quelle planete tellurique en partant du systeme solaire  souhaitez-vous poser: 1, 2, 3, 4, 5, 6, ou 7");
            String nomPlanete = sc.nextLine();

            int tonnage;
            while(true) {
                System.out.println("Quelle tonnage souhaitez-vous embarquee ?");
                try{
                    tonnage = sc.nextInt();
                    break;
                }
                catch(java.util.InputMismatchException ime){
                    System.out.println("Le tonnage que vous essayer de rentrer n'est pas numerique");
                }
                finally {
                    sc.nextLine();
                }
            }
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
                Planete planeteSelectionnee = null;
                for (Planete p : systemeSolaire.planetes) {
                    if (p.nom.equals(nomPlanete)) {
                        planeteSelectionnee = p;
                        break;
                    }
                }
                if (planeteSelectionnee instanceof PlaneteGazeuse) {
                    System.out.println("La planete selectionnee nest pas une planete tellurique, recommencer");
                    continue;
                }

                PlaneteTellurique planete = (PlaneteTellurique) planeteSelectionnee;
                if (!planete.restePlaceDisponible(vaisseau)) {
                    System.out.println("Le vaisseau ne peut pas se poser sur la planete par manque de place dans la baie");
                } else {
                    planete.accueillirVaisseaux(vaisseau);

                    try {
                        vaisseau.emporterCargaison(tonnage);
                    } catch (DepassementTonnageException dte) {
                        System.out.println("Le vaisseau a rejete: " + dte.tonnageEnExces + " tonne");
                        System.out.println("Voulez-vous emportez un tonnage partiel a hauteur de" + (tonnage - dte.tonnageEnExces) + "oui/non");
                        String accepte = sc.nextLine();
                        if (accepte.equals("oui")) {
                            try {
                                vaisseau.emporterCargaison(tonnage - dte.tonnageEnExces);
                            } catch (DepassementTonnageException e) {
                                System.out.println("Erreur inattendue.");
                            }
                        } else {
                            System.out.println("Operation annulee");
                        }
                    }
                }
                System.out.println("Voulez-vous recommencer le processus?");
                recommencer = sc.nextLine().equalsIgnoreCase("oui");

        }


    }
}