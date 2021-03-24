package com.company;

public class MyPolinomial {
    double[] coeffs;
    public MyPolinomial(double... coeffs) {
        this.coeffs = new double[coeffs.length];
        for (int count = 0; count<coeffs.length; count++) {
            this.coeffs[count] = coeffs[count];
        }
    }
    public int getDegree(){
        return coeffs.length-1;
    }
    @Override
    public String toString() {
        String resault ="";
        for (int i = 0; i < coeffs.length; i++){
            if (i == 0){
                resault = Double.toString(coeffs[0]);}
            if (i == 1)
            resault = Double.toString(coeffs[i])+"("+Integer.toString(i)+")"+"x"+"+"+ resault;
            else if (i>1){
                resault = Double.toString(coeffs[i])+"("+Integer.toString(i)+")"+"x"+"^"+"("+(i)+")"+"+"+ resault;
            }
        }
        return  resault;
    }
    public MyPolinomial add(MyPolinomial right){
        int length = 0;
        if (right.coeffs.length>coeffs.length){
            length = coeffs.length;
        }
        length = right.coeffs.length;
        for (int i = 0; i<length; i++)
            coeffs[i] += right.coeffs[i];
        return this;
    }
    public double evaluate(double x){
        double resault = 0;
        for (int i = 0; i < coeffs.length; i++){
            if (i == 0){
                resault = coeffs[0];}
            if (i == 1)
                resault = coeffs[1]*i*x+resault;
            else if (i>1){
                resault = coeffs[i]*i*(Math.pow(x,i)) + resault;
            }
        }
        return resault;
    }
    public MyPolinomial multiple(MyPolinomial right){
        int length = 0;
        if (right.coeffs.length>coeffs.length){
            length = coeffs.length;
        }
        length = right.coeffs.length;
        for (int i = 0; i<length; i++)
            coeffs[i] *= right.coeffs[i];
        return this;
    }
}
