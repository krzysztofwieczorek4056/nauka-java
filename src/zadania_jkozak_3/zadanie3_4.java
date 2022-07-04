package zadania_jkozak_3;

import java.util.Scanner;

public class zadanie3_4 {
    public static void main(String[] args) {
        int liczba;
        int reszta;
        int[] tablica = new int[32];
        int i = 0;
        boolean pierwszy = true;
        boolean znak = true;
        int licznikPêtli = 0;
        int bitZnaku;
        System.out.println("zadanie jkozak 3.4");
        Scanner scanner = new Scanner(System.in);
        liczba = scanner.nextInt();
        // linnia ponizej gotowiec z internetu do sprawdzania;
        System.out.println("metoda ponizej gotowiec do sprawdzania zadania");
        System.out.println(Integer.toBinaryString(liczba));
        //pêtla do sprawdzania jak dzieli i jakie zostawia reszty
        System.out.println("tu wyskakuja dzielenia i reszty z dzieleñ do pomocy");
        if (liczba < 0) {
            bitZnaku = 1;
        } else {
            bitZnaku = 0;
        }
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
//            if (znak) {
//                tablica[i] = bitZnaku;
//                i++;
//                znak = false;
//            }
            if (liczba == 1) {
                break;
            }
        }
        if (liczba>0) {
            tablica[i] = bitZnaku;
            i++;
//            znak = false;
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
//            if (znak) {
//                tablica[i] = bitZnaku;
//                i++;
//                znak = false;
//            }
            if (liczba == -1) {
                break;
            }

        }
        if (liczba<0) {
            tablica[i] = bitZnaku;
            i++;
//            znak = false;
        }
        if (liczba == 0) {
            tablica[i] = liczba;
            licznikPêtli++;
        }
        System.out.println("gotowe rozwiazanie z wykorzystaniem tablicy ");
        if (liczba > 0) {
            for (i = licznikPêtli; i >= 0; i--) {
                if (i == licznikPêtli) {
                    System.out.print(tablica[i] + ".");
                } else {
                    System.out.print(tablica[i]);
                }
            }
        }
        if (liczba < 0) {
            for (i = licznikPêtli - 1; i >= 0; i--) {
                if (i == licznikPêtli - 1) {
                    System.out.print(tablica[i] + ".");
                }
                System.out.print(tablica[i]);

            }
        }
    }
}

//1100100
