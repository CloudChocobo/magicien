package co.simplon;

import java.util.HashSet;
import java.util.Set;

public class Magicien implements Ensorcele {
    private String nom;
    private Set<Ensorcele> cobayes;

    public Magicien(String nom) {
        this.nom = nom;
        this.cobayes = new HashSet<Ensorcele>();
    }

    public void seVanter() {
        System.out.printf("Je suis le grand magicien %s et personne ne peut me vaincre!!\n", this.nom);
    }

    public void ajouterCobaye(Ensorcele cobaye) {
        this.cobayes.add(cobaye);
    }

    public void lancerUnSort() {
        System.out.println("\n********************************************************");
        System.out.printf("* Le grand mage %s lance un sort sur tous ses cobayes\n", this.nom);
        System.out.println("********************************************************");
        for (Ensorcele ensorcele : cobayes) {
            System.out.println("Sortilège sur " + ensorcele);
            ensorcele.recevoirUnSort();
        }
    }

     public void faireRestition() {
        System.out.println("\n\n***************************************************************************");
        System.out.println("OUAH, quelle force !!!");
        System.out.println("S'ils me demandent de transformer une citrouille en carrosse");
        System.out.println("J'écris la classe Citrouille et c'est tout");
        System.out.println("***************************************************************************");
    }

    @Override
    public void recevoirUnSort() {
        System.out.println("==> HaHa !!! je suis un magicien et je peux te contrer");
    }

    @Override
    public String toString() {
        return "Magicien: " + nom;
    }

    
}