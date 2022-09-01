package zadania_jkozak_5;


import java.util.Scanner;

public class zadanie5_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst");
        String text = scanner.nextLine();
        System.out.println("podaj kolejnosc");
        int[] tab = new int[text.length()];
        int pomocniczy;
        int licznik = 0;
        int jeden = 1;
        boolean xd= true;

        while (licznik <= text.length()) {
            for (int i = 0; i < text.length(); i++) {
                pomocniczy = scanner.nextInt();
                if (i > 0) {
                    if (tab[i-1]==pomocniczy) {
                        System.out.println("z³y nie liczy sie");
                        i--;
                        licznik--;
                        xd = false;
                    }
                }

                if (pomocniczy <= text.length() && xd) {
                    tab[i] = pomocniczy;

                    System.out.println("dobra liczba  " + jeden);
                    jeden++;
                } else if (pomocniczy > text.length()) {
                    System.out.println("z³y nie liczy sie");
                    i--;
                    licznik--;
                }
                licznik++;
                xd = true;
            }
            if (licznik == tab.length) {
                break;
            }
        }
        String[] tabS = text.split("");
        for (int i = 0; i < tabS.length; i++) {
            System.out.print(tabS[tab[i] - 1]);
        }
    }
}

//t=0
//e=1
//x=2
//t=3