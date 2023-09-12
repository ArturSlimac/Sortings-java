package domain;

public class MergeSort {
    //divide and conquer
    //recursive
    //Splitting (logical) and Merging (in extra array )
    //Splitting -> faster
    //Splitting till 1 element -> sorted!
    //O(nlogn)
    //Stable
    public void sortAsdFromLeft(int[] array, int start, int end) {
        if (end - start < 2)
            return;

        int mid = (start + end) / 2;
        sortAsdFromLeft(array, start, mid);
        sortAsdFromLeft(array, mid, end);
        mergeAsd(array, start, mid, end);

    }

    private void mergeAsd(int[] array, int start, int mid, int end) {
        if (array[mid - 1] <= array[mid]) //optimization
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];

        while (i < mid && j < end)
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++]; //"<=" -> stable

        //optimization 2
        //{32, 34}, {33, 36}
        //{32, 33, 34}, {36} - no need for the checking
        //BUT
        //{32, 36}, {33, 34}
        //{36}, {32, 33, 34}
        System.arraycopy(array, i, array, start + tempIndex, mid - i); // optimization
        System.arraycopy(temp, 0, array, start, tempIndex);
    }

    public void sortDescFromLeft(int[] array, int start, int end) {
        if (end - start < 2)
            return;

        int mid = (start + end) / 2;
        sortDescFromLeft(array, start, mid);
        sortDescFromLeft(array, mid, end);
        mergeDesc(array, start, mid, end);
    }

    private void mergeDesc(int[] array, int start, int mid, int end) {
        if (array[mid - 1] >= array[mid]) //optimization
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];

        while (i < mid && j < end)
            temp[tempIndex++] = array[i] >= array[j] ? array[i++] : array[j++]; //">=" -> stable

        //optimization 2
        //{32, 34}, {33, 36}
        //{32, 33, 34}, {36} - no need for the checking
        //BUT
        //{32, 36}, {33, 34}
        //{36}, {32, 33, 34}
        System.arraycopy(array, i, array, start + tempIndex, mid - i); // optimization
        System.arraycopy(temp, 0, array, start, tempIndex);
    }



}
