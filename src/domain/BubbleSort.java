package domain;

public class BubbleSort {
    //logical sorting - in-place algorithm
    //stable sort
    //O(n^2)
    //work from index 0
    //if [0] > [1] - swap or nothing
    //the biggest element will be placed at the end of the array during the first iteration

    //+ no need for extra memory
    //- degrades quickly


    public void sortAscFromFirstElement(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1])
                    swap(array, i, i + 1);
            }
        }
    }

    public void sortAscFromLastElement(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = array.length - 1; i > array.length - 1 - lastUnsortedIndex; i--) {
                if (array[i] < array[i - 1])
                    swap(array, i, i - 1);
            }
        }
    }


    public void sortDescFromFirstElement(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] < array[i + 1])
                    swap(array, i, i + 1);
            }
        }
    }

    public void sortDescFromLastElement(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = array.length - 1; i > array.length - 1 - lastUnsortedIndex; i--) {
                if (array[i] > array[i - 1])
                    swap(array, i, i - 1);
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        if (i == j)
            return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
