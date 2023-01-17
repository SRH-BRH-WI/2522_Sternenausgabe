import java.util.Scanner;

public class Sternenausgabe {

    // Eingabe: Wieviele Zeilen: 5
    // Ausgabe:
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // (Version 1)
    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * *
    // (Version 2)

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Wieviele Zeilen: ");
        int anzahl = eingabe.nextInt();

        for (int anzahlSterneProZeile=1; anzahlSterneProZeile<=anzahl; anzahlSterneProZeile++) {
            for (int space=0; space < anzahl-anzahlSterneProZeile; space++)
                System.out.print(" ");
            for (int sterne=0; sterne < anzahlSterneProZeile; sterne++)
                System.out.print(" *");
            System.out.println();
        }

    }
}
