package domain;

public class SelectionSort {
    //logical sorting - in-place algorithm
    //unstable sort
    //O(n^2)
    //index 0 is the first largest value
    //work from index 1
    //+ no need for extra memory, no much swapping as bubble, better than bubble
    //- unstable sort

    public void sortAscFromTheBeginning(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest])
                    largest = i;
                swap(array, largest, lastUnsortedIndex);
            }
        }
    }

    public void sortAscFromTheEnd(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = lastUnsortedIndex;

            for (int i = lastUnsortedIndex; i >= 0; i--) {
                if (array[i] > array[largest])
                    largest = i;
                swap(array, largest, lastUnsortedIndex);
            }
        }
    }

    public void sortDescFromTheBeginning(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int smallest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] < array[smallest])
                    smallest = i;
                swap(array, smallest, lastUnsortedIndex);
            }
        }
    }

    public void sortDescFromTheEnd(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int smallest = lastUnsortedIndex;

            for (int i = lastUnsortedIndex; i >= 0; i--) {
                if (array[i] < array[smallest])
                    smallest = i;
                swap(array, smallest, lastUnsortedIndex);
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
