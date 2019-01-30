package Sprawdzian;

import java.io.BufferedReader;
import java.io.FileReader;

public class OdczytTablica {
    String filePath = ("C:\\Users\\168763\\Desktop\\nowyProgram2.txt\\");

    public static void readFile(String filePath) throws Exception {
        FileReader fileReader = new FileReader(filePath);
        double a;
        double suma = 0;
        double mediana;
        int iloscWierszy = 0;
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println("te"+fileReader);
            String textLine = bufferedReader.readLine();
            String liczbaKolumn = bufferedReader.readLine();
            int iloscKolumn = Integer.valueOf(liczbaKolumn);
            double[] tablica1 = new double[iloscKolumn];
        String w1;
        String wtrzy[] = new String[tablica1.length];
        for (int i = 0; i < wtrzy.length; i++) {
            System.out.println("Tablica:"+tablica1[i]);
            w1 = bufferedReader.readLine();

            }
        }}
