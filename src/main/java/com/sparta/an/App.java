package com.sparta.an;

import com.sparta.an.loader.Loader;

public class App
{
    public static void main( String[] args )
    {
        String[] shapes = {"Circle", "Rhombus", "Square", "Triangle", "Rectangle"};

        double startTime = System.nanoTime();
        //Loader.checkAreas(54.2, 17.8);
        Loader.getArea(shapes,34.2, 17.8);
        double endTime = System.nanoTime();
        double totalTime = endTime-startTime;

        System.out.println("Time it took to calculate the areas using loop was: " + (totalTime / 1000000));

    }
}
