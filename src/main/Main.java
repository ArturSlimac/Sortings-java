package main;

import domain.MergeSort;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static int[] intArray = {20, 35, -15, 7, 55, 1, -22};

    public static void main(String[] args) {
        System.out.println("Before:");
        printArray(intArray);
        new MergeSort().sortAsdFromLeft(intArray, 0, intArray.length);
        System.out.println("After:");
        printArray(intArray);


    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}