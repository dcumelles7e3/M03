package m3.uf5.interfaces;

import java.util.*;
import java.util.Comparator;

public class ProvaPersona {

    /**
     * a. crea un ArrayList amb 5 objectes m3.uf5.interfaces.Persona.
     * b. ordena per nom ascendentment amb un m3.uf5.interfaces.ComparatorPerNom
     * c. ordena per edat ascendentment amb un m3.uf5.interfaces.ComparatorPerEdat
     * d. ordena per nom ascendentment amb una classe interna anònima
     * e. ordena per edat ascendentment amb una classe interna anònima
     * f. ordena per nom ascendentment amb una expressió lambda
     * g. ordena per edat ascendentment amb una expressió lambda
     * @author Dídac Cumelles Cenzano
     * @version 30/09/2020
     */

    public static void main(String[] args) {

        //a. Inicialitzem ArrayList i instanciem objectes m3.uf5.interfaces.Persona
        ArrayList<Persona> persones = new ArrayList<>();
        Persona p1 = new Persona("Pepe", 6);
        Persona p2 = new Persona("Jeje", 69);
        Persona p3 = new Persona("Mateu", 23);
        Persona p4 = new Persona("Jordi", 28);
        Persona p5 = new Persona("Llordi", 30);

        //Afegim persones al ArrayList
        persones.add(p1);
        persones.add(p2);
        persones.add(p3);
        persones.add(p4);
        persones.add(p5);

        //b
        persones.sort(new ComparatorPerNom());
        System.out.println("Array ordenat alfabéticament:\n"+persones+"\n");

        //c
        persones.sort(new ComparatorPerEdat());
        System.out.println("Array ordenat per edat:\n"+persones+"\n");

        //d
        persones.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNom().compareToIgnoreCase(p2.getNom());
            }
        });
        System.out.println("Array ordenat alfabéticament amb classe interna:\n"+persones+"\n");

        //e
        persones.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getEdat() - p2.getEdat();
            }
        });
        System.out.println("Array ordenat per edat amb classe interna:\n"+persones+"\n");

        //f
        persones.sort((per1, per2) -> per1.getNom().compareToIgnoreCase(per2.getNom()));
        System.out.println("Array ordenat alfabéticament amb lambda:\n"+persones+"\n");

        //g
        persones.sort((per1, per2) -> per1.getEdat() - per2.getEdat());
        System.out.println("Array ordenat per edat amb lambda:\n"+persones+"\n");

        //Tambe es pot substituir amb un comparingInt per a ordenar-ho per edat
        persones.sort(Comparator.comparingInt(Persona::getEdat));


        //Exercici 2
        persones.sort(Persona::comparaPerNom);
        System.out.println(persones);
    }
}

class ComparatorPerEdat implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getEdat() - p2.getEdat();
    }
}

class ComparatorPerNom implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNom().compareToIgnoreCase(p2.getNom());
    }
}
