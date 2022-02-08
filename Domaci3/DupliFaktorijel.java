package Domaci3;

import java.util.Scanner;

public class DupliFaktorijel {
    public static void main(String[] args) {

        //Napisati program koji racuna dupli faktorijel unetog broja n. Dupli faktorijel broja n je:
        //n!! = n * (n-2) * (n-4) * ... * (2 ili 1)
        // n=5 -> 5 * 3 * 1= 15
        // n=6 -> 6*4*2=48

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite pozitivan ceo broj: ");
        int n = sc.nextInt();
        int f = 1;

        if (n%2 == 0){
            for (int i=n; i>=2; i=i-2) {
                f = f * i;
            }
        } else {
            for (int i=n; i>=1; i=i-2) {
                f = f * i;
            }
        }

        System.out.println("Dupli faktorijel broja n je: " + f);

    }
}
