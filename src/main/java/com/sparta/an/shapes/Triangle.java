package com.sparta.an.shapes;

public class Triangle implements Shapes{
    public double getArea(double lengthA, double lengthB) {
        return (lengthA * lengthB) / 2;
    }
}
