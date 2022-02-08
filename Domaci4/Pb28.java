package Domaci4;

import java.util.Scanner;

public class Pb28 {

    // Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati sumu tog niza.
    //Primer: [1, 2, 3, 4, 5] -> 15 (1 + 2 + 3 + 4 + 5 = 15)

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
         * Idemo kroz niz i sabiramo element po element
         * */
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
