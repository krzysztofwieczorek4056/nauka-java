package zadanieZaliczenie;

public class Employee {
    private String name;
    private String surname;
    private char sex;
    private int unitNumber;
    private float salary;
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
                "Pesja :" + salary;
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
}
