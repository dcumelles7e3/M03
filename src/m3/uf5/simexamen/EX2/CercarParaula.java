package m3.uf5.simexamen.EX2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CercarParaula {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap();
        String regex = "(?i)[c|t][a-z]*(s)";
        Scanner sc = new Scanner(System.in);
        List<String> linees = new ArrayList<>();
        List<String> matches = new ArrayList<>();
        File f = new File("src/m3/uf5/simexamen/EX2/arxiu.txt");

        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                linees.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException fn) {
            System.out.println("No s'ha trobat l'arxiu.");
        }

        System.out.println("Text llegit:");
        for (String linea : linees) {
            System.out.println(linea);
        }

        System.out.println("\nIntrodueix paraula a cercar: ");
        String entrada = sc.nextLine();

        int lin = 1;
        for (String linea : linees) {
            String[] paraules = linea.split(" ");
            for (String paraula : paraules) {
                if (paraula.matches(regex)){
                    matches.add(paraula);
                }
            }
            if (linea.contains(entrada)) {
                System.out.println("Linea: "+lin);
                System.out.println(linea);
                ArrayList<Integer> llista = new ArrayList<>();
                int i = linea.indexOf(entrada);
                llista.add(i+1);
                while(i >= 0) {
                    i = linea.indexOf(entrada, i+1);
                    if (i!=-1){
                    llista.add(i+1);}
                }
                map.put(lin,llista);
            }
            lin++;
        }
        if (map.isEmpty()){
            System.out.println("No s'han trobat coincidencies.");
        }else{
        System.out.println("\nTrobada a {LINEA=[INDEX]}");
        System.out.println(map.toString());}

        System.out.println("Matches amb regex:");
        System.out.println(matches.toString());
    }
}
