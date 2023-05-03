package rs.fon.bg.square;

import org.junit.Test;
import rs.fon.bg.shapes.square.Square;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test
    public void testGetArea() {
        Square square = new Square(7);
        double result = square.getArea();
        assertEquals(49.0, result, 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        Square square = new Square(7);
        double result = square.getPerimeter();
        assertEquals(28.0, result, 0.0001);
    }

}
