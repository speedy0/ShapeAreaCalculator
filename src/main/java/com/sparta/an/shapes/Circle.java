package com.sparta.an.shapes;

public class Circle implements Shapes{
    public double getArea(double lengthA, double lengthB) {
        double pi = 3.14159265359;
        double radius = lengthA / 2;
        return (radius * radius) * pi;
    }
}
