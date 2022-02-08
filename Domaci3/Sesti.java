package Domaci3;

import java.util.Scanner;

public class Sesti {
    public static void main(String[] args) {

        //Ispisati proizvod prvih n celih brojeva [1, n]
        // n=4 -> 1*2*3*4=24

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo broj ");
        int n = sc.nextInt();
        int proizvod = 1;

        for (int i=1; i<=n; i++ ) {
           proizvod = proizvod * i;
        }
        System.out.println("Proizvod prvih n celih brojeva je " + proizvod);
    }
}
