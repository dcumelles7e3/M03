package m3.uf5.simexamen.EX3;

import java.util.Scanner;

public class DataRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "^([0-2][0-9]|(3)[0-1])(\\/|\\-|\\.)(((0)[0-9])|((1)[0-2]))(\\/|\\-|\\.)\\d{4}$";
        System.out.println("Introdueix una data:");
        String resposta = sc.nextLine();
        if (resposta.matches(regex)){
            System.out.println("Correcte!");
        }else {
            System.out.println("Incorrecte!");
        }
    }
}
