package com.company;

class Rectangle extends Shape {

    float width;
    float height;
    Point startPoint;
    Point pointN;

    public Rectangle(float width, float height, Point startPoint) {
        this.width = width;
        this.height = height;
        this.startPoint = startPoint;
    }

    public float getArea() {
        this.area = width * height;
        return area;
    }

    public float getCircumference() {
        this.circumference = (width + height) * 2;
        return circumference;
    }

    public Point getCenter() {
        this.pointN = new Point(startPoint.x + (width / 2), startPoint.y + (height / 2));
        return pointN;
    }

    public void isPointInside(float x, float y) {
        float endPointX = startPoint.x + width;
        float endPointY = startPoint.y + height;
        Point endPoint = new Point(endPointX, endPointY);
        if (x > startPoint.x && x < endPoint.x && y > startPoint.y && y < endPoint.y){
            System.out.println("The point " + x + ", " + y + " is inside of the rectangle.");
        } else {
            System.out.println("The point " + x + ", " + y + " is not inside of the rectangle.");
        }
    }

    public void getRectInfo(){
        System.out.println("Rectangle information: \n");

        System.out.println("Width: " + (int)width);
        System.out.println("Height: " + (int)height);
        getArea();

        System.out.println("Area: " + (int)area);

        getCircumference();
        System.out.println("Circumference: " + (int)circumference);

        getCenter();
        System.out.println("Center: " + (int)pointN.x + ", " + (int)pointN.y);

        isPointInside(13, 20);
        isPointInside(40, 100);
    }
}
