package co.simplon;

import java.io.IOException;

/**
 * Hello world!
 */
public final class Jeu {
    private Jeu() {
    }

    private void leMagicienSEntraine() {

        Magicien iwsif = new Magicien("Iwsif");

        Ane pom = new Ane("Pom");
        iwsif.ajouterCobaye(pom);

        Guerrier tartan = new Guerrier("Tartan");
        iwsif.ajouterCobaye(tartan);

        Magicien gwof = new Magicien("Gwof");
        iwsif.ajouterCobaye(gwof);

        System.out.println("\n***** On applaudit les cobayes !!!");
        pom.sExprimer();
        tartan.seBattre();
        gwof.seVanter();

        // lance 3 sorts
        for (int i = 0; i < 3; i++) {

            iwsif.lancerUnSort();
            System.out.printf("\nVoici le résultat du sort %d :\n", i);
            pom.sExprimer();
            tartan.seBattre();
            gwof.seVanter();
        }

        System.out.println("\n\nPitié !!! j'veux pas être cobaye.");
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("\n\n\nSalut ! Vous allez découvrir un tour de magie");
        Jeu jeu = new Jeu();
        jeu.leMagicienSEntraine();
    }
}
