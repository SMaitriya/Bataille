public class Carte {

    private String couleur;
    private int valeur;
    private boolean estSuperieurA;
    public static String[] couleurs = {"Coeur", "Pique", "Carreau", "Trèfle"};
    public static String[] valeurs = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Reine", "Rois", "As"};

    // Constructeur

    public Carte(String couleur, int valeur){
        this.couleur = couleur;
        this.valeur = valeur;
    }

    // Accesseurs

    public String getCouleur() {
        return couleur;
    }

    public int getValeur() {
        return valeur;
    }

    // SETTER

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }


    // Comparateur

    public boolean estSuperieurA(Carte c) {
       return  this.valeur > c.valeur;
    }

    // Methode

    @Override
    public String toString() {
        return couleur + " " + valeurs[valeur - 1];
    }


}
