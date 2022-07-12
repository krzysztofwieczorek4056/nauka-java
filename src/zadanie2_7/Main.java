package zadanie2_7;

import java.util.Scanner;

public class Main {public static void main(String[] args)
{
    System.out.println("podaj znak wypełnienia");
    Scanner scanner = new Scanner(System.in);
    char znak =scanner.nextLine().charAt(0);
    System.out.println("podaj liczbę lini");
    int x = scanner.nextInt();
    System.out.println("podaj liczbę wierszy");
    int y=  scanner.nextInt();
    System.out.println("podaj długość prostokąta");
    int a= scanner.nextInt();
    System.out.println("podaj szerokośc prostokąta");
    int b = scanner.nextInt();
    for(int i=1; i<y;i++)
        System.out.println();
    for (int j=0;j<a;j++){
        if (j>0)
            System.out.println(" ");
        for (int k =1;k<x;k++){
            System.out.print("_");
        }
        for (int l=0;l<b;l++){
            System.out.print(znak);
        }
    }




}
}
