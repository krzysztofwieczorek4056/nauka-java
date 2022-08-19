package zadanieZaliczenie;

import java.text.DecimalFormat;

public class Employee {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private String name;
    private String surname;
    private char sex;
    private int unitNumber;
    private double salary;
    private int age;
    private int childNumber;
    private boolean civilStatus;
    public Employee(String name, String surname, char sex, int unitNumber, float salary, int age, int childNumber, boolean civilStatus) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.unitNumber = unitNumber;
        this.salary = salary;
        this.age = age;
        this.civilStatus = civilStatus;
        this.childNumber = childNumber;
    }

    @Override
    public String toString() {
        String status = "";
        if(civilStatus){
            status = "me¿atka/¿onaty";
        }else {
            status = "panna/kawaler";
        }
        return "Imie: " + name + "\r\n" +
                "Nazwisko: " + surname + "\r\n" +
                "P³ec: " + sex + "\r\n" +
                "Jednostka : " + unitNumber + "\r\n" +
                "Pesja :" + salary + "\r\n" +
                "Wiek: " + age + "\r\n" +
                "Ilosc dzieci: " + childNumber + "\r\n" +
                "Status cywilny: " + status;
    }

    public String toStringShort() {
        return "Imie: " + name + "\r\n" +
                "Nazwisko: " + surname + "\r\n" +
                "Pesja :" + df.format(salary);
    }

    public String toStringUpperCase() {
        return name.toUpperCase() + " " + surname.toUpperCase();
    }

    public boolean checkSalary(float inputFloat) {
        if(salary>inputFloat){
            return true;
        }else {
            return false;
        }
    }

    public void getRise(int percent) {
        System.out.println("Old salary: " + salary);
        if(childNumber != 0){
            percent = percent + childNumber*2;
        }
        if(civilStatus){
            percent = percent + 3;
        }
        double incise = salary * ((double)percent/100);
        salary = salary + incise;
        System.out.println("New Salary: " +  salary);
    }
}
