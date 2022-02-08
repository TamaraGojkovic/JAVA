package Nizovi;

public class Zad1 {
    public static void main(String[] args) {

    //Zadatak 1 - Staviti dane u nedelji u niz i ispisati ih
        //Napraviti niz broja dana u nedelji i ispisati pre naziva dana u nedelji

   /*
    String daniUNedelji[] = {"ponedeljak", "utorak", "sreda", "cetvrtak", "petak", "subota", "nedelja"};

            for(int i = 0; i<daniUNedelji.length; i++) {
        // System.out.println(daniUNedelji[i]);
        System.out.println((i+1) + ". dan u nedelji je " + daniUNedelji[i]);
    }

    */

        String dani [] = {"ponedeljak", "utorak", "sreda", "cetvrtak", "petak", "subota", "nedelja"};
        int broj [] = {1,2,3,4,5,6,7};
        for(int i = 0; i<dani.length; i++) {
            System.out.println(broj[i] + ". dan u nedelji je "+ dani[i]);
        }

}
}
