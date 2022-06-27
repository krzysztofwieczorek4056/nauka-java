package zadanieZaliczenie;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Krzysztof", "Wieczorek",'M', 1, 3500.4f, 28, 1,false);
        employee1.toString();
        //System.out.println(employee1);
        //System.out.println(employee1.toStringShort());
        System.out.println(employee1.toStringUpperCase());
        System.out.println(employee1.checkSalary(3600f));
    }
}
