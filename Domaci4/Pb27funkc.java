package Domaci4;

import java.util.Scanner;

public class Pb27funkc {
    public static void main(String[] args) {

        //Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Napraviti funkciju koja ispisuje
        // svaki drugi element zadatog niza. Primer: [1, 2, 3, 4, 5] -> 1 3 5

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj clanova niza ");
        int n = sc.nextInt();

        System.out.println("Unesite clanove niza ");
        int [] niz = new int[n];

        for (int i = 0; i < niz.length ; i++) {
            niz[i] = sc.nextInt();
        }

        proba(niz);

    }

    public static void proba (int [] tam) {

        for (int j = 0; j < tam.length ; j+=2) {
            System.out.println("Svaki drugi clan ovog niza je " +  tam[j]);
        }
    }

}