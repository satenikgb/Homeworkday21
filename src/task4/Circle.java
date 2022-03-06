package task4;

public class Circle implements Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double Area() {
        return (PI * radius * radius);

    }

    @Override
    public double Perimeter() {
        return (int) (2 * PI * radius);

    }
}
