package Domaci4;

public class pb41 {
    public static void main (String[] args){

//41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.

        double suma = 0;
        double prosecnavrednost;

        double [] niz = {1.6, 2.8, 18.2, 4.4, 5.7, 0.03, 17.75};

        for(int i = 0; i< niz.length; i++) {

            suma = suma + niz [i];
        }

        prosecnavrednost = suma / niz.length;
        System.out.println("Prosecna vrednost niza je "+ prosecnavrednost + ".");

    }
}
