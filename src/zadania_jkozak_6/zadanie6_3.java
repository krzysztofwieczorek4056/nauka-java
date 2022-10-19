package zadania_jkozak_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zadanie6_3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("zadanie j.kozak 6.3");
        String nazwaPliku = "text2.txt";
        String nazwaPlikuWyj = "tekstwyjsciowy.txt";
        sumujIZapisz(nazwaPliku, nazwaPlikuWyj);

    }

    public static void sumujIZapisz(String nazwaPliku, String nazwaPlikuWyj) throws FileNotFoundException {


        File plik = new File(nazwaPliku);
        File plikwyjs = new File(nazwaPlikuWyj);
        PrintWriter zapis = new PrintWriter(nazwaPlikuWyj);
        PrintWriter zapis2 = new PrintWriter(nazwaPlikuWyj);
        StringBuilder text = new StringBuilder();
        Scanner scanner = new Scanner(plik);
        while (scanner.hasNext()) {
            text.append(scanner.nextLine());
        }
        String text2 = text.toString();
        int cyfry;
        int suma = 0;

        System.out.println(text2);
        String[] tablicaZnakow = text2.split("[a-z]");

        for (String znaki : tablicaZnakow) {
            if (znaki.isEmpty()) {
                znaki = "0";
            }
            cyfry = Integer.parseInt(znaki);
            suma = cyfry + suma;
        }
        suma = suma + 1;

        zapis.println("suma liczb w tekscie wynosi test2 : " + suma);
        zapis.close();

        StringBuilder textwyj = new StringBuilder();
        scanner = new Scanner(plikwyjs);
        while (scanner.hasNext()) {
            textwyj.append(scanner.nextLine());
        }
        String tekstwyjs = textwyj.toString();
        System.out.println(tekstwyjs);
        if (!tekstwyjs.isEmpty()) {
            suma = suma + suma;
            zapis2.println("ponowne uruchomienie suma wynosi : " + suma);
            zapis2.close();
            System.out.println(suma);
        }
    }
}
