package Zadanie1_6;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        boolean end = true;
        while (end) {
            System.out.println("Easy Calculator only + - * /");
            Scanner input = new Scanner(System.in);
            System.out.println("Choose first number");
            double a = input.nextDouble();
            System.out.println("Chose second number");
            double b = input.nextDouble();
            System.out.println("if you wont sum press +");
            System.out.println("if you wont to subtract press -");
            System.out.println("if you wont to multiply press *");
            System.out.println("if you wont to divide press /");
            System.out.println("write 'end' to end");


            String symbol = input.next();

            switch (symbol) {
                case "+": {
                    System.out.println(a + b);
                    break;
                }
                case "-": {
                    System.out.println(a - b);
                    break;
                }
                case "*": {
                    System.out.println(a * b);
                    break;
                }
                case "/": {
                    if (b != 0) {
                        System.out.println(a / b);
                    } else {
                        System.out.println("not divide by 0");
                    }
                    break;
                }
                case "end":{
                    end = false;
                }

            }
        }
        }
    }


