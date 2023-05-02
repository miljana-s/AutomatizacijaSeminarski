package rs.fon.bg;


import rs.fon.bg.shapes.circle.Circle;
import rs.fon.bg.shapes.rectangle.Rectangle;
import rs.fon.bg.shapes.square.Square;

public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Square s = new Square(7);
        Circle c = new Circle(3.5);

        System.out.println("Rectangle Area : " + r.getArea() + "\nRectangle Perimeter : " + r.getPerimeter());
        System.out.println();
        System.out.println("Square Area : " + s.getArea() + "\nSquare Perimeter : " + s.getPerimeter());
        System.out.println();
        System.out.println("Circle Area : " + c.getArea() + "\nCircle Perimeter : " + c.getPerimeter());
        System.out.println();

        if ((r.getArea() > c.getArea()) && (r.getArea() > s.getArea()))
        {
            System.out.println("Rectangle has the largest area.");
        }
        else if( s.getArea() > c.getArea() )
        {
            System.out.println("Square has the largest area.");
        }
        else
        {
            System.out.println("Circle has the largest area.");
        }


    }
}
