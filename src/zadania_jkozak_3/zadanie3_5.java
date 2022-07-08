package zadania_jkozak_3;

import java.util.Scanner;

public class zadanie3_5 {
    public static void main(String[] args) {
        int liczba;
        int reszta;
        int[] tablica = new int[32];
        int i = 0;
        boolean pierwszy = true;
        boolean znak = true;
        int licznikPetli = 0;
        int bitZnaku;
        System.out.println("zadanie jkozak 3.5");
        System.out.println("kropka po bicie znaku jest umowna dla lepszego odczytu");
        Scanner scanner = new Scanner(System.in);
        liczba = scanner.nextInt();
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
                licznikPetli++;
            }
            if (liczba > 1) {
                liczba = liczba / 2;
                reszta = liczba % 2;
                tablica[i] = reszta;
                i++;
                licznikPetli++;
                System.out.println(liczba + " " + reszta);
            }
            if (liczba == 1) {
                break;
            }
        }
        if (liczba > 0) {
            tablica[i] = bitZnaku;
            i++;
        }
        while (liczba < 0) {

            if (pierwszy) {
                reszta = -liczba % 2;
                if (reszta == 0) {
                    reszta = reszta + 1;
                } else {
                    reszta = reszta - 1;
                }
                tablica[i] = reszta;
                System.out.println(liczba + " " + reszta);
                pierwszy = false;
                i++;
                licznikPetli++;
            }
            if (liczba < -1) {
                liczba = liczba / 2;
                reszta = -liczba % 2;
                if (reszta == 0) {
                    reszta = reszta + 1;
                } else {
                    reszta = reszta - 1;
                }
                tablica[i] = reszta;
                i++;
                licznikPetli++;
                System.out.println(liczba + " " + reszta);
            }

            if (liczba == -1) {
                break;
            }

        }
        if (liczba < 0) {
            tablica[i] = bitZnaku;
            i++;

        }
        if (liczba == 0) {
            tablica[i] = liczba;
            licznikPetli++;
        }

        System.out.println("gotowe rozwiazanie z wykorzystaniem tablicy ");
        if (liczba > 0) {
            for (i = licznikPetli; i >= 0; i--) {
                if (i == licznikPetli) {
                    System.out.print(tablica[i] + ".");
                } else {
                    System.out.print(tablica[i]);
                }
            }
        }
        if (liczba < 0) {
            for (i = licznikPetli; i >= 0; i--) {
                if (i == licznikPetli ) {
                    System.out.print(tablica[i] + ".");
                } else {
                    System.out.print(tablica[i]);
                }
            }
        }
    }
}
//zapis uzupe³nienie do jednego to
//dla liczb dodatnich taki sam jak w binarnych
//dla liczb ujemnych negacja liczby dodatniej
// negacja to zamienienie bitu o wartosci 0 na 1
// a bitu o wartosci 1 na 0.
// 5 = 0.101
// -5 = 1.010
//-99 = 0011100
//99 = 1100011