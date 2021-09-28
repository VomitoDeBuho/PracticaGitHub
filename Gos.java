package companyxd;

public class Gos extends Animal implements Aprendre, Enfilarse {
    public Gos(String nom, int edat){
        super(nom, edat);
    }

    @Override
    public void recorda() {
        System.out.println("Gos pot recordar 16 hores");
    }

    @Override
    public void protegeixAmo() {
        System.out.println("Gos protegira al seu amo");
    }

    @Override
    public void enfilarse() {
        System.out.println("Gos pot enfilar-se");
    }

    @Override
    public void aprendre() {
        System.out.println("Gos pot apendre");
    }

}
