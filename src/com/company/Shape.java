package com.company;

import java.lang.Math;

abstract class Shape {

    float area;
    float circumference;
    Point pointN;
    float distInPoints;

    public float getArea(){
        return this.area;
    }

    public float getCircumference(){
        return this.circumference;
    }

    public Point getCenter(){
        return this.pointN;
    }

    public void isPointInside(float x, float y){
    }
}