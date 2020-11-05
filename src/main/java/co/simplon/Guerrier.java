package co.simplon;

public class Guerrier implements Ensorcele{

    enum Arme {MAIN, BATON, COUTEAU, EPEE};

    private String nom;
    private Arme arme;

    public Guerrier(String nom) {
        this.nom = nom;
        this.arme = Arme.EPEE;
    }

    public void seBattre() {
        System.out.printf("Je suis l·e·a guerri·er·ère %s, et je me bats avec un·e %s\n", this.nom, this.arme);
    }

    @Override
    public void recevoirUnSort() {
        int indArme = this.arme.ordinal();
        if (indArme > 0) {
            this.arme = Arme.values()[--indArme];
            System.out.printf("==> A mince, c'est moins pratique avec un·e %s\n", this.arme);
        }
    }

    @Override
    public String toString() {
        return "Guerrier: " + nom;
    }
    
    
}