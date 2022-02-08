package Domaci4;

import java.util.Scanner;

//Napraviti funkciju koja vraca sumu prosledjenog niza.

public class Pb28funkc {

    /*
     * Sada imamo funkciju koja prima niz (dakle parametar je int[]) a vraca njen zbir
     * (dakle povratna vrednost je int)
     * */

    public static int suma(int[] nekiNiz){
        /*
         * Izracunavamo sumu na standardni nacin
         * */
        int sum = 0;
        for (int i = 0; i < nekiNiz.length; i++) {
            sum += nekiNiz[i];
        }

        /*
         * Vracamo izracunatu sumu
         * */
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         * Slicno, kreacija i unos niza:
         * */

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }

        /*
         * Prosledjujemo kreiran niz i prihvatamo povratnu vrednost funkcije - tj. sumu niza
         * */

        int sum = suma(arr);
        /*
         * Ova promenjiva sum je u drugom "scope-u" od one deklarisane u funkciji suma.
         * (tj ne pripadaju istim ili ugnjezdenim viticastim zagradama)
         * Zato se java ne buni da je vec deklarisana!
         * */

        System.out.println(sum);

    }
}
