package Zadanie1_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Height");
        float a = input.nextFloat();
        System.out.println("Enter your Weight");
        float b = input.nextFloat();
        float h = a/100;
        float bmi = b/(h*h);
        System.out.println("Your BMI: " +bmi);
        if (bmi <18.5) {
            System.out.println("You're underweight");
        }
        else if (bmi>24.9) {
            System.out.println("You're overweight");
        }
        else if (bmi<=18.5 && bmi>=24.9) {
            System.out.println("Your weight is colored");
        }
        }
    }

