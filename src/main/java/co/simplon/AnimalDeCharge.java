package co.simplon;

public class AnimalDeCharge {

    protected String nom;

    public AnimalDeCharge(String nom) {
        this.nom = nom;
    }

    public void transporter(Humain homme) {
        System.out.printf("%s porte %s\n", this.nom, homme);
    }
}