package Domaci4;

import java.util.Scanner;

public class Pb27 {
    public static void main(String[] args) {

        //Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
        //Primer: [1, 2, 3, 4, 5] -> 1 3 5

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj elemenata niza ");
        int n = sc.nextInt();

        /*
         * Pravimo niz unete duzine
         * */
        System.out.println("Unesite clanove niza ");
        int [] niz = new int[n];

        for (int i = 0; i < niz.length ; i++) {
            niz [i]= sc.nextInt();
        }

        System.out.println("Svaki drugi element ovog niza je ");
        for (int i = 0; i < niz.length; i+=2) {
            System.out.println(niz[i]);
        }
    }
}
