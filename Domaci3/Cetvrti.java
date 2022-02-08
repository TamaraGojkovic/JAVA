package Domaci3;

import java.util.Scanner;

public class Cetvrti {
    public static void main(String[] args) {

        //Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.
        // [n, i=0], za n=(-5) -> -5 -4 -3 -2 -1 0


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite negativan ceo broj ");
        int n = sc.nextInt();

        for (int i=n; i<=0; i++) {
            System.out.println(i);
        }
    }
}
