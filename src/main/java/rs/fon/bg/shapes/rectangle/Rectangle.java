package rs.fon.bg.shapes.rectangle;

public class Rectangle
{
    double length;
    double breadth;

    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea()
    {
        return length * breadth;
    }

    public double getPerimeter() {
        return 2*(length + breadth);
    }
}