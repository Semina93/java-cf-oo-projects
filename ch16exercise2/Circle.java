package gr.aueb.cf.ch16.ch16exercise2;

public class Circle extends AbstractShapeImp implements ITwoDimensional, ICircle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public long getCircumference() {
        return (long)(2 * Math.PI * radius);
    }

    @Override
    public double getDiameter() {
        return 2 * radius;
    }
}

