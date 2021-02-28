package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("My min value = " + myMinIntValue);
        System.out.println("My max value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min value = " + (myMinIntValue - 1));

        long myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinByteValue);
        System.out.println("Short Max Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        long myLongValue = 100L;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValue =(short) ( myMinShortValue / 2);

//        CHallenge Section #3 #28
        byte myNewByte = 10;
        short myNewShort = 20;
        int myNewInt = 50;

        long result =  50_000 + (10 * (myNewByte + myNewShort + myNewInt));
        System.out.println("Result of Challenge = " + result);

        





    }
}
