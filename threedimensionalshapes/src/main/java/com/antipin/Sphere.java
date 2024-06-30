package com.antipin;

public class Sphere implements ThreeDimensionalFigure {

    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
