package Domaci4;

import java.util.Scanner;

//Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati taj niz u obrtnutom redosledu
//Primer: [4, 2, 3, 5] -> 5 3 2 4

public class Pb26 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         * Unosimo duzinu niza n preko skenera
         * */
        int n = sc.nextInt();

        /*
         * Kreiramo niz intova duzine n
         * */
        int[] niz = new int[n];
        // Svi elementi ovog niza su automatski postavljeni na 0, dakle npr ako je duzina niza 4: [0, 0, 0, 0]

        /*
         * Unosimo n brojeva i smestamo ih u niz
         * */
        for (int i = 0; i < niz.length; i++) {
            // Na poziciju (index niza) i, smestamo unesen broj:
            int x = sc.nextInt();
            niz[i] = x;
        }

        /*
         * Obrcemo niz.
         * Sada nam je niz[] nekog oblika kao:
         * [4, 2, 3, 5]
         * Mi hocemo da ispisemo njegove elemente iduci od poslednjeg (5) do pocetnog (4). Dakle:
         * 5 3 2 4
         * */

        /*
         * Krecemo od poslednjeg elementa - on je na poziciji duzine niza - 1
         * niz:     [4, 2, 3, 5] - duzina = 4
         * pozicija: 0  1  2  3
         *
         * Dakle 5 je na poziciji niz.length - 1 = 4 - 1 = 3
         * */
        for (int i = niz.length - 1; i >= 0; i--) {
            System.out.println(niz[i]);
        }

    }
}
