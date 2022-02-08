package Domaci4;

import java.util.Scanner;

public class Pb31 {

    // Napisati funkciju koja racuna proizvod 3 broja.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi tri broja: ");
        int prvi = sc.nextInt();
        int drugi = sc.nextInt();
        int treci = sc.nextInt();

        System.out.println("Proizvod ova 3 broja je: " + proizvod(prvi,drugi,treci));

    }

    public static int proizvod (int x, int y, int z) {

        int p = x * y * z;
        return p;

        //verovatno je trebalo sa double al moze i ovako
    }
}
