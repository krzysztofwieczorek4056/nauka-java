package programowanie.obiektowe_1;

public class Stuff {
    private String name;
    public int weight;

    public Stuff(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + weight;
    }

}



