package zadanie2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose number A");
        int A = scanner.nextInt();


                int B = 0;
        do {
            System.out.println("Chose number B  " + "B>A");
            Scanner scanner1=new Scanner(System.in);
            B = scanner1.nextInt();
        }
        while (B < A);
        int suma = 0;
        int a = 0;
        int liczba3 = A;
        int liczba4 = A;

        while (liczba3 <= B) {
            suma = suma + liczba3;
            liczba3++;
        }
        System.out.println(suma);
        suma = 0;
        a = 0;
        do {
            suma = suma + liczba4;
            liczba4++;
        }
        while (liczba4<=B);
        System.out.println(suma);

        suma=0;

        for (a=0;A<=B;a++){
            suma=suma+A;
            A++;
        }
        System.out.println(suma);

    }
}
