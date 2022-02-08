package Nizovi;

public class Zad3 {
    public static void main(String[] args) {

        //Zadatak 3 - Ispisati najmanji broj niza ako su clanovi niza od 1 do 100
//Dodatak - Ispisati razliku izmedju minimuma i maximuma
//Dodatak - Koja je prosecna vrednost niza?


        int[] niz = {15, 63, 11, 98, 3, 76, 15};
        int min = 101;
        int max = 0;
        double suma = 0;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < min) {
                min = niz[i];
            }
        }
        System.out.println("Minimum je " + min);

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > max) {
                max = niz[i];
            }
        }
        System.out.println("Maksimum je " + max);
        System.out.println("Razlika je " + (max - min));

        for (int i = 0 ; i < niz.length; i++) {
            suma = suma + niz[i];
        }

        double prosek = suma / niz.length;
        System.out.println("Prosecna vrednost je " + prosek);

    }
}
