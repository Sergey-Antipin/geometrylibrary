package com.antipin;

public class Triangle implements Figure{

    private int base;

    private int height;

    private String color;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return base + height + hypotenuse;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
