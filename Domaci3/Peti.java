package Domaci3;

import java.util.Scanner;

public class Peti {
    public static void main(String[] args) {

        // Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.
        // [-14, 2n] za n=2 -> -14 -13..0..4

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pozitivan ceo broj ");
        int n = sc.nextInt();

        for (int i=(-14); i<=(2*n) ; i++ ) {
            System.out.println(i);
        }
    }
}
