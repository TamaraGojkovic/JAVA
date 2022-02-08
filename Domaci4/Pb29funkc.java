package Domaci4;

// Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
//Ispisati svaki treci element u obrnutom redosledu.
// [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
// * Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.


import java.util.Scanner;

public class Pb29funkc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj clanova niza ");
        int n= sc.nextInt();
        System.out.println("Unesite clanove niza ");
        int [] niz= new int[n];

        for (int i = 0; i < niz.length ; i++) {
            niz [i]= sc.nextInt();
        }

        funkcija(niz);
    }

    public static void funkcija (int [] tamara) {
        for (int j = tamara.length-1; j >=0 ; j -=3) {
            System.out.println("Svaki treci element niza u obrnutom redosledu je " + tamara[j]);
        }
    }
}

