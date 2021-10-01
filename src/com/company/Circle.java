package com.company;

import java.lang.Math;

class Circle extends Shape {
    float radius;
    Point startPoint;
    Point pointN;

    public Circle(float radius, Point startPoint) {
        this.radius = radius;
        this.startPoint = startPoint;
    }

    public float getArea() {
        this.area = (float) Math.PI * (radius * radius);
        return area;
    }

    public float getCircumference() {
        this.circumference = (float) Math.PI * 2 * radius;
        return circumference;
    }

    public Point getCenter() {
        this.pointN = new Point(this.startPoint.x + radius, this.startPoint.y + radius);
        return pointN;
    }

    public void isPointInside(float x, float y){

        Point pointP = new Point(x, y);

        Point pointN = new Point(this.startPoint.x + radius, this.startPoint.y + radius);

        float dist = (float) Math.sqrt(Math.pow((pointP.x-pointN.x), 2) + Math.pow((pointP.y-pointN.y), 2));
        if (dist > radius){
            System.out.println("The point " + x + ", " + y + " is inside of the circle.");
        } else {
            System.out.println("The point " + x + ", " + y + " is not inside of the circle.");
        }
    }

    public void getCircleInfo(){
        System.out.println("Cirkel information:\n");


        System.out.println("Radius: " + radius);

        System.out.println("Starting point: " + startPoint.x + ", " + startPoint.y);

        getArea();
        System.out.println("Area: " + (int)area);

        getCircumference();
        System.out.println("Circumference: " + (int)circumference);


        getCenter();
        System.out.println("Center: " + (int)pointN.x + ", " + (int)pointN.y);

        isPointInside(55, 15);
        isPointInside(70, 30);
    }
}