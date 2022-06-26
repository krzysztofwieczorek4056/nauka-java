package zadania_jkozak_2;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class zadanie2_5 {
    public static void main(String @NotNull [] args) {
        System.out.println("zadanie jvkozak zadanie2.5");
        boolean numberZero = true;
        int liczbaMax = 0;
        int liczbaMin = 0;
        double srednia = 0;
        int zeroEnd = Integer.parseInt(String.valueOf(0));
        while (numberZero) {
            Scanner scanner = new Scanner(System.in);
            int liczby = scanner.nextInt();
            liczby= liczby-zeroEnd;
            double suma = liczbaMin + liczbaMax;
            srednia = suma/2;

            if (liczby < liczbaMin) {
                liczbaMin = liczby;
            }
            if (liczby > liczbaMax) {
                liczbaMax = liczby;
            }

            if (liczby == zeroEnd) {
                numberZero = false;
                System.out.println("suma lidzby max i min : ");
                System.out.println(suma);
                System.out.println("srednia arytmetyczna sumy min max : ");
                System.out.println(srednia);
            }
        }
    }}
