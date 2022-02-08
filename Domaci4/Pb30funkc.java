package Domaci4;

//Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
// Izracunati proizvod tog niza. Primer: [2, 4] -> 8
// * Napisati funkciju koja racuna proizvod elemenata zadatog niza.

import java.util.Scanner;

public class Pb30funkc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu niza: ");
        int n = sc.nextInt();
        System.out.println("Unesite elemente niza: ");
        int [] niz = new int[n];

        for (int i = 0; i < niz.length; i++) {
            niz [i]= sc.nextInt();
        }

        System.out.println("Proizvod elemenata niza je: " + proizvod(niz));
    }

    public static int proizvod (int [] x){
        int p=1;
        for (int i = 0; i < x.length; i++) {
            p=p * x[i];
    }
        return p;
}
}
