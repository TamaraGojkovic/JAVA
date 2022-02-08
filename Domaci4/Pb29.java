package Domaci4;

import java.util.Scanner;

public class Pb29 {

    // Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
    //Ispisati svaki treci element u obrnutom redosledu.
    // [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj clanova niza ");
        int n= sc.nextInt();
        System.out.println("Unesite clanove niza ");
        int [] niz= new int[n];

        for (int i = 0; i < niz.length ; i++) {
            niz [i]= sc.nextInt();
        }

        System.out.println("Svaki treci element niza u obrnutom redosledu je ");
        for (int j = niz.length-1; j >=0 ; j-=3) {
            System.out.println(niz[j]);
        }
    }
}
