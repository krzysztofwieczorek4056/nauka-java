package Zadanie2_5;

import java.util.Scanner;

public class Main {public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbe, Podanie liczby 0 jest zakończenie ciągu");
    int a = scanner.nextInt();
    int max = a;
    int min = a;
    int suma ;
    double srednia;

    while (a!=0){
        if(a<min)
           min =a;
        if(a>max)
            max =a;
        a=scanner.nextInt();

    }
    suma = min+max;
    srednia= (double) suma /2;
    System.out.println(suma);
    System.out.println(srednia);
}
}
