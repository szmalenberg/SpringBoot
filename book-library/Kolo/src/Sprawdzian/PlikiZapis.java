package Sprawdzian;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PlikiZapis {

    public static void zapisz_do_pliku()throws IOException {
        PrintWriter zapisz = new PrintWriter("C:\\Users\\168763\\Desktop\\nowyProgram2.txt");
        zapisz.println("2");
        zapisz.println("-0,0000005");
        zapisz.println("333242543424,4");
        zapisz.println("8");
        zapisz.close();


    }




}



