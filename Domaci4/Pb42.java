package Domaci4;

public class Pb42 {
    public static void main (String[] args){

        //42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".

        String Marija = "Ime Marija ne postoji u ovom nizu.";
        String Petar = "Ime Petar ne postoji u ovom nizu";

        String [] niz= {"Jovan", "Sonja", "Luka", "Ivana", "Marija", "Aleksandar"};

        for (int i= 0; i<niz.length; i++) {
            if (niz [i]=="Marija" ) {
                Marija= "Ime Marija postoji u ovom nizu.";
            } else if (niz [i]=="Petar") {
                Petar= "Ime Petar postoji u ovom nizu.";
            }
        }
        System.out.println(Marija + " " + Petar + ".");

    }

}
