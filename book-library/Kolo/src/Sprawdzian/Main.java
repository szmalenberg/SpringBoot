package Sprawdzian;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

        String sciezka = OdczytDanych.sprawdzenieSciezki();
        System.out.println("Podaj ścieżkę wyjściową do zapisu");
        String sciezkaWyjsciowa;

        Scanner scanner = new Scanner(System.in);
        sciezkaWyjsciowa = scanner.nextLine();

        String obliczeniaSumyISredniej = Pliki.OdczytIObliczenia(sciezka);
        String mediana2 = "Mediana = " + String.valueOf(Pliki.oblicMediane(sciezka));

        Pliki.zapisPliku(sciezkaWyjsciowa, mediana2);
        Pliki.zapisPliku(sciezkaWyjsciowa, obliczeniaSumyISredniej);
    }
}

