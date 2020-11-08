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
        Scanner sc = new Scanner(System.in);
        List<String> linees = new ArrayList<>();
        File f = new File("src\\m3\\uf5\\simexamen\\EX2\\arxiu.txt");

        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                linees.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException fn) {
            System.out.println("No s'ha trobat l'arxiu.");
        }

        int lin = 1;
        for (String linea : linees) {
            if (linea.contains("unes")) {
                System.out.println("Linea: "+lin);
                System.out.println(linea);
                int i = linea.indexOf("unes");
                while(i >= 0) {
                    System.out.println(i+1);
                    i = linea.indexOf("unes", i+1);
                }

            }
            lin++;
        }

        //System.out.println("Introdueix paraula a cercar: ");
        //String entrada = sc.nextLine();

    }
}
