package m3.uf5.simexamen.EX2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CercarParaula {
    public static void main(String[] args) {
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

        for (String linea : linees) {
            if (linea.contains("unes")) {
                System.out.println(linea);
                System.out.println(linea.indexOf("unes")+1);
            }
        }

        //System.out.println("Introdueix paraula a cercar: ");
        //String entrada = sc.nextLine();

    }
}
