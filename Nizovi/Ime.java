package Nizovi;

public class Ime {
    public static void main(String[] args) {
        String nizBoja[] = new String[4]; //BROJ U ZAGRADI NIJE INDEXIRAN

        nizBoja[0] = "plava";
        nizBoja[1] = "crvena";
//nizBoja[2] = "ljubicasta";
        nizBoja[3] = "bela";

        System.out.println(nizBoja[0]);
        System.out.println(nizBoja[1]);
        System.out.println(nizBoja[2]);
        System.out.println(nizBoja[3]);

        int duzinaNiza = nizBoja.length;

        for (int i = 0; i < nizBoja.length; i++) {
            System.out.println(nizBoja[i]);
        }

//------------------------------

        String nizImena[] = {"Ana", "Nikola", "Marija", "Stefan"};

        for (int i = 0; i < nizImena.length; i++) {
            System.out.println((i+1) + ". ime niza je " + nizImena[i]);
        }

//-----------------------------

        int[] nizBrojeva = {123, 544, -124, 0};

        int c = nizBrojeva[0] + nizBrojeva[1];
        System.out.println(c);
        int b = nizBrojeva[0+1];
        System.out.println(b);

        for (int i = 0 ; i < nizBrojeva.length; i++) {
            System.out.println(nizBrojeva[i]);
        }

//------------------------------

        String[] nizSlatkisa = {"Cokolada", "Karamela", "Sladoled", "Voce"};

        for (int i = 0; i < nizSlatkisa.length; i++) {
            System.out.println(nizSlatkisa[i]);
        }

        nizSlatkisa[1] = "Vanila";

        for (int i = 0; i < nizSlatkisa.length; i++) {
            System.out.println(nizSlatkisa[i]);
        }

//nizSlatkisa[0] = 123;
//Program ne dopusta da unesete pogresan tip podataka
    }
}
