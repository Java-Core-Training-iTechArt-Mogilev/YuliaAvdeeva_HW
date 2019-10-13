package main.java.com.itechart;

import main.java.com.itechart.lesson2.ArrayUtils;

import java.util.Scanner;

public class Main {

    public static int getArrayLengthFromConsole() {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter array length:");
        int arrayLength = in.nextInt();
        in.close();
        return arrayLength;
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        double[] array = ArrayUtils.createRandomArray(getArrayLengthFromConsole());
        System.out.println("Generated array:");
        ArrayUtils.printArray(array);
        System.out.println("Min value is " + ArrayUtils.findMinValue(array));
        System.out.println("Max value is " + ArrayUtils.findMaxValue(array));
        System.out.println("Avg value is " + ArrayUtils.findAvgValue(array));
        System.out.println("Sorted array:");
        ArrayUtils.printArray(ArrayUtils.bubbleSort(array));

    }
}
