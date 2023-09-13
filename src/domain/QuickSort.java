package domain;

public class QuickSort {
    //divide and conquer
    //recursive
    //a pivot element
    //O(nlogn) or O(n^2) - worse but better than mergeSort
    //unstable
    //in place
    public void sortAsdFromLeft(int[] array, int start, int end) {
        if (end - start < 2)
            return;
        int pivotIndex = partition(array, start, end);
        sortAsdFromLeft(array, start, pivotIndex);
        sortAsdFromLeft(array, pivotIndex + 1, end);


    }

    private int partition(int[] array, int start, int end) {
        // using the first element
        int pivot = array[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && array[--j] >= pivot) {
            }

            if (i < j) {
                array[i] = array[j];
            }

            while (i < j && array[++i] <= pivot) {

            }
            if (i < j) {
                array[j] = array[i];
            }
        }

        array[j] = pivot;

        return j;
    }

    public void sortDescFromLeft(int[] array, int start, int end) {
        if (end - start < 2)
            return;
        int pivotIndex = partitionDesc(array, start, end);
        sortDescFromLeft(array, start, pivotIndex);
        sortDescFromLeft(array, pivotIndex + 1, end);

    }

    private int partitionDesc(int[] array, int start, int end) {
        // using the first element
        int pivot = array[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && array[--j] <= pivot) {
            }

            if (i < j) {
                array[i] = array[j];
            }

            while (i < j && array[++i] >= pivot) {

            }
            if (i < j) {
                array[j] = array[i];
            }
        }

        array[j] = pivot;

        return j;
    }

}
