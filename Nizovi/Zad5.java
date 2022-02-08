package Nizovi;

public class Zad5 {
    public static void main(String[] args) {

        //Zadatak 5 - Napraviti niz integera i prikazati koji elementi su deljivi sa 3
        // Ako nijedan clan niza nije deljiv sa 3, ispisati u konzoli da nijedan clan nije deljiv sa 3

        int niz [] = {2,3,5,6,8,9};
        int suma = 0;
        boolean deljiv = false;

        for (int i = 0 ; i < niz.length; i++) {
            if (niz [i] % 3 ==0)
                System.out.println("Broj koji je deljivi sa 3 je: " + niz[i]);
            deljiv = true;

        }

        if (deljiv == false) {
            System.out.println("Nijedan clan nije deljiv sa 3");
        }
    }

}
