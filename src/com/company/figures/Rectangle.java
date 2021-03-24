package com.company.figures;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        double S = 0;
        S = length*width;
        return S;
    }
    public double getPerimeter() {
        double P = 0;
        P = (length + width)*2;
        return P;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ",width=" + width +
                ']';
    }
}
