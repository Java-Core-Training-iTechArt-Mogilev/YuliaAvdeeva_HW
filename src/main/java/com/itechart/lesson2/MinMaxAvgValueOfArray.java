package main.java.com.itechart.lesson2;

public class MinMaxAvgValueOfArray {

    public double findMaxValue(double[] array) {
        double maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public double findMinValue(double[] array) {
        double minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public double findAvgValue(double[] array) {
        double avgValue;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avgValue = sum / array.length;
        return avgValue;
    }

    public void printMinMaxAvgValues(double[] array) {
        System.out.println("Max value is " + findMaxValue(array));
        System.out.println("Min value is " + findMinValue(array));
        System.out.println("Average value is " + findAvgValue(array));
    }
}