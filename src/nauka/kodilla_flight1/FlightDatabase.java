package nauka.kodilla_flight1;

import java.util.ArrayList;

public class FlightDatabase {
    ArrayList<Flight> flights = new ArrayList<>();

    public FlightDatabase() {
        this.flights.add(new Flight("Berlin", "Tokyo", 1800));
        this.flights.add(new Flight("Paris", "Berlin", 79));
        this.flights.add(new Flight("Warsaw", "Paris", 120));
        this.flights.add(new Flight("Madrid", "Berlin", 412));
        this.flights.add(new Flight("Porto", "Berlin", 380));
        this.flights.add(new Flight("Tokyo", "Warsaw", 102));
    }

    public void checkIfFlights(String departure, String arrival) {
        int noFlights = 0;
        for (Flight flight : flights) {
            if (departure.equals(flight.departure) && arrival.equals(flight.arrival)) {
                System.out.println("flight is in database");
                return;
            } else {
                noFlights++;
            }
        }
        if (noFlights > 0) {
            System.out.println("there no flight in database");
        }
    }

    public ArrayList<Flight> getFlightsFromCity(String city) {
        ArrayList<Flight> results = new ArrayList<Flight>();
        for (int i = 0; i < flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (city.equals(flight.departure)) {
                results.add(flight);
            }
        }
        return results;
    }

    public ArrayList<Flight> getFlightsFromDestination(String destination) {
        ArrayList<Flight> results = new ArrayList<Flight>();
        for (int i = 0; i < flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (destination.equals(flight.arrival)) {
                results.add(flight);
            }
        }
        return results;
    }


    public void displayFlights(ArrayList<Flight> results) {
        if (results.isEmpty()) {
            System.out.println("Flight not found");
        }
        for (int i = 0; i < results.size(); i++) {
            Flight flight = results.get(i);
            System.out.println(flight.informationFlight("", ""));
        }
    }

    public void displayFlightsFromCity(String city) {
        ArrayList<Flight> results = getFlightsFromCity(city);
        displayFlights(results);
    }

    public void displayFlightstoCity(String city) {
        ArrayList<Flight> results = getFlightsFromDestination(city);
        displayFlights(results);
    }
// zadanie domowe//
    public ArrayList<String> getCities() {
        ArrayList<String> cities = new ArrayList<>();
        for (int i = 0; i < flights.size(); i++) {
            if (!cities.contains(flights.get(i).departure)) {
                cities.add(flights.get(i).departure);
            }
        }
        for (int i = 0; i < flights.size(); i++) {
            if (!cities.contains(flights.get(i).departure) || !cities.contains(flights.get(i).arrival)) {
                cities.add(flights.get(i).arrival);
            }
        }
        return cities;
    }

    public void displayCities() {
        ArrayList<String> cities = getCities();
        for (int i = 0; i < cities.size(); i++) {
            String city = cities.get(i)+" ";
            System.out.print(city);
        }
    }
    //zadanie domowe//
    public ArrayList<String> getCitiesKodilla(){
        ArrayList<String> cities = new ArrayList<>();
        for (Flight flight: this.flights){
            if (!cities.contains(flight.departure)){
                cities.add(flight.departure);
            }
            if (!cities.contains(flight.arrival)){
                cities.add(flight.arrival);
            }
        }
        return cities;
    }
    public Flight getCheapestFlight(){
        Flight cheapestFlight = null;
        for (Flight flight:this.flights){
            if (cheapestFlight==null || flight.price<cheapestFlight.price){
                cheapestFlight = flight;
            }
        }
        return cheapestFlight;
    }
    public Flight getCheapestFlightFromCity(String city){
        ArrayList<Flight> fromCity = getFlightsFromCity(city);
        Flight cheapestFlight = null;
        for (Flight flight:fromCity){
            if (cheapestFlight == null || flight.price< cheapestFlight.price){
                cheapestFlight = flight;
            }
        }
        return cheapestFlight;
    }
    public ArrayList<Journey> getFlights(String start, String end){
        String noFlight = " there no avaible Flights";
        ArrayList<Flight> starting = getFlightsFromCity(start);
        ArrayList<Flight> ending = getFlightsFromDestination(end);
        ArrayList<Journey> results = new ArrayList<>();
        for (Flight first:starting){
            for (Flight second : ending){
                if (first.arrival.equals(second.departure)){
                   results.add(new Journey(first,second));
                }
            }
        }
        return results;
    }

}

