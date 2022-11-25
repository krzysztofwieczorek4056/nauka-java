package nauka.kodilla_1;

public class MobilePhone {
    String weight;
    int price;

    public MobilePhone(String weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public void dispalyParameters(String weight, int price) {
        System.out.println(this.weight + " " + this.weight);
    }

    public String getParameters(String weight, int price) {
        return this.weight + " " + this.price;
    }

    public void getPrice(int price) {
        System.out.println(this.price);
    }

    public double getPriceDiscounted(int price) {
        double discount = this.price * 0.1;
        double discountedPrice = this.price - discount;
        return discountedPrice;
    }

    public int vauleIncreased(int price, int priceValue) {
        int valueFinal = price + priceValue;
        return valueFinal;
    }

    public void checkPrice() {
        if (this.price < 250) {
            System.out.println("price is realy good");
        } else if (this.price < 300) {
            System.out.println("price is good");
        } else if (this.price < 550) {
            System.out.println("price could be lower");
        } else {
            System.out.println("phone is too expensive");
        }
    }

    public void displayEvenNumbers(int min, int max) {
        for (int i = min; i < max; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
    }

    public void idDivided() {
        int sumaLiczb = 0;
        for (int i = 4; i < 19; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sumaLiczb++;
            }
        }
        System.out.println(sumaLiczb);
    }

    public int isSummary(int min, int max) {
        int suma = 0;
        for (int i = min; i < max; i++) {
            if (i % 2 == 0) {

                suma = i + suma;
            }
        }
        return suma;
    }
    public void isMinus(int min,int max){
        for (int i =max;i>=min;i--){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
