package Zadanie1_4;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your income");
        double a = input.nextDouble();
        double firstTax = a*0.18-556.02;
        double secondTax = 14839.02+0.32*(a-85528.02);
        if (a < 85528) {
                System.out.println("Tax is: " + firstTax);
            }
        else if (a>85528) {
            System.out.println("Tax is: " + secondTax);

        }
        }
    }
