package rs.fon.bg.rectangle;

import org.junit.Test;
import rs.fon.bg.shapes.rectangle.Rectangle;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(10, 5);
        double result = rectangle.getArea();
        assertEquals(50.0, result, 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(10, 5);
        double result = rectangle.getPerimeter();
        assertEquals(30.0, result, 0.0001);
    }

    @Test
    public void testGetAreaWithZero() {
        Rectangle rectangle = new Rectangle(10, 0);
        double result = rectangle.getArea();
        assertEquals(0.0, result, 0.0001);
    }
}
