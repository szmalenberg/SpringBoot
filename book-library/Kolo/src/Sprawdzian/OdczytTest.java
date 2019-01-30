package Sprawdzian;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class OdczytTest {
    public static void Od() throws FileNotFoundException {


        System.out.println("Wczytuje dane  pliku");
        File plik = new File("C:\\Users\\168763\\Desktop\\nowyProgram2.txt");
        Scanner odczyt = new Scanner(plik);

        while (odczyt.hasNextDouble()) {
            int id = Integer.parseInt(odczyt.nextLine());

            System.out.println("id:" + id);


        }
    }
}
