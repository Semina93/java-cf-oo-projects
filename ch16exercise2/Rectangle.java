package gr.aueb.cf.ch16.ch16exercise2;

import gr.aueb.cf.ch16.ch16exercise1.AbstractShapeImpl;

public class Rectangle extends AbstractShapeImpl implements ITwoDimensional, IRectangle {
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

    @Override
    public long getCircumference() {
        return (long)(2 * (width + height));
    }
}

