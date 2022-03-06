package task4;

public class Main {
    public static void main(String[] args) {

        double a=4.5;
        double b=2.15;
        Rectangle rectangle=new Rectangle(a,b);
        System.out.println("Area of Rectangle "+rectangle.Area());
        System.out.println("Perimeter of Rectangle "+rectangle.Perimeter());

        double radius=4.56;
        Circle circle=new Circle(radius);
        System.out.println("Area of circle "+circle.Area());
        System.out.println("Perimeter of circle "+circle.Perimeter());
    }
}
