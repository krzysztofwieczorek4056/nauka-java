package zadanie2_4;

import java.util.Scanner;

public class Main { public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    int a =-1;
    int suma =0;
    while(a!=0){
        System.out.println("podaj liczbę całkowtą");
        a=scanner.nextInt();
        suma +=a;
    }
    System.out.println("Suma liczb wynosi: "+ suma);
    System.out.println("Koniec");
}
}
