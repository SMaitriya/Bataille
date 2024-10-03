public class Bataille {
    public static void main(String[] args) {



        Carte carte1 = new Carte("Coeur", 10);
        Carte carte2 = new Carte("Pique", 5);


        if (carte1.estSuperieurA(carte2)) {
            System.out.println("Carte 1 est supérieur");
        }
        else {
            System.out.println("Carte 2 est supérieur");

        }


    }



}