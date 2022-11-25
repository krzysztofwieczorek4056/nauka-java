package nauka.kodilla_flight1;

public class Flight {
    String departure;
    String arrival;
    int price;

    public Flight(String departure, String arrival, int price) {
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }

    public String informationFlight(String departure, String arrival) {
        String fromTo = "this flight is from " + this.departure + " to " + this.arrival + " costs " + this.price;
        return fromTo;
    }

    //zadanie domowe//
    public String citiesInDataBase(String departure, String arrival) {
        String cities = this.departure + " " + this.arrival;

        return cities;
    }
    //zadanie domowe//

}
