package companyxd;

public abstract class Animal {
    private String nom;
    private int anysEdat;
//Modificacio a la branca
    public Animal(String nom, int edat) {
        this.nom = nom;
        this.anysEdat = edat;
    }

    public abstract void recorda();

    public abstract void protegeixAmo();


    @Override
    public String toString() {
        return this.getClass().getSimpleName()+":"+nom +":"+anysEdat;
    }
}