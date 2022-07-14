package Zadanie2_10;

import java.util.Scanner;

public class Main {public static void main(String[] args){
    System.out.println("podaj liczbę");
    Scanner scanner =new Scanner(System.in);
    int liczba = scanner.nextInt();
    System.out.println("dzielniki liczb wynoszą:");
    for(int i=1; i<=liczba; i++){
        if (liczba%i==0){
            System.out.println(i);
        }
    }

}
}
