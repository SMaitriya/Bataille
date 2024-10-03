import java.util.ArrayList;

public class Joueurs {
    private String joueurA;
    private String joueurB;
    private ArrayList<Carte> cartesmain;

    // constructor
    public Joueurs(String joueurA, String joueurB) {
        this.joueurA = joueurA;
        this.joueurB = joueurB;
        this.cartesmain = new ArrayList<Carte>();
    }

    public void tirerCarte(Carte carte) {
        this.cartesmain.add(carte);
    }

    public void ajouterCarte(Carte carte, int index) {
        if (index >= 0 && index <= cartesmain.size()) { // Permet d'ajouter à la fin également
            cartesmain.add(index, carte);
        }
    }


}
