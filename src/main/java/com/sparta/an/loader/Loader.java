package com.sparta.an.loader;

import com.sparta.an.shapes.*;

public class Loader {
    public static void checkAreas(double lengthA, double lengthB){
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Rhombus rhombus = new Rhombus();

        System.out.println(circle.getArea(lengthA, lengthA));
        System.out.println(square.getArea(lengthA, lengthA));
        System.out.println(rectangle.getArea(lengthA, lengthB));
        System.out.println(triangle.getArea(lengthA, lengthB));
        System.out.println(rhombus.getArea(lengthA, lengthB));
    }

    public static void getArea(String[] shapes, double lengthA, double lengthB){
        for (String element: shapes){
            switch (element){
                case "Circle":
                    System.out.println("Circle's with diameter of " + lengthA + "cm is " + new Circle().getArea(lengthA, lengthA));
                    break;
                case "Rectangle":
                    System.out.println("Rectangle's area with sides of " + lengthA + "cm and " + lengthB + "cm is " + new Rectangle().getArea(lengthA, lengthB));
                    break;
                case "Rhombus":
                    System.out.println("Rhombus area with diagonal sides of " + lengthA + "cm and " + lengthB + "cm is "+ new Rhombus().getArea(lengthA, lengthB));
                    break;
                case "Square":
                    System.out.println("Square's area with sides of " + lengthA + "cm is " + new Square().getArea(lengthA, lengthB));
                    break;
                case "Triangle":
                    System.out.println("Triangle's area with base " + lengthA + "cm and height of " + lengthB + " is " + new Triangle().getArea(lengthA, lengthB));
                    break;
                default:
                    System.out.println("No such shape has been found.");
                    break;
            }
        }
    }
}
