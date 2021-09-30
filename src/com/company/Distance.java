package com.company;

class Distance {

    float distInPoints;
    Point startPoint;
    Point endPoint;

    public Distance(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public float getEuclideanDist(float x1, float y1, float x2, float y2) {
        this.distInPoints = (float) Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return this.distInPoints;
    }
}
