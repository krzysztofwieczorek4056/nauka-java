package zadanie2_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Podaj Liczbę ");
        Scanner scanner =new Scanner(System.in);
        int liczba = scanner.nextInt();
        int potenga =1;
        for(; potenga<liczba; potenga=potenga*2){

            System.out.println(potenga);
        }


    }
}
