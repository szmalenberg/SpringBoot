package Sprawdzian;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OdczytDanych {

    public static String sprawdzenieSciezki() throws IOException {
        String sciezka;
        System.out.println("Podaj ścieżkę do pliku tekstowego");
        Scanner scanner = new Scanner(System.in);
        sciezka = scanner.nextLine();
        File file = new File(sciezka);
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("OK. Plik istnieje.");
            }
        } else {
            System.out.println("Nie poprawna scieżka.Podaj jeszcze raz.");
            sprawdzenieSciezki();
        }
        return sciezka;
    }
}