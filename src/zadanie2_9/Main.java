package zadanie2_9;

import java.util.Scanner;

public class Main {public static void main(String[] args){
    System.out.println("podaj liczbę całkowitą");
    int sum =0;
    int sumaPrzystych =0;
    int sumaNieprzystch=0;
    int iloścLiczbParzytstch=0;
    int iloścLiczbNieprzysych=0;
    int cyfra=0;
    double średniaParzystch=0;
    double średniaNieprzystch = 0;
    Scanner scanner = new Scanner(System.in);
    int liczba = scanner.nextInt();
            while (liczba>0){
                cyfra=liczba%10;
                sum=sum+cyfra;
                liczba=liczba/10;

                if(cyfra%2==0){
                    iloścLiczbParzytstch+=1;
                    sumaPrzystych+=cyfra;
                    }
                else {
                   iloścLiczbNieprzysych+=1;
                   sumaNieprzystch+=cyfra;
                }
            }System.out.println("Suma Cyfr;"+ sum);
            if(iloścLiczbParzytstch==0){
        System.out.println("nie ma liczb parzystch");}
            else { średniaParzystch=sumaPrzystych/iloścLiczbParzytstch;}
    if (iloścLiczbNieprzysych==0){
        System.out.println("nie ma liczb nieprzystych");
        }
    else {średniaNieprzystch=sumaNieprzystch/iloścLiczbNieprzysych;}
    if (średniaNieprzystch==0) {
        System.out.println(" średnia nieprzystch wynosi 0");
    } else if (średniaParzystch==0) {
        System.out.println("średnia parzysytch wynosi 0");

    } else{System.out.println("• stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej" +
            "cyfr nieparzystych: "+średniaParzystch/średniaNieprzystch);}



}}
