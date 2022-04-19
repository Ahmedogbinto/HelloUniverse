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

        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        System.out.println("la planète terre a pour dimaètre "+terre.diametre+", elle est composée de "+terre.matiere+" et a été surnommé "+terre.nom+"." );

        Planete planeteX = new Planete();
        System.out.println("la planèteX a pour diamètre " + planeteX.diametre + ", elle est composée de " + planeteX.matiere + " et a été surnommé " + planeteX.nom + ".");

        neptune.revolution(-3542);
        System.out.println("Nepturne a effectué un tour de révolution autour de son étoile à "+neptune.revolution(-3542)+" tours");

        mars.rotaion(-684);
        System.out.println("Mars a effectué un tour de rotation autour de la lune à "+mars.rotaion(-684)+" tours");

        venus.rotaion(1250);
        System.out.println("Vénus a effectué un tour de rotation autour de la lune à "+venus.rotaion(1250)+" tours");
    }

}
