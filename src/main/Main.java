package main;

import domain.CountingSort;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static int[] intArray = {20, 35, -15, 7, 55, 1, -22};
    private static int[] intArrayCounting = {2, 9, 8, 2, 8, 7, 10, 4, 3};

    public static void main(String[] args) {
        System.out.println("Before:");
        printArray(intArrayCounting);
        new CountingSort().sort(intArrayCounting, 1, 10);
        System.out.println("After:");
        printArray(intArrayCounting);


    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}