package com.company.ball;

public class Container {
    int x1;
    int x2;
    int y1;
    int y2;
   public Container(int x, int y, int width, int height){
       this.x1 = x;
       this.y1 = y;
       this.y2 = y - height;
       this.x2 = x + width;
   }
    public int getX(){
       return x1;
    }
    public int getY(){
       return y1;
    }
    public int getWidth(){
       return x2 - x1;
    }
    public int getHeight(){
       return -(y2 - y1);
    }
    public boolean collides(Ball ball){
       if ((((ball.getX()+ball.getRadius())>x1)&&(ball.getX()+ball.getRadius())<x2)&&((ball.getY()+ball.getRadius()<y1)&&(ball.getY()+ball.getRadius()>y2)))
       return true;
       else return false;
    }

    @Override
    public String toString() {
        return "Container[" +
                "(" + x1 +
                "," + y1 +
                "),(" + x2 +
                "," + y2 +
                ")]";
    }
        public static Double multiply(Double a, Double b) {
            return a * b;
        }

}
