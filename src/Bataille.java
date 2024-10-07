import java.util.ArrayList;
import java.util.Collections;


public class Bataille {
    public static void main(String[] args) {

        // ETAPE 1 CREATION DU JEU DE CARTE

         ArrayList<Carte>  jeuDeCartes = new ArrayList<>();

        for (String couleur : Carte.couleurs) {
            for (int i = 0; i < Carte.valeurs.length; i++) {
                jeuDeCartes.add(new Carte(couleur, i + 1));
            }
        }

        // ETAPE 2 MELANGER CARTE

        Collections.shuffle(jeuDeCartes);

        System.out.println("Jeu de cartes créé :");

        // ETAPE 3 AjOUT DES JOUEURS

        Joueur joueur1 = new Joueur("Maitriya");
        Joueur joueur2 = new Joueur("Monster");


        // ETAPE 4 DISTRUBUTION + DESTRUCTION

        int i = 0;
        while (!jeuDeCartes.isEmpty()) {
            if (i % 2 == 0) {
                joueur1.tirerCarte(jeuDeCartes.remove(0));
            }
            else {
                joueur2.tirerCarte(jeuDeCartes.remove(0));
            }
            i++;
        }


        // ETAPE 5 GAME ON !


        while(!joueur1.getMain().isEmpty() && !joueur2.getMain().isEmpty()) {
            Carte carte1 = joueur1.jouerCarte();
            Carte carte2 = joueur2.jouerCarte();

            System.out.println(joueur1.getNom() + " joue " + carte1);
            System.out.println(joueur2.getNom() + " joue " + carte2);

            if (carte1.estSuperieurA(carte2)) {
                joueur1.ajouterScore(1);
                System.out.println(joueur1.getNom() + " remporte le duel !");
            }

            else if (carte2.estSuperieurA(carte1)) {
                joueur2.ajouterScore(1);
                System.out.println(joueur2.getNom() + " remporte le duel !");
            }

            else {
                System.out.println(" Egalité ! WOOOW ");
            }

            System.out.println("Scores - " + joueur1 + " | " + joueur2);

        }

        // ETAPE 6 : WHO IS THE WINNER ?!


        if (joueur1.getScore() > joueur2.getScore()) {
            System.out.println(joueur1.getNom() + " est le gagnant avec " + joueur1.getScore() + " points !");
        }
        else if (joueur2.getScore() > joueur1.getScore()) {
            System.out.println(joueur2.getNom() + " est le gagnant avec " + joueur2.getScore() + " points !");
        }
        else {
            System.out.println("C'est un match nul ! OMG");}
    }
}