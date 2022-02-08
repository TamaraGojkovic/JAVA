package Domaci3;

import java.util.Scanner;

public class Sedmi {
    public static void main(String[] args) {

        //Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite mesec rodjenja ");
        String mesec = sc.next();

        System.out.println("Unesite dan u mesecu svog rodjenja ");
        int dan = sc.nextInt();

        switch (mesec) {
            case "januar":
                if (dan<=20) {
                    System.out.println("Vas horoskopski znak je Jarac ");
                } else {
                    System.out.println("Vas horoskopski znak je Vodolija ");
                }
                break;
            case "februar":
                if (dan<=19) {
                    System.out.println("Vas horoskopski znak je Vodolija ");
                } else {
                    System.out.println("Vas horoskopski znak je Riba ");
                }
                break;
            case "mart":
                if (dan<=20) {
                    System.out.println("Vas horoskopski znak je Riba ");
                } else {
                    System.out.println("Vas horoskopski znak je Ovan ");
                }
                break;
            case "april":
                if (dan<=20) {
                    System.out.println("Vas horoskopski znak je Ovan ");
                } else {
                    System.out.println("Vas horoskopski znak je Bik ");
                }
                break;
            case "maj":
                if (dan<=21) {
                    System.out.println("Vas horoskopski znak je Bik ");
                } else {
                    System.out.println("Vas horoskopski znak je Blizanci ");
                }
                break;
            case "jun":
                if (dan<=21) {
                    System.out.println("Vas horoskopski znak je Blizanci ");
                } else {
                    System.out.println("Vas horoskopski znak je Rak ");
                }
                break;
            case "jul":
                if (dan<=22) {
                    System.out.println("Vas horoskopski znak je Rak ");
                } else {
                    System.out.println("Vas horoskopski znak je Lav ");
                }
                break;
            case "avgust":
                if (dan<=22) {
                    System.out.println("Vas horoskopski znak je Lav ");
                } else {
                    System.out.println("Vas horoskopski znak je Devica ");
                }
                break;
            case "septembar":
                if (dan<=22){
                    System.out.println("Vas horoskopski znak je Devica ");
                } else {
                    System.out.println("Vas horoskopski znak je Vaga ");
                }
                break;
            case "oktobar":
                if (dan<=23){
                    System.out.println("Vas horoskopski znak je Vaga ");
                } else {
                    System.out.println("Vas horoskopski znak je Skorpija ");
                }
                break;
            case "novembar":
                if (dan<=22){
                    System.out.println("Vas horoskopski znak je Skorpija ");
                } else {
                    System.out.println("Vas horoskopski znak je Strelac ");
                }
                break;
            case "decembar":
                if (dan<=21) {
                    System.out.println("Vas horoskopski znak je Strelac ");
                } else {
                    System.out.println("Vas horoskopski znak je Jarac ");
                }
                break;
            default:
                System.out.println("Niste dobro uneli naziv meseca, pokusajte ponovo ");
                break;



        }

    }
}
