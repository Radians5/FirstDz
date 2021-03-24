package com.company.triangle;

public class MyPoint {
    double x = 1;
    double y = 1;

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double[] getXY() {
        double[] array = new double[2];
        array[0] = x;
        array[1] = y;
        return array;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "\"(" + x +","+ y +
                ")\"";
    }
    public double distance(double x, double y){
        double dist = 0;
        dist = Math.sqrt(Math.pow(this.x - x,2)+Math.pow(this.y - y,2));
        return  dist;
    }
    public double distance(MyPoint another){
        double dist = 0;
        dist = Math.sqrt(Math.pow(this.x - another.getX(),2)+Math.pow(this.y - another.getY(),2));
        return  dist;
    }
    public double distance(){
        double dist = 0;
        dist = Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
        return dist;
    }
}
