package Domaci1_2;

import java.util.Scanner;

// Na standardni ulaz se unose dva cela broja. Ispisati na standardnom izlazu u zasebnim redovima zbir, razliku,
// proizvod, kolicnik i ostatak deljenja prvog broja drugim tim redom.


public class Aritmeticke {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite prvi ceo broj ");
        int a = sc.nextInt();
        System.out.print("Unesite drugi ceo broj ");
        int b = sc.nextInt();

        System.out.println("Zbir brojeva = " + (a + b));
        System.out.println("Razlika brojeva = " + (a - b));
        System.out.println("Proizvod brojeva = " + (a * b));
        System.out.println("Kolicnik brojeva = " + (a / b));
        System.out.println("Ostatak deljenja prvog broja drugim = " + (a % b));

        System.out.println("Kraj programa");
    }

}
