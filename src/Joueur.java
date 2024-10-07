import java.util.ArrayList;

public class Joueur {

    private String nom;
    private ArrayList<Carte> main;
    private int score;

    // Constructeur
    public Joueur(String nom) {
        this.nom = nom;
        this.main = new ArrayList<>();
        this.score = 0;
    }

    // Accesseurs
    public String getNom() {
        return nom;
    }

    public ArrayList<Carte> getMain() {
        return main;
    }

    public int getScore() {
        return score;
    }

    // Methodes
    public void tirerCarte(Carte carte) {
        this.main.add(carte);
    }

    public Carte jouerCarte() {
        if (!main.isEmpty()) {
            return main.remove(0);
        }
        return null;
    }

    public void ajouterScore(int points) {
        this.score += points;
    }

    @Override
    public String toString() {
        return nom + " a " + score + " points.";
    }
}
