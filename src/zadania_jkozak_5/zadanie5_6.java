package zadania_jkozak_5;

import java.util.Scanner;

public class zadanie5_6 {
    public static void main(String[] args) {
        System.out.println("zadanie j.kozak 5.6");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(stringToInt(text));
    }

    public static int stringToInt(String text) {
        StringBuilder bolid = new StringBuilder();
        int pusty;
        boolean isNegative = false;
        char[] tab = text.toCharArray();
        for (char s : tab) {
            if (s == 43 || s == 45) {
                isNegative = true;
            } else if (s > 47 && s < 58) {
                bolid.append(s);
            } else {
                break;
            }

        }
        if (isNegative) {
            bolid.insert(0, "-");
        }
        pusty = Integer.parseInt(bolid.toString());
        return pusty;
    }
}
