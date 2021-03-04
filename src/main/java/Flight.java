import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private Departure departure;
    private Destination destination;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, Departure departure, Destination destination, String departureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int passengerCount() {
        return passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Destination getDestination() {
        return destination;
    }

    public Departure getDeparture() {
        return departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int getAvailableSeats() {
        return plane.planeType.getCapacity();
    }

    public void bookPassenger(Passenger passenger) {
        if (plane.planeType.getCapacity() > passengerCount()) {
            addPassenger(passenger);
        }
    }


}
