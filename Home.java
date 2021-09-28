package companyxd;

public class Home implements Pensar, Aprendre, Aplicar, Enfilarse {
    private String Nom;
    private int edat;

    public Home(String nom, int edat) {
        Nom = nom;
        this.edat = edat;
    }

    @Override
    public void pensar() {
        System.out.println("Puc pensar:Home");
    }

    @Override
    public void aprendre() {
        System.out.println("Puc apendre:Home");
    }

    @Override
    public void aplicar() {
        System.out.println("Puc aplicar:Home");
    }

    @Override
    public void enfilarse() {
        System.out.println("Puc enfilar-me:Home");
    }

    @Override
    public String toString() {
        return "Home :"+Nom+":"+"Edat:"+edat;
    }
}
