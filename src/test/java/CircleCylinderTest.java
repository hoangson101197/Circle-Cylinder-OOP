import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CircleCylinderTest {
    @Test
    public void testCircle() {
        Circle circle = new Circle(3.5);

        String expected = "The circular area is: 38.465";
        String result = circle.toString();

        assertEquals(expected, result);
    }

    @Test
    public void testCylinder() {
        Cylinder cylinder = new Cylinder(3.5, 6);

        String expected = "The circle volume is 230.79000000000002, radius is: 3.5";
        String result = cylinder.toString();

        assertEquals(expected, result);
    }
}
