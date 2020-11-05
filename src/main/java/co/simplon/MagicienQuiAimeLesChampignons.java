package co.simplon;

import java.util.HashSet;
import java.util.Set;

public class MagicienQuiAimeLesChampignons extends Humain {

    private Set<Ane> cobayesAne;
    private Set<Guerrier> cobayesGuerrier;
    private Set<MagicienQuiAimeLesChampignons> cobayesMagicien;

    public MagicienQuiAimeLesChampignons(String nom) {
        super(nom);
        this.cobayesAne = new HashSet<Ane>();
        this.cobayesGuerrier = new HashSet<Guerrier>();
        this.cobayesMagicien = new HashSet<MagicienQuiAimeLesChampignons>();
    }

    public void seVanter() {
        System.out.printf("Je suis le magicien %s et je consomme des champignons hallucinogènes \n", this.nom);
    }

    public void ajouterCobaye(Ane cobaye) {
        this.cobayesAne.add(cobaye);
    }

    public void ajouterCobaye(Guerrier cobaye) {
        this.cobayesGuerrier.add(cobaye);
    }

    public void ajouterCobaye(MagicienQuiAimeLesChampignons cobaye) {
        this.cobayesMagicien.add(cobaye);
    }

    public void lancerUnSort() {
        System.out.println("\n********************************************************");
        System.out.printf("* Le grand mage %s lance un sort sur tous ses cobayes\n", this.nom);
        System.out.println("********************************************************");

        for (Ane ane : cobayesAne) {
            System.out.println("Sortilège sur " + ane);
            ane.recevoirUnSort();
        }

        for (Guerrier guerrier : cobayesGuerrier) {
            System.out.println("Sortilège sur " + guerrier);
            guerrier.recevoirUnSort();
        }

        for (MagicienQuiAimeLesChampignons mage : cobayesMagicien) {
            System.out.println("Sortilège sur " + mage);
            mage.recevoirUnSort();
        }
    }

    public void faireRestition() {
        System.out.println(
                "\n\n*********************************************************************************************************");
        System.out.println(
                "Quels efforts ! la prochaine fois je ne vais pas me promener en forêt et j'utilise des interfaces");
        System.out.println("Heureusement qu'ils ne m'ont pas demandé de transformer une citrouille en carrosse");
        System.out.println("Je serais obligé d'écrire la classe Citrouille et d'ajouter du code dans ma classe");
        System.out.println(
                "*********************************************************************************************************");
    }

    public void recevoirUnSort() {
        System.out.println("==> Haaaaa ! Ca fait mal !!!");
    }

    @Override
    public String toString() {
        return "MagicienQuiAimeLeChampignons: " + nom;
    }

}