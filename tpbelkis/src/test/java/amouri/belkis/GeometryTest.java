// GeometryTest.java

package amouri.belkis;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for the Geometry class methods.
 */
public class GeometryTest {

    /**
     * Test method for calculating the area of a rectangle.
     */
    @Test
    public void testCalculateRectangleArea() {
        assertEquals(12.0, Geometry.calculateRectangleArea(4.0, 3.0), 0.0001);
    }

    /**
     * Test method for calculating the perimeter of a rectangle.
     */
    @Test
    public void testCalculateRectanglePerimeter() {
        assertEquals(14.0, Geometry.calculateRectanglePerimeter(4.0, 3.0), 0.0001);
    }

    /**
     * Test method for calculating the area of a circle.
     */
    @Test
    public void testCalculateCircleArea() {
        assertEquals(12.566370614359172, Geometry.calculateCircleArea(2.0), 0.0001);
    }

    /**
     * Test method for calculating the circumference of a circle.
     */
    @Test
    public void testCalculateCircleCircumference() {
        assertEquals(12.566370614359172, Geometry.calculateCircleCircumference(2.0), 0.0001);
    }
}
