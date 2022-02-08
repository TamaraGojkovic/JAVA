package Domaci3;

import java.util.Scanner;

public class NaizmenicnaSuma {
    public static void main(String[] args) {

        //Korisnik unosi vrednost broja n (int) sa konzole. Na standardni izlaz ispisati resenje izraza:
        //1 - 2 + 3 - .... (+/-) n.
        // 1 -2 + 3 -4 +5 -6 = -3


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0) {
                suma = suma - i;
            } else {
                suma = suma + i;
            }
        }
        System.out.println("Resenje izraza je: " + suma);
    }
}
