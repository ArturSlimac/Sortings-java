package domain;

import java.util.Arrays;

public class CountingSort {
    //makes assumptions about the data
    //doesn't use comparisons
    //counts the number of occurrences of each value
    //only with non-negative discrete values

    public void sort(int[] array, int min, int max) {
        int[] countArray = new int[max - min + 1];

        Arrays.stream(array).forEach(element->{
            countArray[element-min]++;
        });

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                array[j++] = i;
                countArray[i - min]--;
            }
        }

    }
}
