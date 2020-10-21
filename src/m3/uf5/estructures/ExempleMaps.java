package m3.uf5.estructures;

import java.util.LinkedHashMap;

/**
 * 1) Canvieu HashMap per LinkedHashMap i TreeMap
 * 2) Introduiu clau Classe Etiqueta [int id, string descripcio]
 */
public class ExempleMaps {
    public static void main(String[] args) {
        LinkedHashMap <Integer, String> map = new LinkedHashMap<>();
        map.put(7,"Pepito");
        map.put(3,"Menganito");
        map.put(2,"Lolito");
        map.put(6,"Raskayu");
        map.put(8,"Mateu");
        map.put(98,"Damon");
        map.put(4,"Retro");
        map.put(10,"Tikipom");

        String nom = map.get(6);
        System.out.println(nom);
    }
}
