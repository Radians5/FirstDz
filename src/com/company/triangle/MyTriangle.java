package com.company.triangle;

public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    public MyTriangle(double x1,double y1,double x2,double y2,double x3,double y3) {
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                ']';
    }
    public double getPerimeter(){
        double lengthOne,lengthTwo,lengthThree;
        lengthOne = v1.distance(v2);
        lengthTwo = v2.distance(v3);
        lengthThree = v3.distance(v1);
        return lengthOne + lengthTwo + lengthThree;
    }
    public String getType(){
       String triangleType;
       double lengthOne,lengthTwo,lengthThree;
        lengthOne = v1.distance(v2);
        lengthTwo = v2.distance(v3);
        lengthThree = v3.distance(v1);
       if (((lengthOne == lengthTwo)&&(lengthTwo == lengthThree)&&lengthOne!=0))
           triangleType = "Equilateral";
       else if (((lengthOne == lengthTwo)||(lengthTwo==lengthThree)||(lengthThree==lengthOne))&&(lengthOne!=0)&&(lengthTwo!=0)&&(lengthThree!=0))
           triangleType = "Isosceles";
       else
            triangleType = "Scalene";
        return triangleType;
    }
}
