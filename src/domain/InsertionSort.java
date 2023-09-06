package domain;

public class InsertionSort {
    //logical sorting - in-place algorithm
    //stable sort
    //O(n^2)
    //index 0 is sorted by default
    //work from index 1
    //compare an element with those in sorted partition
    //+ no need for extra memory, no much swapping as bubble, better than bubble
    //- still O(n^2)

    public void sortAscFromTheBeginning(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
    }

    public void sortAscFromTheEnd(int[] array) {
        for (int lastUnsortedIndex = array.length-2; lastUnsortedIndex >= 0; lastUnsortedIndex--) {
            int newElement = array[lastUnsortedIndex];
            int i;
            for (i = lastUnsortedIndex; i < array.length-1 && array[i + 1] < newElement; i++) {
                array[i] = array[i + 1];
            }
            array[i] = newElement;
        }
    }

    public void sortDescFromTheBeginning(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] < newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
    }

    public void sortDescFromTheEnd(int[] array) {
        for (int lastUnsortedIndex = array.length-2; lastUnsortedIndex >= 0; lastUnsortedIndex--) {
            int newElement = array[lastUnsortedIndex];
            int i;
            for (i = lastUnsortedIndex; i < array.length-1 && array[i + 1] > newElement; i++) {
                array[i] = array[i + 1];
            }
            array[i] = newElement;
        }
    }
}
