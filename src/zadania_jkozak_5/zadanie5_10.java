package zadania_jkozak_5;

import java.util.Scanner;


public class zadanie5_10 {
    public static void main(String[] args) {
        System.out.println("zadanie j.kozak 5.10");
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwszy text");
        String where = scanner.nextLine();
        System.out.println("podaj wyszukanie");
        String what = scanner.nextLine();
        System.out.println(find(where, what));
    }

    public static int find(String where, String what) {
        int numberOfFind = 0;
        if (where.contains(what)) {
            String replaced = where.replace(what, "s");
            String[] tab = replaced.split("");
            for (String s : tab) {
                if (s.matches("s")) {
                    numberOfFind++;
                }
            }
        } else {
            return numberOfFind;
        }

        return numberOfFind;
    }

}
