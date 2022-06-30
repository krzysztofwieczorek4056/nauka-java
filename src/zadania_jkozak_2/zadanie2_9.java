package zadania_jkozak_2;


import java.util.Scanner;

public class zadanie2_9 {
    public static void main(String[] args) {
        long suma = 0;
        System.out.println("zadanie 2.9 jkozak");
        System.out.println("daj liczbe");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int length = String.valueOf(number).length();

        for (int i = 0;i <length ; i++) {
            long digit = number % 10;
            number = number/10;
            suma = suma + digit;
        }
        System.out.println("suma cyfr w twojej liczbie to " + suma);
    }


}