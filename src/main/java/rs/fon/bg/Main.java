package rs.fon.bg;

import rs.fon.bg.shapes.Circle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Circle c = new Circle(3.5);
        System.out.println("Circle Area : " + c.getArea() + "\nCircle Perimeter : " + c.getPerimeter());
    }

}
