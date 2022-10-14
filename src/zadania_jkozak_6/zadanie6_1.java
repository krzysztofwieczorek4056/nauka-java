package zadania_jkozak_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class zadanie6_1 {

    static String text;
    static int[] tabInt;

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("zadanie j.kozak 6.1");
        File plik = new File("C:\\Users\\Cezary\\Desktop\\plik.TXT");
        Scanner scanner = new Scanner(plik);
        while (scanner.hasNext()) {
            text = scanner.nextLine();

        }
        System.out.println((Arrays.toString(liczZnakiSlowa(Arrays.toString(tabInt)))));

    }

    public static int[] liczZnakiSlowa(String a) {
        int[] tabInt = new int[3];
        System.out.println(text);
        String text1 = text.trim();
        String[] tab = text1.split(" ");
        int dlugoscZnakow = text1.length() - tab.length + 1;
        tabInt[0] = dlugoscZnakow;

        int count = 1;
        String text2 = text.trim();
        if (text2.endsWith(".")) {
            count -= 1;
        }
        String[] spaces = text2.split("");

        for (String s : spaces) {

            boolean isWhiteSpace = s.matches("\\W");
            if (isWhiteSpace) {
                count++;
            }
        }
        tabInt[1] = count - 1;
        int wordy = 0;
        String text3 = text.trim();
        String[] words = text3.split("\\W");
        for (String w : words) {
            wordy++;
        }
        tabInt[2] = wordy;
        return tabInt;
    }
}

