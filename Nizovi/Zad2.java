package Nizovi;

public class Zad2 {
    public static void main(String[] args) {

        //Zadatak 2 - Upisati brojeve u niz i napisati sumu

        int[] nizBrojeva = {123, 456, 789, 0, 11};
        int suma = 0;

        for (int i = 0 ; i < nizBrojeva.length; i++) {
            suma=suma+ nizBrojeva[i];
        }
        System.out.println("Suma brojeva je " + suma);


    }
}
