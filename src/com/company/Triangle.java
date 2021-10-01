package com.company;

import java.lang.Math;

class Triangle extends Shape {

    float base;
    float side;
    Point pointA;
    Point pointB;
    Point pointC;
    Point pointP;
    float area;
    Point pointN;

    public Triangle(float base, float side, Point pointA) {
        this.base = base;
        this.side = side;
        this.pointA = pointA;
    }

    public float getArea() {
        float p = (base + side + side) / 2;

        this.area = (float) Math.sqrt(p * (p - base) * (p - side) * (p - side));
        return area;
    }

    public float getCircumference() {
        this.circumference = base + 2 * side;
        return circumference;
    }

    public Point getCenter() {
        float height = 2 * area / base;
        System.out.println("Height: " + (int)height);

        this.pointB = new Point(pointA.x - (base / 2), pointA.y + height);
        this.pointC = new Point(pointA.x + (base / 2), pointA.y + height);

        this.pointN = new Point((pointA.x + pointB.x + pointC.x) / 3, (pointA.y + pointB.y + pointC.y) / 3);

        return pointN;
    }


    public void isPointInside(float x, float y){
        this.pointP = new Point(x, y);
        float A = (pointA.x * (pointB.y - pointC.y) + pointB.x * (pointC.y - pointA.y)+ pointC.x * (pointA.y - pointB.y))/2;
        float A1 = (pointP.x * (pointB.y - pointC.y) + pointB.x * (pointC.y - pointP.y)+ pointC.x * (pointP.y - pointB.y))/2;
        float A2 = (pointA.x * (pointP.y - pointC.y) + pointP.x * (pointC.y - pointA.y)+ pointC.x * (pointA.y - pointP.y))/2;
        float A3 = (pointA.x * (pointB.y - pointP.y) + pointB.x * (pointP.y - pointA.y)+ pointP.x * (pointA.y - pointB.y))/2;
        if (A == A1 + A2 + A3){
            System.out.println("The point "+ this.pointP.x + ", " + this.pointP.y + " is inside of the triangle.");
        } else {
            System.out.println("The point "+ this.pointP.x + ", " + this.pointP.y + " is not inside of the triangle.");
        }
    }

    public void getTriangleInfo(){
        System.out.println("Triangle information: \n");

        getArea();
        System.out.println("Area: " + (int)area);


        getCircumference();
        System.out.println("Circumference: " + (int)circumference);


        getCenter();
        System.out.println("Center: " + (int)pointN.x + ", " + (int)pointN.y);


        isPointInside(30, 40);
        isPointInside(100, 150);
    }
}
