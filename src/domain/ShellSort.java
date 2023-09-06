package domain;

public class ShellSort {
    //variation of insertion sort
    //logical sorting - in-place algorithm
    //difficult to nail down the time complexity but better than O(n^2)
    //unstable sort
    //reduce shifting
    //gap (3^k-1)/2
    //when the gap is 1 it is Insertion Sort
    //can be used for Bubble and Insertion to improve the performance
    //+faster than insertion sort
    //-

    public void sortAsc(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }

        }
    }

    public void sortDesc(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] < newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
    }


}
