package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2; //  1 + 2 = 3
        System.out.println(result);
        int previousResult = result;
        result = result - 1;

        result = result * 10; // 2 * 10 = 20
//        System.out.println("2 * 10 = " + result);

        int topScore = 80;

        if (topScore <= 100){
//            System.out.println("BINGO");
        }

        int secondTopScore = 80;

        if(topScore > secondTopScore && topScore < 100){
//            System.out.println("greater than second top score and less than 100");
        }

        int newValue = 50;

        if(newValue == 50) {
//            System.out.println("this is an error");
        }

        boolean isCar = false;

        if(isCar){
//            System.out.println("this is not supposed to happen");
        }

        boolean wasCar = isCar ? true: false;

        if(wasCar){
//            System.out.println("wasCAr is true");
        }


        double firstVar = 20.00d;
        double secondVar = 80.00d;

        double totalVal = (firstVar + secondVar) * 100.00d;
        System.out.println("My Values total = " + totalVal);
        double theRemainder = totalVal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }


    }
}
