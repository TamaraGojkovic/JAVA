package Domaci4;

//42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".

public class Pb42_2Nacin {
    public static void main(String[] args) {

        String Marija = "Ime Marija ne postoji u ovom nizu.";
        String Petar = "Ime Petar ne postoji u ovom nizu";

        String[] nizImena = {"Jovana", "Sanja", "Luka", "Strahinja", "Marija", "Aleksa"};

        for (int i = 0; i < nizImena.length; i++) {
            if (nizImena[i] == "Marija") {

                Marija = "Ime Marija postoji u ovom nizu.";

            } else if (nizImena[i] == "Petar") {
                Petar = "Ime Petar postoji u ovom nizu.";
            }

        }
        System.out.println(Marija + " " + Petar + ".");

    }
}
