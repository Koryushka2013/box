package ru.box;

public class Cylinder implements Shape{
    private final double height;
    private final double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
