package gr.aueb.cf.ch16.ch16exercise1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Line line = new Line(10.0);

        circle.setId(1);
        rectangle.setId(2);
        line.setId(3);

        System.out.println("Circle ID: " + circle.getId() + ", Area: " + circle.getArea());
        System.out.println("Rectangle ID: " + rectangle.getId() + ", Area: " + rectangle.getArea());
        System.out.println("Line ID: " + line.getId());
    }
}
