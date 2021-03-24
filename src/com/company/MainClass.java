package com.company;

import com.company.ball.Ball;
import com.company.ball.Container;
import com.company.figures.Circle;
import com.company.figures.Rectangle;
import com.company.triangle.MyPoint;
import com.company.triangle.MyTriangle;

public class MainClass {

public static void main(String[] args){
    Circle circle = new Circle();
    System.out.println(circle.toString());
    Rectangle rectangle = new Rectangle();
    System.out.println(rectangle.toString());
    Employee employee = new Employee(1,"Karl","Benz",100);
    System.out.println(employee.toString());
    Book book= new Book("GRAF MONTE CHRISTO", new Author[]{new Author("Alexander Duma", "duma111@yandex.ru", 'm'),new Author("Alexander Duma1", "duma222@gmail.com", 'm')},12.1,1);
    System.out.println(book.toString());
    MyPoint myPoint = new MyPoint();
    System.out.println(myPoint.toString());
    MyTriangle myTriangle = new MyTriangle(new MyPoint(0,0),new MyPoint(0,5),new MyPoint(5,0));
    System.out.println(myTriangle.toString());
    MyComplex myComplex = new MyComplex(2,1);
    System.out.println(myComplex.add(new MyComplex(2,-1)).toString());
    System.out.println(myComplex.multiply(new MyComplex(-1,-1)).toString());
    MyPolinomial myPolinomial = new MyPolinomial(1,2,3);
    System.out.println(myPolinomial.toString());
    myPolinomial.multiple(new MyPolinomial(1,2,3));
    System.out.println(myPolinomial.toString());
    System.out.println(myPolinomial.evaluate(2));
    Ball ball = new Ball(1,2,1,1,2);
    ball.setxDelta(2);
    ball.setyDelta(3);
    System.out.println(ball.toString());
    Container container = new Container(1,1,1,1);
    System.out.println(container.toString());
}
}
