package zadania_jkozak_5;

import java.util.Objects;
import java.util.Scanner;

public class zadanie5_7 {
    public static void main(String[] args) {
        System.out.println("zadanie 5.7 jkozak");
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj text");
        String what = scanner.nextLine();
        System.out.println("podaj co chcesz znalezc w tekscie");
        String where = scanner.nextLine();
        System.out.println(starFind(what, where));
    }

    public static int starFind(String what, String where) {
        int positionIndex = 0;
        boolean cont = what.contains(where);
        if (where.equals("")) {
            return positionIndex;
        }
        if (cont) {
            String first = String.valueOf(where.charAt(0));
            String[] tab = what.split("");
            for (int i = 0; i < what.length(); i++) {
                if (Objects.equals(tab[i], first)) {
                    positionIndex = i;

                }
            }

        } else {
            positionIndex = -1;
        }
        return positionIndex;

    }
}