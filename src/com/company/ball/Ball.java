package com.company.ball;

public class Ball {
    float x = 0;
    float y = 0;
    int radius = 0;
    float xDelta = 0;
    float yDelta = 0;
    public Ball(float x, float y, int radius,int speed,int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move(){
        this.x += this.xDelta;
        this.y += this.yDelta;
    }
    public void reflectHorizontal(){
        this.xDelta = -this.xDelta;
    }
    public void reflectVertical(){
        this.yDelta = -this.yDelta;
    }

    @Override
    public String toString() {
        return "Ball[" +
                "(" + x +
                ","+ y +
                "),speed=(" + xDelta +
                "," + yDelta +
                ")]";
    }
}
