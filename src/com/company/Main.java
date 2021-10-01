package com.company;

class Main {
    public static void main(String[] args) {

        System.out.println("\nPortfolio 1 - Shapes! \n");

        Rectangle rect = new Rectangle(20, 40, new Point (0, 0));
        rect.getRectInfo();


        Circle circle = new Circle(10, new Point(50, 10));
        circle.getCircleInfo();


        System.out.println();

        Triangle triangle = new Triangle(20, 30, new Point(60, 50));
        triangle.getTriangleInfo();

        System.out.println();

        // Afstanden mellem trekanten og cirklens center
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

