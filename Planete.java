public class Planete
{
    String nom;
    String matiere;
    int diametre;

    int revolution(int angle)
    {
        int angleDeRevolution = angle/360;
        return angleDeRevolution;
    }

    int rotaion(int angle)
    {
        int angleDeRotataion = angle/360;
        return angleDeRotataion;
    }

}
