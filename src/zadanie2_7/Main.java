package zadanie2_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj znak");
        char myChar = scanner.nextLine().charAt(0);
        System.out.println("podaj iloscSpacji");
        int iloscSpacji = scanner.nextInt();
        System.out.println("podaj iloscPutyWierszy");
        int iloscPutyWierszy = scanner.nextInt();
        System.out.println("podaj iloscKolumn");
        int iloscKolumn = scanner.nextInt();
        System.out.println("podaj iloscWierszy");
        int iloscWierszy = scanner.nextInt();

        for(int i = 0 ; i < iloscPutyWierszy ; i++){
            System.out.println();
        }
        for(int i = 0 ; i < iloscWierszy ; i++){
            for(int j = 0; j < iloscSpacji; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < iloscKolumn; j++){
                System.out.print(myChar);
            }
            System.out.println();
        }

    }
}
