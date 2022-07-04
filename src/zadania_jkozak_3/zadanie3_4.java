package zadania_jkozak_3;

import java.util.Scanner;

public class zadanie3_4 {
    public static void main(String[] args) {
        int liczba;
        int reszta;
        int[] tablica = new int[32];
        int i = 0;
        boolean pierwszy = true;
        int licznikPêtli = 0;
        System.out.println("zadanie jkozak 3.4");
        Scanner scanner = new Scanner(System.in);
        liczba = scanner.nextInt();
        // linnia ponizej gotowiec z internetu do sprawdzania;
        System.out.println("metoda ponizej gotowiec do sprawdzania zadania");
        System.out.println(Integer.toBinaryString(liczba));
        //pêtla do sprawdzania jak dzieli i jakie zostawia reszty
        System.out.println("tu wyskakuja dzielenia i reszty z dzieleñ do pomocy");
        while (liczba >= 1) {

            if (pierwszy) {
                reszta = liczba % 2;
                tablica[i] = reszta;
                System.out.println(liczba + " " + reszta);
                pierwszy = false;
                i++;
                licznikPêtli++;
            }
            if (liczba > 1) {
                liczba = liczba / 2;
                reszta = liczba % 2;
                tablica[i] = reszta;
                i++;
                licznikPêtli++;
                System.out.println(liczba + " " + reszta);
            }
            if (liczba == 1) {
                break;
            }
        }
        while (liczba < 0) {
            if (pierwszy) {
                reszta = -liczba % 2;
                tablica[i] = reszta;
                System.out.println(liczba + " " + reszta);
                pierwszy = false;
                i++;
                licznikPêtli++;
            }
            if (liczba < -1) {
                liczba = liczba / 2;
                reszta = -liczba % 2;
                tablica[i] = reszta;
                i++;
                licznikPêtli++;
                System.out.println(liczba + " " + reszta);
            }
            if (liczba == -1) {
                break;
            }

        }
        if (liczba == 0) {
            tablica[i] = liczba;
            licznikPêtli++;
        }
        System.out.println("gotowe rozwiazanie z wykorzystaniem tablicy ");
        for (i = licznikPêtli - 1; i >= 0; i--) {
            if(liczba>0){
            System.out.print(tablica[i]);}
            if (liczba<0){
                if(i == licznikPêtli-1){
                System.out.print("1." );
            }
                System.out.print(tablica[i]);;
        }
    }
}}

//1100100
