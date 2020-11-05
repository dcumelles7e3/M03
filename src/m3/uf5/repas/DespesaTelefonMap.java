package m3.uf5.repas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DespesaTelefonMap {
    public static void main(String[] args) {
        String nomFitxer = "src\\m3\\uf5\\repas\\telefons.txt";
        HashMap<Integer, Double> mapa = generarMapaTelefonDespesa(nomFitxer);
        System.out.println("Mapa tal qual amb hash");
        mostrarMapa(mapa);
        System.out.println("Telèfon de despesa màxima");
        mostrarTelefonAmbDespesaMaxima(mapa); //versió amb un TreeSet
    }


    public static HashMap<Integer, Double> generarMapaTelefonDespesa(String nomFitxer) {
        HashMap<Integer, Double> mapa = new HashMap();
        try {
            File fitxerEntrada = new File(nomFitxer);
            Scanner in = new Scanner(fitxerEntrada);
            while (in.hasNextLine()) {
                String[] dades = in.nextLine().split(" ");
                int telf = Integer.parseInt(dades[0]); //suposem que el format és correcte
                double sum = Double.parseDouble(dades[1]); //suposem que el format és correcte
                if (mapa.containsKey(telf)) {
                    double j = mapa.get(telf);
                    mapa.put(telf, j + sum);
                } else {
                    mapa.put(telf, sum);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat");
        }
        return mapa;
    }

    public static void mostrarMapa(Map<Integer, Double> mapa) {
        //mostrar mapa <telf, despesa>
        for (Integer tlf : mapa.keySet()) {
            System.out.println(tlf + " " + mapa.get(tlf));
        }
        System.out.println("------------------------------");
    }

    /**
     * Rep un mapa i es passa a un TreeSet amb ordre (Comparable/Comparator) per despesa
     * Mostra el primer element d'un TreeSet ordenat (first o last element)
     *
     * @param mapa un HashMap amb <Integer,Double>
     */
    public static void mostrarTelefonAmbDespesaMaxima(HashMap<Integer, Double> mapa) {
        /* passar-ho a un arbre, que té ordre i agafar el primer */

        TreeSet<Map.Entry<Integer, Double>> sortedSet = new TreeSet<Map.Entry<Integer, Double>>(
                new Comparator<Map.Entry<Integer, Double>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Double> e1,
                                       Map.Entry<Integer, Double> e2) {
                        return e2.getValue().compareTo(e1.getValue());
                    }
                });

        sortedSet.addAll(mapa.entrySet());
        System.out.println("El de més despesa és: "+sortedSet.first());
        for(Map.Entry<Integer, Double> entrades: sortedSet){
            System.out.println(entrades.getKey()+" "+entrades.getValue());
        }
    }



}

