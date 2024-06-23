package ru.box;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10,2,5);
        Ball ball = new Ball(2);
        Cylinder cylinder = new Cylinder(2,3);
        Pyramid pyramid = new Pyramid(3,2);

        box.add(ball);
        box.add(cylinder);
        box.add(pyramid);
        box.add(pyramid);
        box.add(pyramid);
        box.add(ball);

    }
}