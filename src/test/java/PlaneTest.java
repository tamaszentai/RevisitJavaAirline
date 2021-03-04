import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.SMALLPLANE);
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.SMALLPLANE, plane.getPlaneType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, plane.planeType.getCapacity());
    }

    @Test
    public void hasWeight() {
        assertEquals(10, plane.planeType.getWeight());
    }
}
