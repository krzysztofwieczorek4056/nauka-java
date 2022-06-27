package zadania_jkozak_2;

import java.util.Scanner;

public class zadanie2_5 {
    public static void main(String[] args) {
        System.out.println("zadanie jvkozak zadanie2.5");
        boolean numberZero = true;
        int liczbaMax = 0;
        int lidzbaMin = 0;

        while (numberZero) {
            Scanner scanner = new Scanner(System.in);
            int liczby = scanner.nextInt();
            double suma = liczbaMax + lidzbaMin;
            double srednia = suma / 2;

            if (liczby == 0) {
                numberZero = false;
                System.out.println("suma max i min : " + suma);
                System.out.println("srednia artytmetyczna" + srednia);
            }

            if (lidzbaMin < liczby) {
                lidzbaMin = liczby;
            }
            if (liczby < liczbaMax) {
                liczbaMax = liczby;

            }
        }
    }
}

