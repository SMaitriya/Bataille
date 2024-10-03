public class Carte {

    private String couleur;
    private int valeur;
    private boolean estSuperieurA;
    private static String[] couleurs = {"Coeur", "Pique", "Carreau", "Trèfle"};
    private static int[] valeurs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

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

    // Modificateurs (Setters)
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }



    // Comparateur

    public boolean estSuperieurA(Carte autrecarte) {
       return  this.valeur > autrecarte.valeur;
    }


}
