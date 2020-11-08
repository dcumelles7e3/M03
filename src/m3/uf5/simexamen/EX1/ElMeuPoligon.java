package m3.uf5.simexamen.EX1;

import java.util.*;

public class ElMeuPoligon implements Iterable<Punt2D>{

    private TreeSet<Punt2D> poligon = new TreeSet<>(new Comparator<Punt2D>() {
        @Override
        public int compare(Punt2D o1, Punt2D o2) {
            return Integer.compare(o2.getY(),o1.getY());
        }
    });

    public void afegirPunt(Punt2D p){
        poligon.add(p);
    }

    @Override
    public Iterator<Punt2D> iterator() {
        return poligon.iterator();
    }

    public void printar(){
        for (Punt2D punt2D : poligon) {
            System.out.println(punt2D.toString());
        }
    }

    public void printarMesGran(){
        System.out.println("El punt que té la Y més gran és: "+poligon.first());
    }

}