import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger1;

    @Before
    public void before() {
        passenger1 = new Passenger("Chris Keith", 5);
    }

    @Test
    public void hasAName() {
        assertEquals("Chris Keith", passenger1.getName());
    }

    @Test
    public void numberOfBags() {
        assertEquals(5, passenger1.getNumberOfBags());
    }
}
