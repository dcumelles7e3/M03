package m3.uf5.repas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        File f = new File("src\\m3\\uf5\\repas\\telefons.txt");
        HashMap<Integer,Double> hm = new HashMap<>();
        try {
            Scanner sc = new Scanner(f);
            //Afegir al hashmap
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] cut = linea.split(" ");
                int num = Integer.parseInt(cut[0]);
                double value = Double.parseDouble(cut[1].replace(',','.'));
                if (!hm.containsKey(num)){
                    hm.put(num,value);
                }else {
                    double aux = hm.get(num);
                    hm.put(num,value+aux);
                }
            }

            //Copiant per imprimir
            HashMap<Integer,Double> copy = new HashMap<>(hm);
            printMap(copy);

            List<Double> doubles = new ArrayList<>(hm.values());
            Collections.sort(doubles,Collections.reverseOrder());

            double max = doubles.get(0);
            Iterator it = hm.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                if (pair.getValue().equals(max)){
                    int key = (Integer) pair.getKey();
                    double val = (Double) pair.getValue();
                    System.out.println("El número que més ha consumit és "+key+" amb "+val+"€");
                }
                it.remove();
            }
        }catch (FileNotFoundException fn){
            System.out.println("No s'ha trobat el fitxer.");
        }
    }

    public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove();
        }
    }
}
