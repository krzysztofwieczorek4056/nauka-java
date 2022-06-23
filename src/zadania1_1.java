import java.util.Scanner;

public class zadania1_1 {
    public static void main(String[] args) {
        double temperatureReading;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Temperature");
        temperatureReading = input.nextDouble();

        result =(temperatureReading * 9/5) + 32;
        System.out.println("Temperature in Fahr: " + result + " F");
    }
}
