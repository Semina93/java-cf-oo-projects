package gr.aueb.cf.ch16.ch16exercise1;

public class Circle extends AbstractShapeImpl implements ITwoDimensional {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

