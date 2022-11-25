package nauka.kodilla_1;

public class Cwiczenie_1 {
    public static void main(String[] args) {
        int dod = 100;
        MobilePhone mobilePhone = new MobilePhone("200g", 140);
        MobilePhone mobilePhone1 = new MobilePhone("250g", 700);
        MobilePhone mobilePhone2 = new MobilePhone("6000g", 430);

        mobilePhone.dispalyParameters(mobilePhone.weight, mobilePhone.price);

        String parameters = mobilePhone.getParameters(mobilePhone.weight, mobilePhone.price);
        System.out.println(parameters);
        System.out.println(mobilePhone.weight + " " + mobilePhone.price);
        mobilePhone.getPrice(mobilePhone.price);
        System.out.println(mobilePhone.getPriceDiscounted(mobilePhone.price));
        System.out.println(mobilePhone.vauleIncreased(mobilePhone.price, dod));
        mobilePhone.checkPrice();
        mobilePhone1.checkPrice();
        mobilePhone2.checkPrice();
        mobilePhone.displayEvenNumbers(3, 10);
        System.out.println();
        mobilePhone.idDivided();
        System.out.println(mobilePhone.isSummary(5,9));
        mobilePhone.isMinus(-3,10);
    }
}
