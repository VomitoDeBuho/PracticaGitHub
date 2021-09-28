package companyxd;

public class Gat extends Animal implements Enfilarse {
    public Gat(String nom, int edat){
        super(nom, edat);
    }

    @Override
    public void recorda() {
        System.out.println("Gat pot recordar 16 hores");
    }

    @Override
    public void protegeixAmo() {
        System.out.println("Gat no protegira al seu amo");

    }


    @Override
    public void enfilarse() {
        System.out.println("Gat pot enfilar-se");
    }
}
