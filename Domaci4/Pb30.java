package Domaci4;

import java.util.Scanner;

public class Pb30 {

    //Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
    // Izracunati proizvod tog niza. Primer: [2, 4] -> 8

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu niza: ");
        int n = sc.nextInt();
        System.out.println("Unesite elemente niza: ");
        int [] niz = new int[n];

        for (int i = 0; i < niz.length; i++) {
            niz [i]= sc.nextInt();
        }

        int p=1;
        for (int i = 0; i < niz.length; i++) {
            p= p * niz[i];
        }
        System.out.println("Proizvod elemenata niza je: " + p);

    }
}
