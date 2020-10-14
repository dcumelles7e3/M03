package m3.uf5.camises;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ProvesCamisa {

    public static void main(String[] args) {
        ArrayList<Camisa> llista = new ArrayList<Camisa>();
        llista.add(new Camisa("XL", "Blau"));
        llista.add(new Camisa("L", "Vermell"));
        llista.add(new Camisa("M", "Blau"));
        llista.add(new Camisa("XXL", "Blanc"));
        llista.add(new Camisa("XS", "Rosa"));

        //Print camises de talla “XL”
        printCaracteristica(llista, new CaracteristicaCamisa() {
            @Override
            public boolean test(Camisa c) {
                return c.getTalla().equals("XL");
            }
        });

        printCaracteristica(llista, (Camisa c) -> c.getTalla().equals("XL"));

        //camises de color “Vermell”
        printCaracteristica(llista, new CaracteristicaCamisa() {
            @Override
            public boolean test(Camisa c) {
                return c.getColor().equals("Vermell");
            }
        });

        printCaracteristica(llista, (Camisa c) -> c.getColor().equals("Vermell"));


        //camises de talla “M” i color “Blau”
        printCaracteristica(llista, new CaracteristicaCamisa() {
            @Override
            public boolean test(Camisa c) {
                return c.getTalla().equals("M") && c.getColor().equals("Blau");
            }
        });

        printCaracteristica(llista, (Camisa c) -> c.getTalla().equals("M") && c.getColor().equals("Blau"));


//        llista.forEach(new Consumer<Camisa>() {
//            @Override
//            public void accept(Camisa camisa) {er
//                System.out.println(camisa.getColor());
//            }
//        });
//        llista.forEach((c)-> System.out.println(c.getColor()));

    }

    private static void printCaracteristica(ArrayList<Camisa> llista, CaracteristicaCamisa c) {
        for (Camisa p : llista) {
            if (c.test(p)) System.out.println(p);
        }
    }
}

@FunctionalInterface
interface CaracteristicaCamisa {
    boolean test(Camisa c);
}
