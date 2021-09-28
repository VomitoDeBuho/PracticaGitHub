package companyxd;

import companyxd.Aplicar;
import companyxd.Aprendre;

public class ExtendsAndImplementsDemo {
    public static void main(String args[]){
        Gos gos = new Gos("Tiger",16);
        Gat gat = new Gat("July",20);
        System.out.println("Gos:"+gos);
        System.out.println("Gat:"+gat);
        gos.recorda();
        gos.protegeixAmo ();
        Aprendre dl = gos;
        dl.aprendre();
        gat.recorda();
        gat.protegeixAmo();
        Enfilarse c = gat;
        c.enfilarse ();
        Home home = new Home("Sid",22);
        System.out.println(home);
        Enfilarse cm = home;
        cm.enfilarse();
        Pensar t = home;
        t.pensar();
        Aprendre l = home;
        l.aprendre ();
        Aplicar a = home;
        a.aplicar();
    }
}