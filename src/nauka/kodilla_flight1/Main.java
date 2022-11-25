package nauka.kodilla_flight1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Berlin", 1800);
        FlightDatabase flightDatabase = new FlightDatabase();
//        System.out.println(flight.informationFlight(flight.departure, flight.arrival));
//        flightDatabase.checkIfFlights("Berlin", "Tokyo");
//        flightDatabase.displayFlightsFromCity("Warsaw");
//        flightDatabase.displayFlightstoCity("Berlin");
//        flightDatabase.displayCities();
//        flightDatabase.getCities();
//        ArrayList<String> cities = flightDatabase.getCitiesKodilla();
//        System.out.println(cities);
//        Flight cheapestFlight = flightDatabase.getCheapestFlight();
//        System.out.println("Cheapest flight: " + cheapestFlight.informationFlight("",""));
       ArrayList<Journey> journeys = flightDatabase.getFlights("Berlin", "Warsaw");
        System.out.println(journeys);

    }
}
