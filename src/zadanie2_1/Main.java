package zadanie2_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj cyfre dodatnia");
        int input = scanner.nextInt();
        for(int i = 1 ; i <= input; i = i + 2){
            System.out.println(i);
        }
    }
}
