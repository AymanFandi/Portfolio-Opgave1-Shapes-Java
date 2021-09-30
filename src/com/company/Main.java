package com.company;

class Main {
    public static void main(String[] args) {

        System.out.println("\nInformation om de forskellige shapes !!\n");

        Rectangle rect = new Rectangle(25, 39, new Point (0, 0));
        rect.getRectInfo();

        // prints a new blank  line
        System.out.println();

        Circle circle = new Circle(10, new Point(50, 10));
        circle.getCircleInfo();

        //new blank line
        System.out.println();

        Triangle triangle = new Triangle(10, 20, new Point(50, 40));
        triangle.getTriangleInfo();

        System.out.println();

        // distance between center of triangle and circle
        Distance distance = new Distance(triangle.pointN, circle.pointN);
        System.out.println("Distances between the center points of the shapes: \n");

        // Afstand mellem trekant og cirkel
        distance.getEuclideanDist(triangle.pointN.x, triangle.pointN.y, circle.pointN.x, circle.pointN.y);
        System.out.println("Afstanden mellem trekanten og cirklen er  " + (int)distance.distInPoints);

        // Afstand mellem trekant og rektanglen
        distance.getEuclideanDist(triangle.pointN.x, triangle.pointN.y, rect.pointN.x, rect.pointN.y);
        System.out.println("Afstanden mellem trekanten og rektanglen er  " + (int)distance.distInPoints);

        //Afstand mellem cirkel og rektangel
        distance.getEuclideanDist(circle.pointN.x, circle.pointN.y, rect.pointN.x, rect.pointN.y);
        System.out.println("Afstanden mellem cirklen og rektanglen er " + (int)distance.distInPoints);
    }
}

