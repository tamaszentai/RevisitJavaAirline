import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private Destination destination;
    private Departure departure;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, Destination destination, Departure departure, String departureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
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
        passengers.add(passenger);
    }

    public int getAvailableSeats() {
        return plane.planeType.getCapacity();
    }

    public void bookPassenger(Passenger passenger) {
        if (plane.planeType.getCapacity() > passengers.size()) {
            addPassenger(passenger);
            System.out.println("Passenger added");
        } else {
            System.out.println("Flight is full");
        }
    }


}
