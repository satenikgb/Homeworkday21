package task4;

public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }

    @Override
    public double Perimeter() {
        return (2 * a + 2 * b);

    }

    @Override
    public double Area() {
        return (a * b);


    }
}
