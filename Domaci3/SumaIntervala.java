package Domaci3;

import java.util.Scanner;

public class SumaIntervala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n]
        // m=2, n=6, suma=2+3+4+5+6=20

        System.out.println("Unesite ceo broj ");
        int m = sc.nextInt();
        System.out.println("Unesite ceo broj koji je veci ili jednak prethodno unetom ");
        int n = sc.nextInt();

        int suma=0;

        for (int i=m; i<=n; i++) {
            suma = suma + i;
        }
        System.out.println("Suma unetih brojeva je " + suma);

    }
}
