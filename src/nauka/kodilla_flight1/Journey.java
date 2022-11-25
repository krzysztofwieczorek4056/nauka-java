package nauka.kodilla_flight1;

public class Journey {
    Flight first;
    Flight second;

    public Journey(Flight first, Flight second) {
        this.first = first;
        this.second = second;
    }
//    @Override
    public String toString(){
        return "Flight from "+ first.departure+ " to "+ second.arrival+ " with stop at "+ first.arrival+" cost " + (first.price + second.price);

    }
}
