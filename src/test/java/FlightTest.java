import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Flight flight;

    @Before
    public void before(){
        plane = new Plane(PlaneType.SMALLPLANE);
        passenger1 = new Passenger("Chris Keith", 5);
        passenger2 = new Passenger("Stuart Campbell", 2);
        passenger3 = new Passenger("Michael English", 1);
        passenger4 = new Passenger("Kim Rosso", 3);
        flight = new Flight(plane, "18IJK", Departure.EDI, Destination.BUD, "30-03-2020");

    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.SMALLPLANE, plane.getPlaneType());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("18IJK", flight.getFlightNumber());
    }

    @Test
    public void hasDeparture() {
        assertEquals(Departure.EDI, flight.getDeparture());
    }

    @Test
    public void hasDestination() {
        assertEquals(Destination.BUD, flight.getDestination());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("30-03-2020", flight.getDepartureTime());
    }

    @Test
    public void numberOfAvailableSeats() {
        assertEquals(100, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        assertEquals(4, flight.passengerCount());
    }
}
