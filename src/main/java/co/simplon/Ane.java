package co.simplon;

public class Ane implements Ensorcele{

    enum Apparence {NORMAL, SOURIS};
    private String nom;
    private Apparence apparence;

    public Ane(String nom) {
        this.nom = nom;
        this.apparence = Apparence.NORMAL;
    }
    
    public void sExprimer() {
        if (this.apparence == Apparence.NORMAL)
            System.out.printf("Je suis l'ane %s et je brait\n", this.nom);
        else
            System.out.printf("Je suis l'ane %s et je couine\n", this.nom);
    }
    
    @Override
    public void recevoirUnSort() {
        if (this.apparence == Apparence.NORMAL) {
            System.out.println("==> Au secours ! je suis transformé en souris");
            this.apparence = Apparence.SOURIS;
        }
    }

    @Override
    public String toString() {
        return "Ane: " + nom;
    }

    

}