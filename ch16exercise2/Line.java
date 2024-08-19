package gr.aueb.cf.ch16.ch16exercise2;

import gr.aueb.cf.ch16.ch16exercise1.AbstractShapeImpl;

public class Line extends AbstractShapeImpl implements ILine {
    private double length;

    public Line(double length) {
        this.length = length;
    }
}

