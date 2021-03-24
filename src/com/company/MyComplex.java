package com.company;
public class MyComplex {
    double real = 0.0;
    double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag){
        this.imag = imag;
        this.real = real;
    }

    @Override
    public String toString() {
        return "\"(real+imagi)\",e.g.,\"("+(int)real+"+"+(int)imag+"i)\"";
    }
    public boolean isReal(){
        if (real!=0)
            return true;
        else return false;
    }
    public boolean isImaginary(){
        if (imag!=0)
            return true;
        else return false;
    }
    public boolean equals(double real, double image){
        if ((this.real == real)&&(this.imag == image)) return true;
        else return false;
    }
    public boolean equals(MyComplex complex){
        if((complex.getReal() == this.real)&&(complex.getImag() == this.imag)) return true;
        else return false;
    }
    public double magnitude(){
        return Math.sqrt(Math.pow(this.real,2)+Math.pow(this.imag,2));
    }
    public double argument(){
        double argument = 0;
        if (this.real > 0) argument = Math.atan(this.imag/this.real);
        else if (this.real < 0 && this.imag >= 0) argument = Math.PI + Math.atan(this.imag/this.real);
        else if (this.real < 0 && this.imag > 0) argument = -Math.PI + Math.atan(this.imag/this.real);
        else if (this.real == 0 && this.imag > 0) argument = Math.PI/2;
        else if (this.real == 0 && this.imag < 0) argument = -Math.PI/2;
        return argument;
    }
    public MyComplex add(MyComplex right){
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }
    public MyComplex addNew(MyComplex right){
        right.real += this.real;
        right.imag += this.imag;
        return right;
    }
    public MyComplex subtract(MyComplex right){
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }
    public MyComplex subtractNew(MyComplex right){
        right.real -= this.real;
        right.imag -= this.imag;
        return right;
    }
    public MyComplex multiply(MyComplex right){
        right.real *= this.real;
        right.imag *= this.imag;
        return right;
    }
    public MyComplex divide(MyComplex right){
        right.real /= this.real;
        right.imag /= this.imag;
        return right;
    }
    public MyComplex conjugate(){
        MyComplex complex = new MyComplex();
        complex.real = this.real;
        complex.imag = -this.imag;
        return complex;
    }
}
