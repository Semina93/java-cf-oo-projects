package gr.aueb.cf.ch16.ch16exercise1;

public class Rectangle extends AbstractShapeImpl implements ITwoDimensional {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
