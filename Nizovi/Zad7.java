package Nizovi;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {

        //Napisati program gde korisnik unosi brojeve preko skenera sve dok ne ponovi dva ista unosa

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi velicinu niza");
        int[] broj = new int[sc.nextInt()];
        System.out.println("Unesi clanove niza");
        broj[0] = sc.nextInt();
        for (int i = 1 ; i<broj.length ; i++) {
            broj[i] = sc.nextInt();
            if (broj[i] == broj[i-1]) {
                break;
            }
        }
        System.out.println("Kraj programa");


    }
}
