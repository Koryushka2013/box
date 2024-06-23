package ru.box;

public class Ball implements Shape{
  private final double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 3) * 4 / 3;
    }
}
