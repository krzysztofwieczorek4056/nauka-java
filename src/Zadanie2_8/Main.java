package Zadanie2_8;

import java.util.Scanner;

public class Main {public static void main(String[] args){

    Scanner scanner= new Scanner(System.in);
    System.out.println("podaj wyskość choinki");
    int n = scanner.nextInt();
    for(int x=0;x<n;x++) {
        for(int y=1;y<n*2;y++) {
            if(y<(n-x) || y>(n+x)) {
                System.out.print("-");
            }else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
}
