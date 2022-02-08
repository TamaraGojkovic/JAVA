package Nizovi;


import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);

        //Zadatak 4 - Napraviti niz od 5 elemenata, svaki element uneti preko skenera

        int[] niz = new int[5];
        System.out.println("Unesi 5 brojeva ");

        for (int i = 0 ; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        System.out.println("Uneti brojevi su");
        for (int i = 0 ; i < niz.length; i++) {
            System.out.println(niz[i]);
        }

    }
}
