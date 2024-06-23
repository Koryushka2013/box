package ru.box;

import java.util.ArrayList;
import java.util.List;

public class Box implements Shape{

    private double h;
    private double w;
    private double l;

    private double freeVolume;


    public Box(double h, double w, double l) {
        this.h = h;
        this.w = w;
        this.l = l;
        freeVolume = h*w*l;
    }

    public void add(Shape shape) {
        if (check(shape)){
            freeVolume = freeVolume - shape.getVolume();
            System.out.println("Оставшийся объем " + freeVolume);
        }
        else {
            System.out.println("Для фигуры нет места");
        }

    }

    private boolean check(Shape shape){
        return freeVolume >= shape.getVolume();
    }

    @Override
    public double getVolume() {
        return h*w*l;
    }
}
