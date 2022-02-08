package Domaci1_2;

import java.util.Scanner;

// Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije, 
// tako sto se ivice prostorije ucitavaju preko konzole. 
// (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).


public class Sintaksa1 {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Unesi duzinu prvog zida: ");
        double zid1 = scan.nextDouble();

        System.out.print("Unesi duzinu drugog zida: ");
        double zid2 = scan.nextDouble();

        System.out.print("Unesi visinu prostorije: ");
        double visina = scan.nextDouble();

        double plafon = zid1 * zid2;

        double okrecenaPovrsina = plafon + ((zid1*visina) * 2) + ((zid2*visina) * 2);

        System.out.println("Okrecena povrsina je " + okrecenaPovrsina + " m²");
    }
}
