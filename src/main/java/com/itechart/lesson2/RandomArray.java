package main.java.com.itechart.lesson2;

import java.util.Scanner;

public class RandomArray {

    public double[] randomArray = createRandomArray();

    public int getArrayLenght() {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter array lenght:");
        int arrayLenght = in.nextInt();
        in.close();
        return arrayLenght;
    }

    public double[] createRandomArray() {
        double[] array = new double[getArrayLenght()];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public void printRandomArray(double[] array) {
        String s = "";

        System.out.println("Generated random array:");

        for (int i = 0; i < array.length; i++) {
            s += array[i] + " ";
        }
        System.out.println(s);
    }
}
