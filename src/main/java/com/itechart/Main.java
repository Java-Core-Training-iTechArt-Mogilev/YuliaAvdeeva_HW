package main.java.com.itechart;

import main.java.com.itechart.lesson2.ArrayBubbleSort;
import main.java.com.itechart.lesson2.MinMaxAvgValueOfArray;
import main.java.com.itechart.lesson2.RandomArray;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        RandomArray randomArray = new RandomArray();
        randomArray.printRandomArray(randomArray.randomArray);

        MinMaxAvgValueOfArray values = new MinMaxAvgValueOfArray();
        values.printMinMaxAvgValues(randomArray.randomArray);

        ArrayBubbleSort sort = new ArrayBubbleSort();
        sort.printSortedArray(sort.bubbleSort(randomArray.randomArray));
    }
}
