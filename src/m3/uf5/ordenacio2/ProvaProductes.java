package m3.uf5.ordenacio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProvaProductes {

    /**
     * @author Dídac Cumelles Cenzano
     */

    public static void main(String[] args) {

        // a) crea un ArrayList amb 5 objectes Producte.
        ArrayList<Producte> productes = new ArrayList<>();
        Producte p1 = new Producte("Patata",0.50,1,false);
        Producte p2 = new Producte("Cervesa",1.00,2,true);
        Producte p3 = new Producte("Ordinador",749.95,3,false);
        Producte p4 = new Producte("Pizza",4.50,4,true);
        Producte p5 = new Producte("TV 8K",749.95,5,true);

        productes.add(p1);
        productes.add(p2);
        productes.add(p3);
        productes.add(p4);
        productes.add(p5);

        System.out.println("Llista original ordenada per codi:"+productes+"\n");

        // b)  ordena per preu asc/desc amb un ComparatorPerPreu
        productes.sort(new ComparatorPerPreu());
        System.out.println("Llista ordenada amb ComparatorPerPreu:"+productes+"\n");
        productes.sort(Collections.reverseOrder(new ComparatorPerPreu()));
        System.out.println("Llista ordenada desc amb ComparatorPerPreu:"+productes+"\n");

        // c) ordena per disponibilitat asc/desc amb un ComparatorPerDisponibilitat
        productes.sort(new ComparatorPerDisponibilitat());
        System.out.println("Llista ordenada amb ComparatorPerDisponibilitat:"+productes+"\n");
        productes.sort(Collections.reverseOrder(new ComparatorPerDisponibilitat()));
        System.out.println("Llista ordenada desc amb ComparatorPerDisponibilitat:"+productes+"\n");

        // d) ordena per preu i disponibilitat asc/desc amb el ComparatorPerPreuDisponibilitat
        productes.sort(new ComparatorPerPreuDisponibilitat());
        System.out.println("Llista ordenada amb ComparatorPerPreuDisponibilitat:"+productes+"\n");
        productes.sort(Collections.reverseOrder(new ComparatorPerPreuDisponibilitat()));
        System.out.println("Llista ordenada desc amb ComparatorPerPreuDisponibilitat:"+productes+"\n");

        // e) ordena per preu asc/desc amb una classe interna anònima.
        productes.sort(new Comparator<Producte>() {
            @Override
            public int compare(Producte p1, Producte p2) {
                return Double.compare(p1.getPreu(),p2.getPreu());
            }
        });
//        System.out.println("Llista ordenada amb classe interna:"+productes+"\n");

        productes.sort(Collections.reverseOrder(new Comparator<Producte>() {
            @Override
            public int compare(Producte p1, Producte p2) {
                return Double.compare(p1.getPreu(),p2.getPreu());
            }
        }));
//        System.out.println("Llista ordenada desc amb classe interna:"+productes+"\n");


        // f) ordena per disponibilitat asc/desc amb una classe interna anònima
        productes.sort(new Comparator<Producte>() {
            @Override
            public int compare(Producte p1, Producte p2) {
                return Boolean.compare(p1.isDisponible(),p2.isDisponible());
            }
        });
//        System.out.println("Llista dispo ordenada amb classe interna:"+productes+"\n");

        productes.sort(Collections.reverseOrder(new Comparator<Producte>() {
            @Override
            public int compare(Producte p1, Producte p2) {
                return Boolean.compare(p1.isDisponible(),p2.isDisponible());
            }
        }));
//        System.out.println("Llista dispo ordenada desc amb classe interna:"+productes+"\n");


        // g) ordena per preu i, a igualtat de preu, per disponibilitat amb una classe interna anònima.
        productes.sort(new Comparator<Producte>() {
            @Override
            public int compare(Producte p1, Producte p2) {
                int aux;
                aux = Double.compare(p1.getPreu(), p2.getPreu());
                if (aux == 0) aux = Boolean.compare(p1.isDisponible(), p2.isDisponible());
                return aux;
            }
        });
//        System.out.println("Llista dispo/preu ordenada amb classe interna:"+productes+"\n");

        productes.sort(Collections.reverseOrder(new Comparator<Producte>() {
            @Override
            public int compare(Producte p1, Producte p2) {
                int aux;
                aux = Double.compare(p1.getPreu(), p2.getPreu());
                if (aux == 0) aux = Boolean.compare(p1.isDisponible(), p2.isDisponible());
                return aux;
            }
        }));
//        System.out.println("Llista dispo/preu ordenada desc amb classe interna:"+productes+"\n");


        // h) ordena per preu asc/desc amb una expressió lambda.
        productes.sort((pr1, pr2) -> Double.compare(pr1.getPreu(), pr2.getPreu()));
        productes.sort(Collections.reverseOrder((pr1, pr2) -> Double.compare(pr1.getPreu(), pr2.getPreu())));

        // i) ordena per disponibilitat asc/desc amb una expressió lambda.
        productes.sort((pa1, pa2) -> Boolean.compare(pa1.isDisponible(), pa2.isDisponible()));
        productes.sort(Collections.reverseOrder((pa1, pa2) -> Boolean.compare(pa1.isDisponible(), pa2.isDisponible())));

        // j) ordena per preu i disponibilitat amb una expressió lambda.
        productes.sort((pl1, pl2) -> {
            int aux;
            aux = Double.compare(pl1.getPreu(), pl2.getPreu());
            if (aux == 0) aux = Boolean.compare(pl1.isDisponible(), pl2.isDisponible());
            return aux;
        });
//        System.out.println("Llista dispo/preu ordenada amb classe interna:"+productes+"\n");

        productes.sort(Collections.reverseOrder((p11, p21) -> {
            int aux;
            aux = Double.compare(p11.getPreu(), p21.getPreu());
            if (aux == 0) aux = Boolean.compare(p11.isDisponible(), p21.isDisponible());
            return aux;
        }));

        // k) crea un mètode compararPreuDisponibilitat
        productes.sort(Producte::comparaPreuDisponibilitat);
//        System.out.println("Llista dispo/preu ordenada amb classe estatica:"+productes+"\n");
    }
}


//    crea una classe auxiliar ComparatorPerPreu
class ComparatorPerPreu implements Comparator<Producte>{
    @Override
    public int compare(Producte p1, Producte p2){
        return Double.compare(p1.getPreu(), p2.getPreu());}
}

//    crea una classe auxiliar ComparatorPerDisponibilitat
class ComparatorPerDisponibilitat implements Comparator<Producte>{
    @Override
    public int compare(Producte p1, Producte p2) {
        return Boolean.compare(p1.isDisponible(),p2.isDisponible());
    }
}

//    crea una classe auxiliar ComparatorPerPreuDisponibilitat que ordeni segons el preu i, a igualtat de preu, ordeni per disponibilitat.
class ComparatorPerPreuDisponibilitat implements Comparator<Producte>{
    @Override
    public int compare(Producte p1, Producte p2) {
        int aux;
        aux = Double.compare(p1.getPreu(), p2.getPreu());
        if (aux == 0) aux = Boolean.compare(p1.isDisponible(), p2.isDisponible());
        return aux;
    }
}


