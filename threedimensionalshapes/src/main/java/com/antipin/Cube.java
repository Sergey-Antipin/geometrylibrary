package com.antipin;

public class Cube implements ThreeDimensionalFigure {

    private int side;

    public Cube(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}
