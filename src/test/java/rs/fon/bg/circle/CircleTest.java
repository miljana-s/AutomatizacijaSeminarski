package rs.fon.bg.circle;

import org.junit.Test;
import rs.fon.bg.shapes.circle.Circle;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void testGetArea() {
        Circle circle = new Circle(3.5);
        double result = circle.getArea();
        assertEquals(38.48451000647496, result, 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        Circle circle = new Circle(3.5);
        double result = circle.getPerimeter();
        assertEquals(21.991148575128552, result, 0.0001);
    }
}
