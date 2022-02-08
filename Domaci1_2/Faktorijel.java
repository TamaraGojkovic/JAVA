package Domaci1_2;

// Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
// Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao: n! = n * (n-1) * (n-2) * ... * 2 * 1.

import java.util.Scanner;

public class Faktorijel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite pozitivan ceo broj: ");
        int broj = sc.nextInt();
        int faktorijal = 1;
        for (int i = 1; i <= broj; i++) {
            faktorijal = faktorijal * i;

        }
        System.out.println("Faktorijal broja " + broj + " je: " + faktorijal);

    }
}
