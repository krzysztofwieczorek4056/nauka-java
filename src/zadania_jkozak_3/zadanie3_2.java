package zadania_jkozak_3;

import java.util.Random;

public class zadanie3_2 {
    public static void main(String[] args) {
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        System.out.println("zadanie jkozak3.2");
        int[] tablica = new int[20];
        Random liczby = new Random();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = liczby.nextInt(10)+1;
            System.out.print(tablica[i]);
            System.out.print(" ");
            if (tablica[i] == 1) {
                b++;
            }
            if (tablica[i] == 2) {
                c++;
            }
            if (tablica[i] == 3) {
                d++;
            }
            if (tablica[i] == 4) {
                e++;
            }
            if (tablica[i] == 5) {
                f++;
            }
            if (tablica[i] == 6) {
                g++;
            }
            if (tablica[i] == 7) {
                h++;
            }
            if (tablica[i] == 8) {
                j++;
            }
            if (tablica[i] == 9) {
                k++;
            }
            if (tablica[i] == 10) {
                l++;
            }

        }
        System.out.println();
        System.out.println("liczba 1 wyst�puje : " + b);
        System.out.println("liczba 2 wyst�puje : " + c);
        System.out.println("liczba 3 wyst�puje : " + d);
        System.out.println("liczba 4 wyst�puje : " + e);
        System.out.println("liczba 5 wyst�puje : " + f);
        System.out.println("liczba 6 wyst�puje : " + g);
        System.out.println("liczba 7 wyst�puje : " + h);
        System.out.println("liczba 8 wyst�puje : " + j);
        System.out.println("liczba 9 wyst�puje : " + k);
        System.out.println("liczba 10 wyst�puje : " + l);

    }
}
