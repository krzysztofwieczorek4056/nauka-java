package zadanieZaliczenie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Employee> employeeArrayList = new ArrayList<Employee>(); // Create an ArrayList object
    public static void main(String[] args) throws IOException {

        employeeArrayList.add(new Employee("Krzysztof", "Wieczorek", 'M', 1, 17500.4f, 28, 1, false));
        employeeArrayList.add(new Employee("Cezary", "Konowrocki", 'M', 2, 6000.4f, 28, 0, true));
        employeeArrayList.add(new Employee("Grzegorz", "Wieczorek", 'M', 2, 3500.4f, 26, 0, false));
        employeeArrayList.add(new Employee("Jan", "Testowy", 'M', 1, 10500.4f, 358, 2, true));
//        employee1.toString();
//        System.out.println(employee1.toStringShort());
//        System.out.println(employee1.toStringUpperCase());
//        System.out.println(employee1.checkSalary(3600f));
//        employee1.getRise(10);
        int choice = menu();
        while (choice != 0) {
            if (choice == 1) {
                for (Employee employee : employeeArrayList) {
                    System.out.println(employee.toStringShort());
                    System.out.println();
                }
            } else if (choice == 2) {
                addNewEmployee();

            } else if (choice == 3) {

            }

            System.out.println("\nWciśnij Enter, aby kontynuować...");
            System.in.read();

            choice = menu();
        }
    }

    private static void addNewEmployee() {
        Scanner in = new Scanner(System.in);
        System.out.println("Imie: ");
        String name = in.nextLine();
        System.out.println("Nazwisko: ");
        String surrname = in.nextLine();
        System.out.println("Płeć (M/K) : ");
        char sex = in.next().charAt(0);
        System.out.println("Jednoska: ");
        int unitNumber = in.nextInt();
        System.out.println("Pensja :");
        float salary= in.nextFloat();
        System.out.println("Wiek :");
        int age = in.nextInt();
        System.out.println("Ilość dzieci :");
        int childNumber = in.nextInt();
        System.out.println("Stan cywiliny - (wolny - false, w związku - true)");
        boolean civilStatus = in.nextBoolean();
        employeeArrayList.add(new Employee(name, surrname, sex, unitNumber, salary, age, childNumber, civilStatus));

        System.out.println("Pracownik dodany");
        System.out.println(employeeArrayList.get(employeeArrayList.size()-1).toStringShort());
    }

    public static int menu() {
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *                 MENU                 *");
        System.out.println("     ****************************************");
        System.out.println("     1. Wypisz wszystkich pracowników");
        System.out.println("     2. Dodaj pracownika");
        System.out.println("     3. Export listy pracowników");
        System.out.println("     4. Usuwanie pracowników");
        System.out.println("     5. Edycja danych");
        System.out.println("     6. Dodatkowe funkcje");
        System.out.println("     7. Dodatkowe funkcje dla plików tekstowych");
        System.out.println("     8. Informacja o programie");
        System.out.println("     9. Zmiana bazy pracowników");
        System.out.println("     0. Koniec");

        Scanner in = new Scanner(System.in);
        int w = in.nextInt();

        return w;
    }
}
