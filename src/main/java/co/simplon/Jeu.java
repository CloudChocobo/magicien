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

        System.out.println("\n**************************************");
        System.out.println("VOICI une demo de magie AVEC interface");
        System.out.println("      On applaudit les cobayes !!!");
        System.out.println("**************************************");
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

        iwsif.faireRestition();
    }

    private void leMangeurDeChampignonsSEntraine() {

        MagicienQuiAimeLesChampignons caPlanePourMoi = new MagicienQuiAimeLesChampignons("Caplanepourmoi");

        Ane pim = new Ane("Pim");
        caPlanePourMoi.ajouterCobaye(pim);

        Guerrier zelda = new Guerrier("Zelda");
        caPlanePourMoi.ajouterCobaye(zelda);

        MagicienQuiAimeLesChampignons irwin = new MagicienQuiAimeLesChampignons("Irwin");
        caPlanePourMoi.ajouterCobaye(irwin);

        System.out.println("\n**************************************");
        System.out.println("VOICI une demo de magie SANS interface");
        System.out.println("     On applaudit les cobayes !!!");
        System.out.println("**************************************");
        pim.sExprimer();
        zelda.seBattre();
        irwin.seVanter();

        // lance 3 sorts
        for (int i = 0; i < 3; i++) {

            caPlanePourMoi.lancerUnSort();
            System.out.printf("\nVoici le résultat du sort %d :\n", i);
            pim.sExprimer();
            zelda.seBattre();
            irwin.seVanter();
        }

        caPlanePourMoi.faireRestition();
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
        jeu.leMangeurDeChampignonsSEntraine();
    }
}
