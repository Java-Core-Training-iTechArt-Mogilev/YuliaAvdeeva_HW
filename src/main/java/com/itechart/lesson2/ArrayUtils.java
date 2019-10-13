package main.java.com.itechart.lesson2;

public class ArrayUtils {

    public static double[] createRandomArray(int size) {
        double[] array = new double[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static void printArray(double[] array) {
        String s = "";

        for (int i = 0; i < array.length; i++) {
            s += array[i] + " ";
        }
        System.out.println(s);
    }

    public static double findMaxValue(double[] array) {
        double maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static double findMinValue(double[] array) {
        double minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static double findAvgValue(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double[] bubbleSort(double[] array) {
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
}
