public class Carte {

    private String couleur;
    private int valeur;
    private boolean estSupérieurA;


    // Constructeur
    public Carte(String couleur, int valeur){
        this.couleur = couleur;
        this.valeur = valeur;
    }

    // Accesseurs


    public String getCouleur() {
        return couleur;
    }

    public boolean estSupérieurA(Carte autrecarte) {
       return  this.valeur > autrecarte.valeur;
    }


}
