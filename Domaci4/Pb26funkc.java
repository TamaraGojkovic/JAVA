package Domaci4;

import java.util.Scanner;

//Napraviti funkciju koja ispisuje dat niz u obrnutom redosledu.

public class Pb26funkc {
    public static void obrnuto(int[] niz){
        /*
         * Prolazimo kroz niz u obrnutom redosledu
         * */
        for (int i = niz.length - 1; i >= 0 ; i--) {
            System.out.println(niz[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         * Isti ovaj zadatak preko funkcije.
         * */

        /*
         * Funkcija treba da primi neki proizvoljan niz (ne znamo mu ni duzinu ni koji su konkretni elementi)
         * i da ispise njegove elemente obrnutim redosledom.
         * Kao sto vidimo iz teksta, mi nista ovde ne vracamo, vec samo ispisujemo - pa je funkcija tipa void.
         * */

        /*
         * Kreiramo niz na isti nacin
         * */

        int n = sc.nextInt();
        int[] niz = new int[n];
        for (int i = 0; i < niz.length; i++) {
            int x = sc.nextInt();
            niz[i] = x;
        }

        /*
         * Pozivamo funkciju obrni, kojoj prosledjujemo kao argument
         * upravo kreiran niz
         * */
        obrnuto(niz);
    }
}
