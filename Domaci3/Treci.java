package Domaci3;

import java.util.Scanner;

public class Treci {
    public static void main(String[] args) {

        // Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.
        // [i=0,n]
        // za n=6 -> 0 1 2 3 4 5 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pozitivan ceo broj ");
        int n = sc.nextInt();


        for (int i = 0; i<=n; i++) {
            System.out.println(i);
        }

    }
}
