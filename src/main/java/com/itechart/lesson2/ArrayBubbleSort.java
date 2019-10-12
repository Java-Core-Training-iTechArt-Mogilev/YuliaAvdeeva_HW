package main.java.com.itechart.lesson2;

public class ArrayBubbleSort {

    public double[] bubbleSort(double[] array) {
        double tmp;

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {

                if (array[j - 1] > array[j]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public void printSortedArray(double[] array) {
        String s = "";

        System.out.println("Sorted array:");

        for (int i = 0; i < array.length; i++) {
            s += array[i] + " ";
        }
        System.out.println(s);
    }
}
