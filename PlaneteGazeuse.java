public class PlaneteGazeuse extends Planete implements Habitable
{

    PlaneteGazeuse(String nom) {
        super(nom);
    }

    @Override
    public Vaisseau accueillirVaisseau(Vaisseau nouveauvaisseau) {
        return null;
    }
}
