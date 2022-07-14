package Zadanie2_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("podaj liczbę całkowtą");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int modulo = 0;

        for (int i = 1; i <= liczba; i++) {
            if (liczba % i == 0) {
                modulo += 1;
            }
        }
        if (liczba > 1) {
            System.out.println("liczba większa od 1");
        }
        if (modulo == 2) {
            System.out.println("liczba Pierwsza");
        }else {
            System.out.println("liczba nie jest pierwsza");
        }
    }
}
