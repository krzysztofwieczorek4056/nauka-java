package zadanie1_5;

import java.text.BreakIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Item Price form 100pln to 10000pln");
        double a = input.nextDouble();
        System.out.println("number of installments form 6 month to 48 to month");
        double b = input.nextDouble();
        if (a < 100 || a > 10000) {
            System.out.println("Wrong Price");
        }
        if (b < 6 || b > 48) {
            System.out.println("Wrong number of installments");
        }
        if (b >= 6 && b <= 12) {
            System.out.println("installment: " + (a * 1.025) / b);
        } else if (b >= 13 && b <= 24) {
            System.out.println("installment: " + (a * 1.05) / b);
        } else if (b >= 25 && b <= 48) {
            System.out.println("installment: " + (a * 1.10) / b);

        }
    }
}