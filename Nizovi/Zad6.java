package Nizovi;

public class Zad6 {
    public static void main(String[] args) {


        //Napisati niz od 10 brojeva koji ce se sabirati do 100, kada predje 100 treba ispisati za koliko je presao
//Na primer ako imamo niz 80, 10, 9, 3, 5, 7, 22, 90, 8
//Treba da nam ispise 80, 10, 9, 3 i onda poruka "Presli ste granicu za 2"


        int[] niz = {80, 10, 10, 3, 5, 7, 22, 90, 8, 11};
        int zbir = 0;

        for (int i = 0 ; i < niz.length; i++) {
            zbir = zbir + niz[i];
            System.out.println("Dodat je broj " + niz[i]);
            System.out.println("Zbir je " + zbir);
            if (zbir == 100) {
                System.out.println("Dostigli ste 100");
                break;
            }
            else if (zbir>100) {
                System.out.println("Presli ste 100 za " + (zbir - 100));
                break;
            }
        }

    }
}
