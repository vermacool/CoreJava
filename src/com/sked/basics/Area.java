package com.sked.basics;

import java.util.Scanner;

/**
 * Created by Android on 8/5/2017.
 */
public class Area {
    private static double radius, area;
    private static Shape shape;

    public enum Shape {CIRCLE, RECTANGLE, TRIANGLE,HEXAGON}

    public Area(Shape shape) {
        Area.shape = shape;
    }

    private void doCalculation() {

        switch (shape) {
            case CIRCLE:
                calculateAreaofCircle();
                break;
            case TRIANGLE:
                break;
            case RECTANGLE:
                break;
            default:
                System.out.println("This shape is not defined");
                break;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the shape the shape to calculate");
        Scanner checkCalculation = new Scanner(System.in);
        if (checkCalculation.next().equalsIgnoreCase("circle")) {
            Area area = new Area(Shape.CIRCLE);
            area.doCalculation();
        } else if (checkCalculation.next().equalsIgnoreCase("rectangle")) {
            Area area = new Area(Shape.RECTANGLE);
            area.doCalculation();
        } else if (checkCalculation.next().equalsIgnoreCase("triangle")) {
            Area area = new Area(Shape.TRIANGLE);
            area.doCalculation();
        } else {
            Area area = new Area(Shape.HEXAGON);
            area.doCalculation();

        }


    }

    private static void calculateAreaofCircle() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radios of circle");

        radius = sc.nextDouble();

        //formula to calculate area of circle
        area = Math.PI * radius * radius;
        System.out.println("Area of circle is :- " + area);

        //calculate perimeter of circle
        double perimeter = 2 * Math.PI * radius * radius;
        System.out.println("Perimeter of circle is :- " + perimeter);

    }
}
