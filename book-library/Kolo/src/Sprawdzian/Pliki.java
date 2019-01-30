package Sprawdzian;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Pliki {

    public static String OdczytIObliczenia(String filePath) throws Exception {
        FileReader fileReader = new FileReader(filePath);
        double a;
        double suma = 0;
        double srednia = 0;
        int iloscWierszy = 0;
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            String textLine = bufferedReader.readLine();
            do {
                try {
                    a = Double.parseDouble(textLine);
                    suma = a + suma;
                    System.out.println(textLine);
                    textLine = bufferedReader.readLine();
                    iloscWierszy++;
                } catch (NumberFormatException e) {
                    System.out.println("Nieprawidłowe dane!!!");
                    break;
                }
            } while (textLine != null);
            srednia = suma / iloscWierszy;
            System.out.println("Suma to: " + suma + "\nśrednia to:" + srednia);
        } finally {
            bufferedReader.close();
        }
        return "Suma to: " + suma + "Srednia to: " + srednia;
    }

    public static double oblicMediane(String sciezka) throws IOException {
        double liczba;
        int iloscWierszy = 0;
        int srodkowyElementListy;
        double mediana = 0;
        int srodkowyElementListyNieparzystej;
        List<Double> lista = new ArrayList<Double>();
        FileReader fileReader = new FileReader(sciezka);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            String textLine = bufferedReader.readLine();
            do {
                try {
                    liczba = Double.parseDouble(textLine);
                    textLine = bufferedReader.readLine();
                    lista.add(liczba);
                    iloscWierszy++;
                } catch (NumberFormatException e) {
                    System.out.println("Nieprawidłowe dane!!!");
                    break;
                }
            }
            while (textLine != null);

        } finally {
            Collections.sort(lista);

            bufferedReader.close();
        }
        System.out.println("Lista to:" + lista);
        System.out.println("Wyliczam medianę!");

        if (lista.size() % 2 == 0) {
            srodkowyElementListy = lista.size() / 2;
            mediana = (lista.get(srodkowyElementListy - 1) + lista.get(srodkowyElementListy)) / 2;
            System.out.println("Mediana to:" + mediana);
        } else {
            srodkowyElementListy = lista.size() - 1;
            srodkowyElementListyNieparzystej = srodkowyElementListy / 2;
            mediana = lista.get(srodkowyElementListyNieparzystej);
            System.out.println("Mediana to:" + mediana);
        }
        return mediana;
    }

    public static void zapisPliku(String sciezkaWyjsciowa, String tekst) throws IOException {
        FileWriter pw = new FileWriter(sciezkaWyjsciowa, true);
        BufferedWriter out = new BufferedWriter(pw);
        out.write(tekst + "\n");
        out.close();
    }
}





