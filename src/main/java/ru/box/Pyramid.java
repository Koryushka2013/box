package ru.box;

public class Pyramid implements Shape{
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return (s * h) / 3;
    }
}
