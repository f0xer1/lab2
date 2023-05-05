package com.pablo.lab2;

import static java.lang.Math.*;

public class Calculator {
    public static  double calculate(double a, double b, double c, double d, String example){
        if (example.equals("example1")){
           return calculateFirstFunction(a,  b,  c,  d);
        }else if(example.equals("example2")){
            return calculateSecondFunction(a,  b,  c,  d);
        }else {
            return calculateThirdFunction(a,  b,  c,  d);
        }

    }
    public static double calculateFirstFunction(double a, double b, double c, double d) {
        return sqrt(abs(sin(a) - 4 * log(b) / pow(c, d)));
    }

    public static double calculateSecondFunction(double a, double b, double c, double d) {
        return 9 * asin(a) / cos(sqrt(abs(b))) + pow(2.43, d) + log(c);
    }

    public static double calculateThirdFunction(double a, double b, double c, double d) {
        return 3 * (log(abs(a / b)) + sqrt(cos(c) + pow(E, d)));
    }
}