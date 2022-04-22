public enum TypeVaisseau {
    CHASSEUR ("Chasseur"), FREGATE("Fregate"), CROISEUR("Croiseur"), VAISSEAUMONDE("Vaisseau-Monde"),
    CARGO ("CARGO");

    String nom;
    TypeVaisseau (String nom){
          this.nom = nom;
    }

}
