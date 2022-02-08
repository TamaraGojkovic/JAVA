package Domaci3;

import java.util.Scanner;

public class Prvi {
    public static void main(String[] args) {

        // Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj ");
        int n= sc.nextInt();

        if (n%2 == 0) {
            System.out.println("Uneti broj je paran");
        } else {
            System.out.println("Uneti broj je neparan");
        }

    }
}
