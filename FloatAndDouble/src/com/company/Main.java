package com.company;

public class Main {

    public static void main(String[] args) {

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;


        int myIntValue = 5 / 3;
        float myFloatValue =(float) 5 / 3 ;
        double myDoubleValue = 5.00 / 3.00 ;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

//        Convert Pounds to Kilograms

        double pounds = 200d;
        double result =  pounds * 0.45359237;
        System.out.println(result);


    }
}
